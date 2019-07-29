package com.czbank.childrenfinancial.service;

import com.czbank.childrenfinancial.po.BusiInf;

import java.util.List;
import java.util.Map;

public interface FinProductInfService {

    Map getProductInfo(String account);
    int purchaseProduct(String card,String prodId,Double amount,String period);
    List<BusiInf> queryProdHasBuyed(String account);
    Map querySumPropertyByAccount(String account);

    List testparams();
}
