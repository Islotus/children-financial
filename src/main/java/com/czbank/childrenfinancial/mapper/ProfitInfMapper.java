package com.czbank.childrenfinancial.mapper;

import com.czbank.childrenfinancial.po.ProfitInf;
import com.czbank.childrenfinancial.po.ProfitInfExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ProfitInfMapper extends Mapper<ProfitInf> {
    int countByExample(ProfitInfExample example);

    int deleteByExample(ProfitInfExample example);

    List<ProfitInf> selectByExample(ProfitInfExample example);

    int updateByExampleSelective(@Param("record") ProfitInf record, @Param("example") ProfitInfExample example);

    int updateByExample(@Param("record") ProfitInf record, @Param("example") ProfitInfExample example);
}