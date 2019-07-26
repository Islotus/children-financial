package com.czbank.childrenfinancial.controller;

import com.czbank.childrenfinancial.postput.LoginIn;
import com.czbank.childrenfinancial.service.FinProductInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;
@CrossOrigin
@RestController
public class FinProductInfController {

    @Autowired
    private FinProductInfService productService;

    @RequestMapping(value = "/product")
    public Object getProduct(@RequestBody LoginIn loginIn, HttpServletRequest request){
        HttpSession session = request.getSession();
//        String account = (String)session.getAttribute("account");
//        Map<Object, Object> reMap = productService.getProductInfo(account);
        Map<Object, Object> reMap = productService.getProductInfo(loginIn.getAccount());
        return reMap;
    }


}
