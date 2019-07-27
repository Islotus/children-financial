package com.czbank.childrenfinancial.mapper;


import com.czbank.childrenfinancial.po.FinProductInf;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface FinProductInfMapper {

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
    @Select("insert into busi_inf values (#{busiId},#{userId},#{prodId},#{amount},#{updateTime},#{prodType},#{startTime},#{periodDayNum})")
    void purchaseProduct(String busiId, String userId, String prodId, Double amount, Date updateTime, String prodType, Date startTime, int periodDayNum);

}
