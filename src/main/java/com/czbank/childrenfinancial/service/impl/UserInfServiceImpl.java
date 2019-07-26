package com.czbank.childrenfinancial.service.impl;

import com.alibaba.fastjson.JSON;
import com.czbank.childrenfinancial.mapper.UserInfMapper;
import com.czbank.childrenfinancial.po.UserInf;
import com.czbank.childrenfinancial.service.UserInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserInfServiceImpl implements UserInfService {
    @Autowired
    private UserInfMapper userInfMapper;


    @Override
    public int userInfInsert(UserInf UserInf) {
        return userInfMapper.userInfInsert(UserInf);
    }

    @Override
    public int userInfDelete(int userId) {
        return userInfMapper.userInfDelete(userId);
    }

    @Override
    public int userInfUpdate(UserInf UserInf) {
        return userInfMapper.userInfUpdate(UserInf);
    }

    @Override
    public UserInf userInfSelectOne(UserInf UserInf) {
        System.out.println("service-impl");
        return userInfMapper.userInfSelectOne(UserInf);
    }

    @Override
    public List<UserInf> userInfSelectAll(int np, int size) {
        return userInfMapper.userInfSelectAll((np-1)*size,size);
    }
    @Override
    public Map selectByAccountPw(UserInf userInf) {
        UserInf uf = userInfMapper.selectByAccountPw(userInf);
        Map<Object, Object> reMap = new HashMap<>();
        if(uf != null) {
            reMap.put("user", uf);
            reMap.put("status", "0");
        } else {
            reMap.put("status","1");
        }
        return reMap;
    }
    @Override
    public int register(UserInf userInf){
        return userInfMapper.register(userInf);
    }
}
