package com.czbank.childrenfinancial.service.impl;

import com.czbank.childrenfinancial.mapper.UserInfMapper;
import com.czbank.childrenfinancial.po.UserInf;
import com.czbank.childrenfinancial.service.UserInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfServiceImpl implements UserInfService {
    @Autowired
    private UserInfMapper userInfoMapper;


    @Override
    public int userInfoInsert(UserInf UserInf) {
        return userInfoMapper.userInfoInsert(UserInf);
    }

    @Override
    public int userInfoDelete(int userId) {
        return userInfoMapper.userInfoDelete(userId);
    }

    @Override
    public int userInfoUpdate(UserInf UserInf) {
        return userInfoMapper.userInfoUpdate(UserInf);
    }

    @Override
    public UserInf userInfoSelectOne(UserInf UserInf) {
        System.out.println("service-impl");
        return userInfoMapper.userInfoSelectOne(UserInf);
    }

    @Override
    public List<UserInf> userInfoSelectAll(int np, int size) {
        return userInfoMapper.userInfoSelectAll((np-1)*size,size);
    }
    @Override
    public UserInf selectByAccountPw(UserInf userInf) {
        System.out.println(userInfoMapper.selectByAccountPw(userInf));
        return userInfoMapper.selectByAccountPw(userInf);
    }
}
