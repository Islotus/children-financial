package com.czbank.childrenfinancial.service.impl;

import com.czbank.childrenfinancial.Utils.SnowFlake;
import com.czbank.childrenfinancial.mapper.FinancialOpsMapper;
import com.czbank.childrenfinancial.service.FinancialOpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.Date;
import java.util.List;

@Service
public class FinancialOpsServiceImpl implements FinancialOpsService {

    @Autowired
    private FinancialOpsMapper financialOpsMapper;


    @Override
    public List<String> getCardsByAccount(String account) {
        List<String> cards = financialOpsMapper.getCardsByAccount(account);
        return cards;
    }

    @Override
    @Transactional
//    返回0代表成功转账，返回-1代表余额不足，返回-2代表转出户不存在
    public int transAccount(String fromCard, String toCard, Double amount) {

        double fromAmt = financialOpsMapper.getAmt(fromCard);
        if(fromAmt < amount) return -1;

        int isCardExisted = financialOpsMapper.isCardExisted(toCard);
        if(isCardExisted == 0) return -2;

//        在数据库中更新数据，并保存流水记录
        expense(fromCard, amount);
        income(toCard,amount);
        addRecord(fromCard,toCard,amount);

        return 0;
    }

    @Override
    public void expense(String card, Double amount) {
        financialOpsMapper.expenseUpdate(card,amount);
    }

    @Override
    public void income(String card, Double amount) {
        financialOpsMapper.incomeUpdate(card,amount);
    }

    @Override
    public void addRecord(String fromCard, String toCard, Double amount) {

        long l = System.currentTimeMillis();
//        定义流水生成时间
        Date genDate = new Date(l);

        String fromAccount = financialOpsMapper.getAccountByCard(fromCard);
        String toAccount = financialOpsMapper.getAccountByCard(toCard);
        System.out.println("fromAccount:"+fromAccount+",fromCard:"+fromCard+",toAccount:"+toAccount+",toCard:"+toCard+",amount:"+"date:"+genDate+".");
        financialOpsMapper.addTransRecord(generateId(8),fromAccount,toAccount,fromCard,toCard,amount,financialOpsMapper.getAmt(fromCard),"00",genDate);
        financialOpsMapper.addTransRecord(generateId(8),toAccount,fromAccount,toCard,fromCard,amount,financialOpsMapper.getAmt(toCard),"01",genDate);
    }

    public static String generateId(int length){
        long id = SnowFlake.nextId();
        String idString = id + "";
        return idString.substring(idString.length()-length,idString.length());
    }
}
