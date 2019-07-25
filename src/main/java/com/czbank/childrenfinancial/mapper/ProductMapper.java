package com.czbank.childrenfinancial.mapper;


import com.czbank.childrenfinancial.po.FinProductInf;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {

//    查询是父母还是小孩
    @Select("select IS_PARENT from user_inf where ACCOUNT = #{account}")
    public String getIsParent(String account);

//    根据是父母还是小孩来查询理财产品
    @Select(("select * from fin_product_inf where RISK_LEVEL = #{riskLevel}"))
    public List<FinProductInf> getProductInf(String riskLevel);
}
