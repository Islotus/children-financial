package com.czbank.childrenfinancial.controller;

import com.czbank.childrenfinancial.postput.LoginIn;
import com.czbank.childrenfinancial.postput.ProdBuyInfo;
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
@RequestMapping(value = "/finProd")
public class FinProductInfController {

    @Autowired
    private FinProductInfService productService;

    @RequestMapping(value = "/getProductInfo")
    public Object getProductInfo(@RequestBody LoginIn loginIn, HttpServletRequest request){
        HttpSession session = request.getSession();
//        String account = (String)session.getAttribute("account");
//        Map<Object, Object> reMap = productService.getProductInfo(account);
        Map<Object, Object> reMap = productService.getProductInfo(loginIn.getAccount());
        return reMap;
    }

    @RequestMapping(value = "/purchaseProduct")
    public Object purchaseProduct(@RequestBody ProdBuyInfo prodBuyInfo){
        String card = prodBuyInfo.getCard();
        String prodId = prodBuyInfo.getProdId();
        String amountStr = prodBuyInfo.getAmount();
        Double amount = Double.parseDouble(amountStr);
        String period = prodBuyInfo.getPeriod();

        int r = productService.purchaseProduct(card,prodId,amount,period);
        String resultStatus = String.valueOf(r);

        return resultStatus;
    }

    @RequestMapping(value = "testparams")
    public void testparams(){
        productService.testparams();
    }

}
