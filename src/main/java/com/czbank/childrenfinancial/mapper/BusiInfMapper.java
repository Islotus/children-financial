package com.czbank.childrenfinancial.mapper;

import com.czbank.childrenfinancial.po.BusiInf;
import com.czbank.childrenfinancial.po.BusiInfExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface BusiInfMapper extends Mapper<BusiInf> {

    @Select("select * from BUSI_INF where USER_ID=#{userId} limit 1")
    BusiInf getBusiInfByUserId(String userId);

    @Select("select * from BUSI_INF where USER_ID=#{userId}")
    List<BusiInf> getBusiInfList(String userId);

    int countByExample(BusiInfExample example);

    int deleteByExample(BusiInfExample example);

    List<BusiInf> selectByExample(BusiInfExample example);

    int updateByExampleSelective(@Param("record") BusiInf record, @Param("example") BusiInfExample example);

    int updateByExample(@Param("record") BusiInf record, @Param("example") BusiInfExample example);
}