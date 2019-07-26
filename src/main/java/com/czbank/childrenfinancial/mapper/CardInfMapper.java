package com.czbank.childrenfinancial.mapper;

import com.czbank.childrenfinancial.po.CardInf;
import com.czbank.childrenfinancial.po.CardInfExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface CardInfMapper extends Mapper<CardInf> {

    int countByExample(CardInfExample example);

    int deleteByExample(CardInfExample example);

    List<CardInf> selectByExample(CardInfExample example);

    int updateByExampleSelective(@Param("record") CardInf record, @Param("example") CardInfExample example);

    int updateByExample(@Param("record") CardInf record, @Param("example") CardInfExample example);
}