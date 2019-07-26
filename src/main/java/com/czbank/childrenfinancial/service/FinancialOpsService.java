package com.czbank.childrenfinancial.service;

import java.util.List;

public interface FinancialOpsService {

    List<String> getCardsByAccount(String account);
//    转账
    int transAccount(String fromAccount,String toAccount,Double amount);
//    支出
    void expense(String account,Double amount);
//    收入
    void income(String account,Double amount);

//    增加流水记录
    void addRecord(String fromAccount,String toAccount,Double amount);
}
