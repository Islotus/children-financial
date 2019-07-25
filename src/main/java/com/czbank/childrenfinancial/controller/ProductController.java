package com.czbank.childrenfinancial.controller;

import com.czbank.childrenfinancial.service.ProductService;
import com.czbank.childrenfinancial.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product")
    public Object getProduct(HttpServletRequest request, HttpServletResponse response){

        HttpSession session = request.getSession();

        String account = (String)session.getAttribute("account");

        Map<Object, Object> reMap = productService.getProductInfo(account);


        return reMap;
    }

}
