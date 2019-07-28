package com.czbank.childrenfinancial.controller;

import com.czbank.childrenfinancial.postput.LoginIn;
import com.czbank.childrenfinancial.postput.TransInfo;
import com.czbank.childrenfinancial.service.FinancialOpsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class FinancialOpsController {

    @Autowired
    private FinancialOpsService financialOpsService;

    @RequestMapping(value = "/getCardsByAccount")
    @ApiOperation(value = "查询理财产品",notes = "根据用户账号查询理财产品")
    public Object getCardsByAccount(@RequestBody LoginIn loginIn){
        String account = loginIn.getAccount();
        List<String> cards = financialOpsService.getCardsByAccount(account);
        return cards;
    }

    @RequestMapping(value = "/transProcess")
    @ApiOperation(value = "转账",notes = "用户转账")
    public Object transProcess(@RequestBody TransInfo transInfo){
        String fromCard = transInfo.getFromCard();
        String toCard = transInfo.getToCard();
        Double amount = transInfo.getAmount();

        System.out.println(fromCard + "-" + toCard + "-" + amount);
        int resultStatus = financialOpsService.transAccount(fromCard, toCard, amount);
        return resultStatus;
    }

}
