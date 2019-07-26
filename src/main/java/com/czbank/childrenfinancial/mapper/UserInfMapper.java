package com.czbank.childrenfinancial.mapper;

import com.czbank.childrenfinancial.po.UserInf;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
@Repository
public interface UserInfMapper extends Mapper<UserInf> {
    //0insert
    @Insert("insert into user_inf(userId,account,relatedAccount,name,isParent,idCard,birthday,phoneNbr,loginPw,openTime)" +
            "values(#{userId},#{account},#{relatedAccount},#{name},#{isParent},#{idCard},#{birthday},#{phoneNbr},#{loginPw},#{openTime})")
    public int userInfoInsert(UserInf userInf);
    //1delete
    @Delete("delete from user_inf where userId = #{userId}")
    public int userInfoDelete(int userId);
    //2update
    @Update("update user_inf set account = #{account} where userId = #{userId}")
    public int userInfoUpdate(UserInf userInf);
    //3selectOne
    @Select("select * from user_inf where USER_ID = #{userId} and ACCOUNT = #{account} limit 1")
    public UserInf userInfoSelectOne(UserInf userInf);
    //4selectAll
    @Select("select * from user_inf order by userId desc limit #{np},#{size}")
    public List<UserInf> userInfoSelectAll(@Param("np") int np, @Param("size") int size);

    //登录，根据账户密码查询，返回user_inf的信息
    @Select("select * from user_inf where ACCOUNT = #{account} and LOGIN_PW = #{loginPw} limit 1")
    public UserInf selectByAccountPw(UserInf userInf);

    //用户管理模块
    @Select("select * from user_inf where account=#{account} limit 1")
    UserInf selectOne(UserInf userInf);

    @Select("update user_inf set PHONE_NBR=#{phoneNbr} where ACCOUNT=#{account}")
    void updatePhoneNbr(String account, String phoneNbr);

    @Select("update user_inf set LOGIN_PW=#{loginPw} where ACCOUNT=#{account}")
    void updateLoginPw(String account, String loginPw);








}
