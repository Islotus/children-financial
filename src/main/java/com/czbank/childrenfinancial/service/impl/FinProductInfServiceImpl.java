package com.czbank.childrenfinancial.service.impl;

import com.czbank.childrenfinancial.mapper.FinProductInfMapper;
import com.czbank.childrenfinancial.mapper.FinancialOpsMapper;
import com.czbank.childrenfinancial.po.FinProductInf;
import com.czbank.childrenfinancial.po.SchedulerParams;
import com.czbank.childrenfinancial.service.FinProductInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("finProductInfService")
public class FinProductInfServiceImpl implements FinProductInfService {

    @Autowired
    private FinProductInfMapper productMapper;
    @Autowired
    private FinancialOpsMapper financialOpsMapper;

    public Map getProductInfo(String account){
        String riskLevel = productMapper.getIsParent(account);
        List<FinProductInf> fpiList = productMapper.getProductInf(riskLevel);
        for(FinProductInf fpi : fpiList){
            String rl = fpi.getRiskLevel();
            switch (rl){
                case "1" : fpi.setRiskLevel("低"); break;
                case "2" : fpi.setRiskLevel("中"); break;
                case "3" : fpi.setRiskLevel("高");
            }
//            format一下
//            String s = fpi.getEndDate().toString().substring(0,11);
//            System.out.println(s);
//            Date date = Date.valueOf(s);
//            System.out.println(date);
//            fpi.setEndDate(date);


        }
        Map<Object, Object> reMap = new HashMap<>();
        if(!fpiList.isEmpty()){
            reMap.put("product",fpiList);
            reMap.put("status","0");
        }
        else reMap.put("status","1");
        return reMap;
    }

    @Override
    @Transactional
    public int purchaseProduct(String card,String prodId, Double amount, String period) {

//        如果购买金额大于余额，则返回失败
        Double balance = financialOpsMapper.getAmt(card);
        if(balance < amount) return -1;

//        更新余额（购买扣款）
        financialOpsMapper.expenseUpdate(card, amount);

        String busiId = FinancialOpsServiceImpl.generateId(8);
        String userId = productMapper.getUserIdByCard(card);
        Date updateTime = new Date(System.currentTimeMillis());
        Date startTime = new Date(System.currentTimeMillis());
        String prodType = productMapper.getProdTypeByProdId(prodId);
        int periodDayNum = 0;
        if(period != null) {
            switch (period) {
                case "每周":
                    periodDayNum = 7;
                    break;
                case "每两周":
                    periodDayNum = 14;
                    break;
                case "每月":
                    periodDayNum = 30;
                    break;
                case "每季度":
                    periodDayNum = 90;
                    break;
                case "每年":
                    periodDayNum = 365;
                    break;
                default:
                    periodDayNum = 0;
            }
        }
        productMapper.purchaseProduct(busiId,userId,prodId,amount,updateTime,prodType,startTime,periodDayNum,card);
        return 0;
    }

    public List<SchedulerParams> testparams(){
        List<SchedulerParams> paramsList = productMapper.getParams1();
        System.out.println(paramsList);

        return paramsList;
    }

}
