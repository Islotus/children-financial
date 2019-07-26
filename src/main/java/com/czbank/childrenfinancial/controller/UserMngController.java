package com.czbank.childrenfinancial.controller;

import com.alibaba.fastjson.JSON;
import com.czbank.childrenfinancial.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UserMngController {
    @Autowired
    UserManagementService userManagementService;

    /**
     * 查询用户基本信息-用户表
     * In：account
     * Out：UserInf
     */
    @RequestMapping("/queryUserInf")
    public Object queryUserInf(HttpServletRequest req, HttpServletResponse resp) {
        //接受
        String account = req.getParameter("account");
        //处理
        return JSON.toJSONString(userManagementService.queryUserInf(account));
    }

    /**
     * 用户手机号维护-用户表
     * @param req
     * @return 000000表示更新成功
     */
    @RequestMapping("/maintainUserPhoneNbr")
    public Object maintainUserPhoneNbr(HttpServletRequest req, HttpServletResponse resp) {
        String account = req.getParameter("account");
        String phoneNbr = req.getParameter("phoneNbr");

        return JSON.toJSONString(userManagementService.maintainUserInf(account, phoneNbr));
    }

    /**
     * 用户密码维护-用户表
     * @param req
     * @return 000000表示更新成功
     */
    @RequestMapping("/maintainUserLoginPw")
    public Object maintainUserLoginPw(HttpServletRequest req, HttpServletResponse resp) {
        String account = req.getParameter("account");
        String oriPw = req.getParameter("oriPw");
        String newPw = req.getParameter("newPw");

        return JSON.toJSONString(userManagementService.maintainLoginPw(account, oriPw, newPw));
    }

    /**
     * 账号流水查询-流水表
     * @param req
     * @return 000000表示更新成功
     */
    @RequestMapping("/queryLsInf")
    public Object queryLsInf(HttpServletRequest req, HttpServletResponse resp) {
        String account = req.getParameter("account");
        String pageSize = req.getParameter("ps");
        String pageNum = req.getParameter("pn");

        return JSON.toJSONString(userManagementService.queryLsDetail(account, Integer.parseInt(pageNum), Integer.parseInt(pageSize)));
    }

    /**
     * 银行卡绑定-卡表
     * @param req
     * @return 000000表示更新成功
     */
    @RequestMapping("/settleBankCard")
    public Object settleBankCard(HttpServletRequest req, HttpServletResponse resp) {
        String account = req.getParameter("account");
        String cardNbr = req.getParameter("cardNbr");
        String payPw = req.getParameter("payPw");

        return JSON.toJSONString(userManagementService.settleBankCard(account, cardNbr, payPw));
    }

    /**
     * 余额查询-卡表和理财表
     * @param req
     * @param resp
     * @return
     */
    @RequestMapping("/queryRemainAmt")
    public Object queryRemainAmt(HttpServletRequest req, HttpServletResponse resp) {
        String account = req.getParameter("account");
        String pn = req.getParameter("pn");
        String ps = req.getParameter("ps");

        return JSON.toJSONString(userManagementService.getRemainAmt(account));
    }
}
