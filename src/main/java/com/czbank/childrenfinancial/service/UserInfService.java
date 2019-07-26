package com.czbank.childrenfinancial.service;

import com.czbank.childrenfinancial.po.UserInf;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserInfService {
    //0insert
    public int userInfInsert(UserInf tblUserInf);
    //1delete
    public int userInfDelete(int userId);
    //2update
    public int userInfUpdate(UserInf tblUserInf);
    //3selectOne
    public UserInf userInfSelectOne(UserInf tblUserInf);
    //4selectAll
    public List<UserInf> userInfSelectAll(int np, int size);
    //登录，根据账户密码查询，返回user_inf的信息
    public Map selectByAccountPw(UserInf userInf);
    //注册
    public int register(UserInf userInf);
}
