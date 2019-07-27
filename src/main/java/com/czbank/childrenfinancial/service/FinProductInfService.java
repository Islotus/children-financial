package com.czbank.childrenfinancial.service;

import java.util.Map;

public interface FinProductInfService {

    Map getProductInfo(String account);
    int purchaseProduct(String card,String prodId,Double amount,String period);
}
