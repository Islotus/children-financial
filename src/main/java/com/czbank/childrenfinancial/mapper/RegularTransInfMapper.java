package com.czbank.childrenfinancial.mapper;

import com.czbank.childrenfinancial.po.RegularTransInf;
import com.czbank.childrenfinancial.po.RegularTransInfExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RegularTransInfMapper extends Mapper<RegularTransInf> {
    int countByExample(RegularTransInfExample example);

    int deleteByExample(RegularTransInfExample example);

    List<RegularTransInf> selectByExample(RegularTransInfExample example);

    int updateByExampleSelective(@Param("record") RegularTransInf record, @Param("example") RegularTransInfExample example);

    int updateByExample(@Param("record") RegularTransInf record, @Param("example") RegularTransInfExample example);
}