package com.czbank.childrenfinancial.controller;

import com.czbank.childrenfinancial.postput.LoginIn;
import com.czbank.childrenfinancial.postput.TransInfo;
import com.czbank.childrenfinancial.service.FinancialOpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(value = "/finOps")
public class FinancialOpsController {

    @Autowired
    private FinancialOpsService financialOpsService;

    @RequestMapping(value = "/getCardsByAccount")
    public Object getCardsByAccount(@RequestBody LoginIn loginIn){
        String account = loginIn.getAccount();
        List<String> cards = financialOpsService.getCardsByAccount(account);
        Map<Object,Object> reMap = new HashMap<>();
        if(cards.isEmpty()) reMap.put("status",-1);
        else {
            reMap.put("status",0);
            reMap.put("cards",cards);
        }
        return reMap;
    }

    @RequestMapping(value = "/transProcess")
    public Object transProcess(@RequestBody TransInfo transInfo){
        String fromCard = transInfo.getFromCard();
        String toCard = transInfo.getToCard();
        Double amount = transInfo.getAmount();

        System.out.println(fromCard + "-" + toCard + "-" + amount);
        int resultStatus = financialOpsService.transAccount(fromCard, toCard, amount);
        return resultStatus;
    }


//    测试获取date
    @RequestMapping(value = "/testdate")
    public void testDate(){
        financialOpsService.testGetDate();
    }
}
