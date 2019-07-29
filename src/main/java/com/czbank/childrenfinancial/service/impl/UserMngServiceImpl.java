package com.czbank.childrenfinancial.service.impl;

import com.czbank.childrenfinancial.Utils.SnowFlake;
import com.czbank.childrenfinancial.dao.UserMngDao;
import com.czbank.childrenfinancial.po.*;
import com.czbank.childrenfinancial.service.UserManagementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.*;

@Slf4j
@Service
public class UserMngServiceImpl implements UserManagementService {
    private static final String PARENT = "1";
    private static final String SON = "0";

    @Autowired
    UserMngDao userMngDao;

    private boolean checkNull(String ...args){
        for(String arg : args) {
            if (StringUtils.isEmpty(arg)) {
                log.error("输入[{}]为空", arg);
                return true;
            }
        }

        return false;
    }

    @Override
    public Map<String, Object> queryUserInf(String account) {
        String msg = "-1";
        Map<String, Object> retMap = new HashMap<>();
        if (checkNull(account)) {
            retMap.put("status", msg);
            return retMap;
        }

        UserInf userInf = new UserInf();
        try {
            userInf = userMngDao.getUserInfByAccount(account);
        } catch(Exception e) {
            log.error(e.toString());
        }

        if (userInf == null) {
            msg = "-1";
            log.error("查询结果为null");
            retMap.put("status", msg);
            return retMap;
        }

        msg = "1";
        retMap.put("userInf", userInf);
        retMap.put("status", msg);
        log.info("查询结果为：" + userInf.toString());
        //此处查出时间格式有问题 需要转换时间格式
        //TODO....

        return retMap;
    }

    @Override
    public Map<String, Object> settleBankCard(String account, String cardNbr, String payPw) {
        String msg = "-1";
        Map<String, Object> retMap = new HashMap<>();
        if (checkNull(account, cardNbr, payPw)) {
            retMap.put("status", msg);
            return retMap;
        }

        UserInf userInf = userMngDao.getUserInfByAccount(account);
        if (userInf == null) {
            log.error("账户不存在");
            retMap.put("status", msg);
            return retMap;
        }
        CardInf cardInf = new CardInf();
        //查出的来信息
        cardInf.setUserId(userInf.getUserId());
        cardInf.setIdCard(userInf.getIdCard());
        //固定的利率
        cardInf.setBaseRate(new BigDecimal(0.015));
        //传进来的卡号绑定
        cardInf.setCardNbr(cardNbr);
        //随机生成起始余额-失败了
        Random rd = new Random(1);
        BigDecimal amt = new BigDecimal(rd.nextInt(10000));
        cardInf.setAmt(amt);
        cardInf.setCardProName("浙商卡");
        cardInf.setCardType("1");
        cardInf.setPayPw(payPw);
        //雪花算法生成ID
        long id = SnowFlake.nextId();
        String cardId = "" + id;
        log.info("雪花算法生成的id长度" + cardId.length());
        cardId = cardId.substring(cardId.length() - 7, cardId.length());
        cardInf.setCardId(cardId);
        userMngDao.settleCardNbr(cardInf);
        msg = "1";
        retMap.put("status", msg);

        return retMap;
    }

    @Override
    public Map<String, Object> getRemainAmt(String account) {
        String msg = "-1";
        Map<String, Object> retMap = new HashMap<>();
        if (checkNull(account)) {
            retMap.put("status", msg);
            return retMap;
        }

        UserInf userInf = userMngDao.getUserInfByAccount(account);
        if (userInf == null) {
            retMap.put("status", msg);
            return retMap;
        }

        CardInf cardInf = userMngDao.getCardInfByUserId(userInf.getUserId());
        if (cardInf != null) {
            log.info("卡信息：" + cardInf.toString());
            log.info("卡余额：" + cardInf.getAmt());
        } else {
            retMap.put("status", msg);
            return retMap;
        }

        BusiInf busiInf = userMngDao.getBusiInfByUserId(userInf.getUserId());
        if (busiInf != null) {
            log.info("用户办理的理财产品信息：" + busiInf.toString());
            log.info("理财产品余额：" + busiInf.getAmt());
        } else {
            retMap.put("status", msg);
            return retMap;
        }

        retMap.put("cardAmt", cardInf.getAmt().toPlainString());
        retMap.put("finAmt", busiInf.getAmt().toPlainString());
        msg = "1";
        retMap.put("status", msg);


        return retMap;
    }

    @Override
    public Map<String, Object> queryLsDetail(String account, int pageNum, int pageSize) {
        String msg = "-1";
        Map<String, Object> retMap = new HashMap<>();
        if (checkNull(account)) {
            retMap.put("status", msg);
            return retMap;
        }

        List<LsInf> lsList = new ArrayList<>();
        lsList = userMngDao.queryLsInfByAccount(account, (pageNum - 1) * pageSize, pageSize);
        log.info(lsList.toString());
        retMap.put("lsList", lsList);
        msg = "1";
        retMap.put("status", msg);

        return retMap;
    }

    @Override
    public Map<String, Object> maintainUserInf(String account, String phoneNbr) {
        String msg = "-1";
        Map<String, Object> retMap = new HashMap<>();
        if (checkNull(account, phoneNbr)) {
            retMap.put("status", msg);
            return retMap;
        }

        UserInf userInf = userMngDao.getUserInfByAccount(account);
        if (userInf == null) {
            log.error("账号不存在, 无法进行信息维护");
            retMap.put("status", msg);
            return retMap;
        }
        log.info("账号存在准备进行信息维护..." + userInf.toString());
        if (userInf.getPhoneNbr().equals(phoneNbr)) {
            log.error("新的手机号码[{}]与原手机号码[{}]相同，无需更新", phoneNbr, userInf.getPhoneNbr());
            retMap.put("status", msg);
            return retMap;
        }

        userInf.setPhoneNbr(phoneNbr);
        try {
            userMngDao.maintainUserInf(userInf);
        } catch(Exception e) {
            log.error(e.toString());
            retMap.put("status", msg);
            return retMap;
        }
        log.info("信息维护成功！" + phoneNbr);
        msg = "1";
        retMap.put("status", msg);

        return retMap;
    }

