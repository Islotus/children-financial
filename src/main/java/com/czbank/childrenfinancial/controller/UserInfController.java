package com.czbank.childrenfinancial.controller;

import com.alibaba.fastjson.JSON;
import com.czbank.childrenfinancial.po.UserInf;
import com.czbank.childrenfinancial.postput.LoginIn;
import com.czbank.childrenfinancial.service.UserInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
@CrossOrigin
@RestController
public class UserInfController {
    @Autowired
    private UserInfService userInfService;
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
        UserInf userInf = null;
        //封装
        try {
            userInf = new UserInf(
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
        System.out.println(userInf);
        //处理
        return userInfService.userInfInsert(userInf);
    }

    //1delete
    @RequestMapping("/userInfDelete")
    public Object userInfDelete(HttpServletRequest req, HttpServletResponse resp) {
        //接受
        String userId = req.getParameter("userId");
        UserInf UserInf = null;
        //封装
        //处理
        return userInfService.userInfDelete(Integer.parseInt(userId));
    }

    //2update
    @RequestMapping("/userInfUpdate")
    public Object userInfUpdate(HttpServletRequest req, HttpServletResponse resp) {
        //接受
        String userId = req.getParameter("userId");
        String account = req.getParameter("account");
        UserInf tblUserInf = new UserInf();
        tblUserInf.setUserId(userId);
        tblUserInf.setAccount(account);
        //封装
        //处理
        return userInfService.userInfUpdate(tblUserInf);
    }

    //3selectOne
    @RequestMapping(value = "/userInfSelectOne", method = RequestMethod.POST)
    public Object userInfSelectOne(@RequestBody LoginIn login) {
        //接受
        String userId = login.getUserId();
        String account = login.getAccount();
        UserInf userInf = new UserInf();
        userInf.setUserId(userId);
        userInf.setAccount(account);
        //封装
        //处理
        System.out.println("controller");
        return JSON.toJSONString(userInfService.userInfSelectOne(userInf));
    }

    //4selectAll
    @RequestMapping(value = "/userInfSelectAll")
    public Object userInfSelectAll(HttpServletRequest req, HttpServletResponse resp) {
        //接受
        String np = req.getParameter("np");
        String size = req.getParameter("size");
        UserInf tblUserInf = new UserInf();
        //封装
        //处理
        return JSON.toJSONString(userInfService.userInfSelectAll(Integer.parseInt(np),Integer.parseInt(size)));
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Object selectByAccountPw(@RequestBody LoginIn login,HttpServletRequest request) {
        String account = login.getAccount();
        String loginPw = login.getLoginPw();
        //封装
        UserInf userInf = new UserInf();
        userInf.setAccount(account);
        userInf.setLoginPw(loginPw);
        //处理
//        return JSON.toJSONString(userInfService.selectByAccountPw(userInf));
        HttpSession session = request.getSession();
        session.setAttribute("account",null);
        Map<Object,Object> reMap = userInfService.selectByAccountPw((userInf));
        boolean flag = ((String)(reMap.get("status"))).equals("0");
        if(flag){
            session.setAttribute("account",account);
        }
        System.out.println(session.getAttribute("account"));
        return reMap;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public int register(@RequestBody LoginIn login) {
        //接受
        String account = login.getAccount(); //账号
        String loginPw = login.getLoginPw();  //密码
        String name = login.getName();
        String birth = login.getBirth();
        String phone = login.getPhone();
        String idCard = login.getIdCard();
        //封装
        UserInf userInf = new UserInf();
        userInf.setAccount(account);
        userInf.setLoginPw(loginPw);
        userInf.setName(name);
        userInf.setBirthday(birth);
        userInf.setPhoneNbr(phone);
        userInf.setIdCard(idCard);
        System.out.println(userInf);
        //处理
        return userInfService.register(userInf);
    }
}
