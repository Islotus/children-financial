package com.czbank.childrenfinancial.service.impl;

import com.czbank.childrenfinancial.Utils.SnowFlake;
import com.czbank.childrenfinancial.mapper.FinancialOpsMapper;
import com.czbank.childrenfinancial.service.FinancialOpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service("financialOpsService")
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
//    返回0代表成功转账，返回-1代表余额不足，返回-2代表转出户不存在,返回-3代表今日额度已经用完
    public int transAccount(String fromCard, String toCard, Double amount) {

        double fromAmt = financialOpsMapper.getAmt(fromCard);
        if(fromAmt < amount) return -1;

        int isCardExisted = financialOpsMapper.isCardExisted(toCard);
        if(isCardExisted == 0) return -2;

        boolean ile = isLimitEnough(fromCard,amount);
        if(!ile) return -3;

//        没有任何逻辑错误，正常完成转账操作
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

//    根据卡号判断限额是否足够
    private boolean isLimitEnough(String card,Double amount){

        double limit = financialOpsMapper.getLimit(card);
        if(limit == -1.0) return true;//如果没有限制，直接返回限额足够

        double hasUsed = financialOpsMapper.getHasUsedAmountLimit(card);//已用额度
        double rest = limit - hasUsed;//剩余额度
        if(amount > rest) return false;
        return true;
    }

//    测试获取date日期并打印
    public void testGetDate(){
        String id = "XXLCJ001";
        Date d = financialOpsMapper.getDate(id);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        int day = calendar.get(calendar.DATE);

        System.out.println(d);
        System.out.println(day);
    }
}
