package com.czbank.childrenfinancial.controller;

import com.alibaba.fastjson.JSON;
import com.czbank.childrenfinancial.postput.UserMngIn;
import com.czbank.childrenfinancial.service.UserManagementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping(value = "/userMng")
public class UserMngController {
    @Autowired
    UserManagementService userManagementService;

    /**
     * 查询用户基本信息-用户表
     * In：account
     * Out：UserInf
     */
    @RequestMapping(value = "/queryUserInf")
    public Object queryUserInf(@RequestBody UserMngIn in) {
        //接受
        String account = in.getAccount();

        //处理
        return JSON.toJSONString(userManagementService.queryUserInf(account));
    }

    /**
     * 用户手机号维护-用户表
     * @param in
     * @return "1"表示更新成功
     */
    @RequestMapping(value = "/maintainUserPhoneNbr")
    public Object maintainUserPhoneNbr(@RequestBody UserMngIn in) {
        String account = in.getAccount();
        String phoneNbr = in.getPhoneNbr();

        return JSON.toJSONString(userManagementService.maintainUserInf(account, phoneNbr));
    }

    /**
     * 用户密码维护-用户表
     * @param in
     * @return "1"表示更新成功
     */
    @RequestMapping(value = "/maintainUserLoginPw")
    public Object maintainUserLoginPw(@RequestBody UserMngIn in) {
        String account = in.getAccount();
        String oriPw = in.getOriPw();
        String newPw = in.getNewPw();

        return JSON.toJSONString(userManagementService.maintainLoginPw(account, oriPw, newPw));
    }

    /**
     * 账号流水查询-流水表
     * @param in
     * @return "1"表示更新成功
     */
    @RequestMapping(value = "/queryLsInf")
    public Object queryLsInf(@RequestBody UserMngIn in) {
        String account = in.getAccount();
        String pageSize = in.getPs();
        String pageNum = in.getPn();

        return JSON.toJSONString(userManagementService.queryLsDetail(account, Integer.parseInt(pageNum), Integer.parseInt(pageSize)));
    }

    /**
     * 银行卡绑定-卡表
     * @param in
     * @return "1"表示更新成功
     */
    @RequestMapping(value = "/settleBankCard")
    public Object settleBankCard(@RequestBody UserMngIn in) {
        String account = in.getAccount();
        String cardNbr = in.getCardNbr();
        String payPw = in.getPayPw();

        return JSON.toJSONString(userManagementService.settleBankCard(account, cardNbr, payPw));
    }

    /**
     * 余额查询-卡表和理财表
     * @param in
     * @return
     */
    @RequestMapping(value = "/queryRemainAmt")
    public Object queryRemainAmt(@RequestBody UserMngIn in) {
        String account = in.getAccount();

        return JSON.toJSONString(userManagementService.getRemainAmt(account));
//        return userManagementService.getRemainAmt(account);
    }

    /**
     * 子账户查询-用户表
     * @param in
     * @return
     */
    @RequestMapping(value = "/querySonAcct")
    public Object querySonAcct(@RequestBody UserMngIn in) {
        String pAcct = in.getAccount();
        return JSON.toJSONString(userManagementService.querySonAcctByParentAcct(pAcct));
    }


    /**
     * 设置账户卡号的单日最高限额-卡表+用户表
     * @param in
     * @return
     */
    @RequestMapping(value = "/setLimit")
    public Object setLimit(@RequestBody UserMngIn in) {
        String account = in.getAccount();
        String isSetParent = in.getIsSetParent();
        String limit = in.getLimit();
        log.info("account=[{}], isSetParent=[{}], limit=[{}]", account, isSetParent, limit);

        return JSON.toJSONString(userManagementService.setLimit(account, isSetParent, limit));
    }

    /**
     * 已办理的理财详情查询-理财产品表+业务表
     * @param in
     * @return
     */
    @RequestMapping(value = "/queryFinDetail")
    public Object queryFinDetail(@RequestBody UserMngIn in) {
        String account = in.getAccount();

        Object o = userManagementService.getFinProdDetail(account);
        log.info(o.toString());

        return JSON.toJSONString(o);
    }

}
