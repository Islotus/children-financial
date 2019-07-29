package com.czbank.childrenfinancial.mapper;

import com.czbank.childrenfinancial.po.LsInf;
import com.czbank.childrenfinancial.po.LsInfExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
@Repository
public interface LsInfMapper extends Mapper<LsInf> {
    @Select("select * from LS_INF where OWN_ACCT=#{account} order by ADD_TIME  limit #{pn},#{ps}")
    public List<LsInf> queryLsInf(String account, int pn, int ps);

    int countByExample(LsInfExample example);

    int deleteByExample(LsInfExample example);

    List<LsInf> selectByExample(LsInfExample example);

    int updateByExampleSelective(@Param("record") LsInf record, @Param("example") LsInfExample example);

    int updateByExample(@Param("record") LsInf record, @Param("example") LsInfExample example);
}
