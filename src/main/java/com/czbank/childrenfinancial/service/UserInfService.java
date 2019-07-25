package com.czbank.childrenfinancial.service;

import com.czbank.childrenfinancial.po.UserInf;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfService {
    //0insert
    public int userInfoInsert(UserInf tblUserInfo);
    //1delete
    public int userInfoDelete(int userId);
    //2update
    public int userInfoUpdate(UserInf tblUserInfo);
    //3selectOne
    public UserInf userInfoSelectOne(UserInf tblUserInfo);
    //4selectAll
    public List<UserInf> userInfoSelectAll(int np, int size);
    //登录，根据账户密码查询，返回user_inf的信息
    public UserInf selectByAccountPw(UserInf userInf);


}
