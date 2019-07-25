package com.czbank.childrenfinancial.po;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "profit_inf")
public class ProfitInf {
    /**
     * 账号
     */
    @Column(name = "ACCOUNT")
    private String account;

    /**
     * 收益
     */
    @Column(name = "PROFIT")
    private BigDecimal profit;

    /**
     * 产品类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 产品编号
     */
    @Column(name = "PRODUCT_ID")
    private String productId;

    /**
     * 录入时间
     */
    @Column(name = "ADD_TIME")
    private Date addTime;

    /**
     * 获取账号
     *
     * @return ACCOUNT - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取收益
     *
     * @return PROFIT - 收益
     */
    public BigDecimal getProfit() {
        return profit;
    }

    /**
     * 设置收益
     *
     * @param profit 收益
     */
    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    /**
     * 获取产品类型
     *
     * @return TYPE - 产品类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置产品类型
     *
     * @param type 产品类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取产品编号
     *
     * @return PRODUCT_ID - 产品编号
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置产品编号
     *
     * @param productId 产品编号
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取录入时间
     *
     * @return ADD_TIME - 录入时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置录入时间
     *
     * @param addTime 录入时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
