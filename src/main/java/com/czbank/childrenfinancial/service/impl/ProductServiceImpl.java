package com.czbank.childrenfinancial.service.impl;

import com.czbank.childrenfinancial.mapper.ProductMapper;
import com.czbank.childrenfinancial.po.FinProductInf;
import com.czbank.childrenfinancial.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    public Map getProductInfo(String account){
        String riskLevel = productMapper.getIsParent(account);
        List<FinProductInf> fpiList = productMapper.getProductInf(riskLevel);
        Map<Object, Object> reMap = new HashMap<>();
        if(!fpiList.isEmpty()){
            reMap.put("product",fpiList);
            reMap.put("status","0");
        }
        else reMap.put("status","1");
        return reMap;
    }

}
