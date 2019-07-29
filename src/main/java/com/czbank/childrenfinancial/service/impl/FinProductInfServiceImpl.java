package com.czbank.childrenfinancial.service.impl;

import com.czbank.childrenfinancial.mapper.FinProductInfMapper;
import com.czbank.childrenfinancial.mapper.FinancialOpsMapper;
import com.czbank.childrenfinancial.po.BusiInf;
import com.czbank.childrenfinancial.po.FinProductInf;
import com.czbank.childrenfinancial.po.SchedulerParams;
import com.czbank.childrenfinancial.service.FinProductInfService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
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
//        进行理财基金购买
        productMapper.purchaseProduct(busiId,userId,prodId,amount,updateTime,prodType,startTime,periodDayNum,card);
//        写入流水记录
        return 0;
    }

    @Override
    public List<BusiInf> queryProdHasBuyed(String account) {
        System.out.println("s层account：" + account);
//        System.out.println("S层输出：" + productMapper.queryProdHasBuyed(account));
//        log.info("" + productMapper.queryProdHasBuyed(account));
//        return productMapper.queryProdHasBuyed(account);
        String userId = (String)productMapper.getUserIdByAccount(account);
        log.info("userid:" + userId);
        List<BusiInf> res = productMapper.getBuyedProdByUserId(userId);
        log.info("res:" + res);
        return res;
    }


//    根据账户查询总资产
    @Override
    public Map<Object,Object> querySumPropertyByAccount(String account) {
//        financialOpsMapper
        return null;
    }


    public List<SchedulerParams> testparams(){
        List<SchedulerParams> paramsList = productMapper.getParams1();
        System.out.println(paramsList);

        return paramsList;
    }

}
