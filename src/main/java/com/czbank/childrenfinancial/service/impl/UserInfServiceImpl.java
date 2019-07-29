package com.czbank.childrenfinancial.service.impl;

import com.czbank.childrenfinancial.Utils.RedisUtil;
import com.czbank.childrenfinancial.dao.UserMngDao;
import com.czbank.childrenfinancial.mapper.UserInfMapper;
import com.czbank.childrenfinancial.po.UserInf;
import com.czbank.childrenfinancial.service.UserInfService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class UserInfServiceImpl implements UserInfService {
    @Autowired
    private UserInfMapper userInfMapper;

    @Autowired
    private UserMngDao userMngDao;

    @Autowired
    RedisUtil redisUtil;


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
        String  key = "user:" + userInf.getAccount();
        boolean haskey = redisUtil.hasKey(key);
        UserInf uf = new UserInf();
        Map<String, Object> reMap = new HashMap<>();
        if (haskey) {
            log.info("redis 数据源");
            reMap = (HashMap)redisUtil.get(key);
            log.info("reMap={}",reMap);
            return reMap;
        } else{
            uf = userInfMapper.selectByAccountPw(userInf);
            log.info(uf.toString());
            if(uf != null) {
                reMap.put("user", uf);
                reMap.put("status", "0");
            } else {
                reMap.put("status","1");
            }

            redisUtil.set(key, reMap);
            log.info("database 数据源");
            return reMap;
        }
    }
    @Override
    public int register(UserInf userInf){
        return userMngDao.register(userInf);
    }
}
