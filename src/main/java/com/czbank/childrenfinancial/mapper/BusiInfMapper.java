package com.czbank.childrenfinancial.mapper;

import com.czbank.childrenfinancial.po.BusiInf;
import com.czbank.childrenfinancial.po.BusiInfExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BusiInfMapper extends Mapper<BusiInf> {
    int countByExample(BusiInfExample example);

    int deleteByExample(BusiInfExample example);

    List<BusiInf> selectByExample(BusiInfExample example);

    int updateByExampleSelective(@Param("record") BusiInf record, @Param("example") BusiInfExample example);

    int updateByExample(@Param("record") BusiInf record, @Param("example") BusiInfExample example);
}