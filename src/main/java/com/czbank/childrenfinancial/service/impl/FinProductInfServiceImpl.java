package com.czbank.childrenfinancial.service.impl;

import com.czbank.childrenfinancial.mapper.FinProductInfMapper;
import com.czbank.childrenfinancial.po.FinProductInf;
import com.czbank.childrenfinancial.service.FinProductInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FinProductInfServiceImpl implements FinProductInfService {

    @Autowired
    private FinProductInfMapper productMapper;

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

}
