package com.czbank.childrenfinancial.controller;

import com.alibaba.fastjson.JSON;
import com.czbank.childrenfinancial.po.UserInf;
import com.czbank.childrenfinancial.postput.LoginIn;
import com.czbank.childrenfinancial.service.UserInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;

@RestController
public class UserInfController {
    @Autowired
    private UserInfService userInfoService;
    //0insert
    @RequestMapping("/UserInfoInsert")
    public Object userInfoInsert(HttpServletRequest req, HttpServletResponse resp) {
        //接受
        String userId = req.getParameter("userId");
        String account = req.getParameter("account");
        String relatedAccount = req.getParameter("relatedAccount");
        String name = req.getParameter("name");
        String isParent = req.getParameter("isParent");
        String idCard = req.getParameter("idCard");
        String birthday = req.getParameter("birthday");
        String phoneNbr = req.getParameter("phoneNbr");
        String loginPw = req.getParameter("loginPw");
        String openTime = req.getParameter("openTime");
        UserInf UserInf = null;
        //封装
        try {
            UserInf = new UserInf(
                    userId,
                    account,
                    relatedAccount,
                    name,
                    isParent,
                    idCard,
                    birthday,
                    phoneNbr,
                    loginPw,
                    new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(openTime)
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(UserInf);
        //处理
        return userInfoService.userInfoInsert(UserInf);
    }

    //1delete
    @RequestMapping("/userInfoDelete")
    public Object userInfoDelete(HttpServletRequest req, HttpServletResponse resp) {
        //接受
        String userId = req.getParameter("userId");
        UserInf UserInf = null;
        //封装
        //处理
        return userInfoService.userInfoDelete(Integer.parseInt(userId));
    }

    //2update
    @RequestMapping("/userInfoUpdate")
    public Object userInfoUpdate(HttpServletRequest req, HttpServletResponse resp) {
        //接受
        String userId = req.getParameter("userId");
        String account = req.getParameter("account");
        UserInf tblUserInfo = new UserInf();
        tblUserInfo.setUserId(userId);
        tblUserInfo.setAccount(account);
        //封装
        //处理
        return userInfoService.userInfoUpdate(tblUserInfo);
    }

    //3selectOne
    @RequestMapping(value = "/userInfoSelectOne", method = RequestMethod.POST)
    public Object userInfoSelectOne(@RequestBody LoginIn login) {
        //接受
        String userId = login.getUserId();
        String account = login.getAccount();
        UserInf UserInf = new UserInf();
        UserInf.setUserId(userId);
        UserInf.setAccount(account);
        //封装
        //处理
        System.out.println("controller");
        return JSON.toJSONString(userInfoService.userInfoSelectOne(UserInf));
    }

    //4selectAll
    @RequestMapping(value = "/userInfoSelectAll")
    public Object userInfoSelectAll(HttpServletRequest req, HttpServletResponse resp) {
        //接受
        String np = req.getParameter("np");
        String size = req.getParameter("size");
        UserInf tblUserInfo = new UserInf();
        //封装
        //处理
        return JSON.toJSONString(userInfoService.userInfoSelectAll(Integer.parseInt(np),Integer.parseInt(size)));
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Object selectByAccountPw(@RequestBody LoginIn login){
        //接受
        String account = login.getAccount();
        String loginPw = login.getLoginPw();
        //封装
        UserInf userInf = new UserInf();
        userInf.setAccount(account);
        userInf.setLoginPw(loginPw);
        //处理
        return JSON.toJSONString(userInfoService.selectByAccountPw(userInf));
    }
}
