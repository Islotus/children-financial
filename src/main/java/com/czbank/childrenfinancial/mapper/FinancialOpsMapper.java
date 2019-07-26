package com.czbank.childrenfinancial.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface FinancialOpsMapper {

//    查询账户都有哪些卡
    @Select("select CARD_NBR from card_inf where USER_ID = (select USER_ID from user_inf where ACCOUNT = #{account})")
    List<String> getCardsByAccount(String account);

//    查询余额
    @Select("select AMT from CARD_INF where CARD_NBR = #{card}")
    double getAmt(String card);

//    查询是否有此卡号 0即为没有，1即为有
    @Select("select count(*) from CARD_INF where CARD_NBR = #{card}")
    int isCardExisted(String card);

//    查询卡所属的账户
    @Select("select ACCOUNT from user_inf where USER_ID = (select USER_ID from card_inf where CARD_NBR = #{card})")
    String getAccountByCard(String card);

//    转出更新
    @Update("update card_inf set AMT = AMT - #{amount} where CARD_NBR = #{card}")
    void expenseUpdate(String card,Double amount);

//    转入更新
    @Update("update card_inf set AMT = AMT + #{amount} where CARD_NBR = #{card}")
    void incomeUpdate(String card,Double amount);

//    记录转账流水
    @Insert("insert into ls_inf values (#{id},#{fromAccount},#{toAccount},#{status},#{amt},#{remainAmt},#{date},#{fromCard},#{toCard});")
    void addTransRecord(String id,String fromAccount, String toAccount, String fromCard, String toCard, Double amt, Double remainAmt, String status, Date date);


}