    @Override
    public Map<String, Object> maintainLoginPw(String account, String oriPw, String newPw) {
        String msg = "-1";
        Map<String, Object> retMap = new HashMap<>();
        if (checkNull(account, oriPw, newPw)) {
            retMap.put("status", msg);
            return retMap;
        }

        UserInf userInf = userMngDao.getUserInfByAcctAndPw(account, oriPw);
        if (userInf == null) {
            log.error("账号不存在, 无法进行信息维护");
            retMap.put("status", msg);
            return retMap;
        }
        log.info("账号存在准备进行信息维护..." + userInf.toString());
        if (userInf.getLoginPw().equals(newPw)) {
            log.error("新的登陆密码与原登录密码相同，无需更新");
            retMap.put("status", msg);
            return retMap;
        }

        try {
            userMngDao.maintainLoginPw(account, newPw);
        } catch(Exception e) {
            log.error(e.toString());
            retMap.put("status", msg);
            return retMap;
        }

        log.info("信息维护成功！" + newPw);
        msg = "1";
        retMap.put("status", msg);

        return retMap;
    }

    @Override
    public Map<String, Object> querySonAcctByParentAcct(String pAcct) {
        String msg = "-1";
        Map<String, Object> retMap = new HashMap<>();
        if (checkNull(pAcct)) {
            retMap.put("status", msg);
            return retMap;
        }

        UserInf parent = userMngDao.getUserInfByAccount(pAcct);
        if (parent == null) {
            log.error("账号不存在, 无法进行信息维护");
            retMap.put("status", msg);
            return retMap;
        }

        String sonAcct = "";
        if (PARENT.equals(parent.getIsParent())) {
            //父母身份
            sonAcct = parent.getRelatedAccount();
            if (StringUtils.isEmpty(sonAcct)) {
                log.error("子账户为空,未绑定子账户");
                retMap.put("status", msg);
                return retMap;
            }
        } else {
            log.error("该账号为子账号，无孙子账号存在");
            retMap.put("status", msg);
            return retMap;
        }

        retMap.putAll(getRemainAmt(sonAcct));
        UserInf sonUserInf = userMngDao.getUserInfByAccount(sonAcct);
        retMap.put("sonUserInf", sonUserInf);
        log.info(retMap.toString());
        msg = "1";
        retMap.put("status", msg);

        return retMap;
    }

    @Override
    public Map<String, Object> setLimit(String account, String isSetParent, String limitStr) {
        String msg = "-1";
        Map<String, Object> retMap = new HashMap<>();
        if (checkNull(account, isSetParent, limitStr)) {
            retMap.put("status", msg);
            return retMap;
        }

        UserInf userInf = userMngDao.getUserInfByAccount(account);
        if (userInf == null) {
            log.error("账号为空");
            retMap.put("status", msg);
            return retMap;
        }

        if (SON.equals(userInf.getIsParent())) {
            log.error("账户[{}]为子账户，不支持限额修改", account);
            retMap.put("status", msg);
            return retMap;
        }

        log.info(userInf.toString());
        String userId = userInf.getUserId();
        if (isSetParent.equals(SON)) {
            //查询孩子userId
            UserInf sonInf = new UserInf();
            sonInf = userMngDao.getUserInfByAccount(userInf.getRelatedAccount());
            log.info(sonInf.toString());
            userId = sonInf.getUserId();
        }

        CardInf cardInf = userMngDao.getCardInfByUserId(userId);
        if (cardInf == null) {
            log.error("账号无绑定卡信息,无法进行限额设置");
            retMap.put("status", msg);
            return retMap;
        }

        BigDecimal limitDecimal = new BigDecimal(limitStr);
        limitDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        userMngDao.setLimitByUserId(userId, limitDecimal);
        log.info("限额设置成功");
        msg = "1";
        retMap.put("status", msg);

        return retMap;
    }

    @Override
    public Map<String, Object> getFinProdDetail(String account) {
        String msg = "-1";
        Map<String, Object> retMap = new HashMap<>();
        if (checkNull(account)) {
            retMap.put("status", msg);
            return retMap;
        }

        //TODO理财产品表跟业务表联查

        //查询userInf表获取userId
        UserInf userInf = userMngDao.getUserInfByAccount(account);
        if (userInf == null) {
            log.error("账号查询结果为空");
            retMap.put("status", msg);
            return retMap;
        }

        String userId = userInf.getUserId();
        BusiInf busiInf =  userMngDao.getBusiInfByUserId(userId);
        String productId = busiInf.getFinProductId();
        FinProductInf finProd = userMngDao.getFinProdIdInf(productId);
        retMap.put("prodName", finProd.getProductName());
        BigDecimal rate = finProd.getRate();
        rate = rate.multiply(new BigDecimal(100));
        String rateStr = rate.toPlainString() + " " + "%";
        retMap.put("rate", rateStr);
        log.info(rateStr);
        retMap.put("profit", busiInf.getProfit().toPlainString());
        msg = "1";
        retMap.put("status", msg);

        return retMap;
    }
}
