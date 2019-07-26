package com.czbank.childrenfinancial.service.impl;

import com.czbank.childrenfinancial.Utils.SnowFlake;
import com.czbank.childrenfinancial.dao.UserMngDao;
import com.czbank.childrenfinancial.po.BusiInf;
import com.czbank.childrenfinancial.po.CardInf;
import com.czbank.childrenfinancial.po.LsInf;
import com.czbank.childrenfinancial.po.UserInf;
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

    @Autowired
    UserMngDao userMngDao;

    @Override
    public UserInf queryUserInf(String account) {

        UserInf userInf = new UserInf();
        try {
            userInf = userMngDao.getUserInfByAccount(account);
        } catch(Exception e) {
            log.error(e.toString());
        }

        if (userInf == null) {
            log.error("查询结果为null");
        }
        log.info("查询结果为：" + userInf.toString());
        //此处查出时间格式有问题 需要转换时间格式
        //TODO....

        return userInf;
    }

    @Override
    public String settleBankCard(String account, String cardNbr, String payPw) {

        UserInf userInf = userMngDao.getUserInfByAccount(account);
        if (userInf == null) {
            log.error("账户不存在");
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

        return "000000";
    }

    @Override
    public Map<String, String> getRemainAmt(String account) {
        UserInf userInf = userMngDao.getUserInfByAccount(account);
        if (userInf == null) {
            throw new RuntimeException("账号查询不存在");
        }

        CardInf cardInf = userMngDao.getCardInfByUserId(userInf.getUserId());
        if (cardInf != null) {
            log.info("卡信息：" + cardInf.toString());
            log.info("卡余额：" + cardInf.getAmt());
        } else {
            throw new RuntimeException("查询卡信息为空");
        }

        BusiInf busiInf = userMngDao.getBusiInfByUserId(userInf.getUserId());
        if (busiInf != null) {
            log.info("用户办理的理财产品信息：" + busiInf.toString());
            log.info("理财产品余额：" + busiInf.getAmt());
        } else {
            throw new RuntimeException("查询理财信息为空");
        }

        Map<String, String> amtMap = new HashMap<>();
        amtMap.put("cardAmt", cardInf.getAmt().toPlainString());
        amtMap.put("finAmt", busiInf.getAmt().toPlainString());

        return amtMap;
    }

    @Override
    public List<LsInf> queryLsDetail(String account, int pageNum, int pageSize) {
        List<LsInf> lsList = new ArrayList<>();
        lsList = userMngDao.queryLsInfByAccount(account, (pageNum - 1) * pageSize, pageSize);
        log.info(lsList.toString());

        return lsList;
    }

    @Override
    public String maintainUserInf(String account, String phoneNbr) {
        String msg = "000000";
        UserInf userInf = userMngDao.getUserInfByAccount(account);
        if (userInf == null) {
            msg = "ErrMsg：" + "账号不存在, 无法进行信息维护";
            log.error(msg);
            throw new RuntimeException(account + msg);
        }
        log.info("账号存在准备进行信息维护..." + userInf.toString());
        if (userInf.getPhoneNbr().equals(phoneNbr)) {
            msg = "新的手机号码与原手机号码相同，无需更新";
            log.error(msg);
            throw new RuntimeException(phoneNbr + msg);
        }

        userInf.setPhoneNbr(phoneNbr);
        try {
            userMngDao.maintainUserInf(userInf);
        } catch(Exception e) {
            msg = e.toString();
            log.error(msg);
        }

        log.info("信息维护成功！" + phoneNbr);

        return msg;
    }

    @Override
    public String maintainLoginPw(String account, String oriPw, String newPw) {
        String msg = "000000";
        UserInf userInf = userMngDao.getUserInfByAcctAndPw(account, oriPw);
        if (userInf == null) {
            msg = "ErrMsg：" + "账号不存在, 无法进行信息维护";
            log.error(msg);
            throw new RuntimeException(account + msg);
        }
        log.info("账号存在准备进行信息维护..." + userInf.toString());
        if (userInf.getLoginPw().equals(newPw)) {
            msg = "新的登陆密码与原登录密码相同，无需更新";
            log.error(msg);
            throw new RuntimeException(oriPw + msg);
        }

        try {
            userMngDao.maintainLoginPw(account, newPw);
        } catch(Exception e) {
            msg = e.toString();
            log.error(msg);
        }

        log.info("信息维护成功！" + newPw);

        return msg;
    }

    @Override
    public Map<String, Object> querySonAcctByParentAcct(String pAcct) {
        UserInf parent = queryUserInf(pAcct);
        String sonAcct = "";
        if (PARENT.equals(parent.getIsParent())) {
            //父母身份
            sonAcct = parent.getRelatedAccount();
            if (StringUtils.isEmpty(sonAcct)) {
                throw new RuntimeException("子账户为空，未绑定子账户");
            }
        } else {
            throw new RuntimeException("该账号为子账号，无孙子账号存在");
        }

        Map<String, String> amt = getRemainAmt(sonAcct);
        Map<String, Object> sonInf = new HashMap<>();
        sonInf.putAll(amt);
        UserInf sonUserInf = queryUserInf(sonAcct);
        sonInf.put("sonUserInf", sonUserInf);
        log.info(sonInf.toString());

        return sonInf;
    }
}
