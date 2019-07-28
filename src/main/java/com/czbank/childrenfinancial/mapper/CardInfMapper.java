package com.czbank.childrenfinancial.mapper;

import com.czbank.childrenfinancial.po.CardInf;
import com.czbank.childrenfinancial.po.CardInfExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.math.BigDecimal;
import java.util.List;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface CardInfMapper extends Mapper<CardInf> {

    @Select("select * from CARD_INF where USER_ID=#{userId} limit 1")
    CardInf getCardInfByCardNbr(String userId);

    //如果本条记录有两条可能有问题，待完善
    @Update("update CARD_INF set CARD_INF.LIMIT=#{newLimit} where USER_ID=#{userId}")
    void updateLimitByUserId(String userId, BigDecimal newLimit);

    int countByExample(CardInfExample example);

    int deleteByExample(CardInfExample example);

    List<CardInf> selectByExample(CardInfExample example);

    int updateByExampleSelective(@Param("record") CardInf record, @Param("example") CardInfExample example);

    int updateByExample(@Param("record") CardInf record, @Param("example") CardInfExample example);
}