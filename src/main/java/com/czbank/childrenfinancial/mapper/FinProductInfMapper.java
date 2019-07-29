package com.czbank.childrenfinancial.mapper;


import com.czbank.childrenfinancial.po.BusiInf;
import com.czbank.childrenfinancial.po.FinProductInf;
import com.czbank.childrenfinancial.po.SchedulerParams;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

@org.apache.ibatis.annotations.Mapper
@Repository
public interface FinProductInfMapper extends Mapper<FinProductInf> {

//    查询是父母还是小孩
    @Select("select IS_PARENT from user_inf where ACCOUNT = #{account}")
    String getIsParent(String account);

//    根据是父母还是小孩来查询理财产品
    @Select(("select * from fin_product_inf where RISK_LEVEL = #{riskLevel}"))
    List<FinProductInf> getProductInf(String riskLevel);

//    根据卡号查询用户编号
    @Select("select USER_ID from card_inf where CARD_NBR = #{card}")
    String getUserIdByCard(String card);

//    根据产品编号查询产品类型
    @Select("select product_type from fin_product_inf where PRODUCT_ID = #{prodId}")
    String getProdTypeByProdId(String prodId);

//    购买理财产品
    @Select("insert into busi_inf values (#{busiId},#{userId},#{prodId},#{amount},#{updateTime},#{prodType},#{startTime},#{periodDayNum},#{amount},#{card})")
    void purchaseProduct(String busiId, String userId, String prodId, Double amount, Date updateTime, String prodType, Date startTime, int periodDayNum,String card);

//    定时器所需参数查询
    @Select("select BUSI_ID,USER_ID,AMT,curdate() - date(UPD_TIME) as timediff,time_period,CARD_NBR from busi_inf")
    List<SchedulerParams> getParams1();

//    定投更新操作,再次购买理财产品
    @Update("update busi_inf set sum_amt = sum_amt + #{amt} where BUSI_ID = #{busiId}")
    void purchaseProdAgain(String busiId,double amt);

//    根据账号查询都购买了哪些理财产品
    @Select("select * from busi_inf where USER_ID = (select USER_ID from user_inf where ACCOUNT = #{account})")
//    @Select("select * from busi_inf where USER_ID = (select USER_ID from user_inf where ACCOUNT = '${account}')")
//    @Select("select * from busi_inf where USER_ID = (select USER_ID from user_inf where ACCOUNT = '1111111')")
//    @Select("select * from busi_inf where USER_ID = '1'")
    List<BusiInf> queryProdHasBuyed(String account);

//    根据卡号查询userId
    @Select("select USER_ID from user_inf where ACCOUNT = #{account}")
    Object getUserIdByAccount(String account);

//    根据UserId查询已经购买的理财产品
    @Select("select * from busi_inf where USER_ID = #{userId}")
    List<BusiInf> getBuyedProdByUserId(String userId);

    //根据productId查询product_desc
    @Select("select * from fin_product_inf where PRODUCT_ID = #{prodId}")
    FinProductInf getProductName(String prodId);
}
