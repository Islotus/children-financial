package com.czbank.childrenfinancial.po;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fin_product_inf")
public class FinProductInf {
    /**
     * 产品编号
     */
    @Column(name = "PRODUCT_ID")
    private String productId;

    /**
     * 绑定卡号
     */
    @Column(name = "SETTLE_CARDNBR")
    private String settleCardnbr;

    /**
     * 产品名称
     */
    @Column(name = "PRODUCT_NAME")
    private String productName;

    /**
     * 最低金额
     */
    @Column(name = "START_AMT")
    private BigDecimal startAmt;

    /**
     * 最高金额
     */
    @Column(name = "END_AMT")
    private BigDecimal endAmt;

    /**
     * 理财产品截止日期
     */
    @Column(name = "END_DATE")
    private Date endDate;

    /**
     * 利率
     */
    @Column(name = "RATE")
    private BigDecimal rate;

    /**
     * 最短周期
     */
    @Column(name = "SHORTEST_PERIOD")
    private Integer shortestPeriod;

    /**
     * 风险等级
     */
    @Column(name = "RISK_LEVEL")
    private String riskLevel;

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
     * 获取绑定卡号
     *
     * @return SETTLE_CARDNBR - 绑定卡号
     */
    public String getSettleCardnbr() {
        return settleCardnbr;
    }

    /**
     * 设置绑定卡号
     *
     * @param settleCardnbr 绑定卡号
     */
    public void setSettleCardnbr(String settleCardnbr) {
        this.settleCardnbr = settleCardnbr;
    }

    /**
     * 获取产品名称
     *
     * @return PRODUCT_NAME - 产品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置产品名称
     *
     * @param productName 产品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取最低金额
     *
     * @return START_AMT - 最低金额
     */
    public BigDecimal getStartAmt() {
        return startAmt;
    }

    /**
     * 设置最低金额
     *
     * @param startAmt 最低金额
     */
    public void setStartAmt(BigDecimal startAmt) {
        this.startAmt = startAmt;
    }

    /**
     * 获取最高金额
     *
     * @return END_AMT - 最高金额
     */
    public BigDecimal getEndAmt() {
        return endAmt;
    }

    /**
     * 设置最高金额
     *
     * @param endAmt 最高金额
     */
    public void setEndAmt(BigDecimal endAmt) {
        this.endAmt = endAmt;
    }

    /**
     * 获取理财产品截止日期
     *
     * @return END_DATE - 理财产品截止日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置理财产品截止日期
     *
     * @param endDate 理财产品截止日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取利率
     *
     * @return RATE - 利率
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置利率
     *
     * @param rate 利率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 获取最短周期
     *
     * @return SHORTEST_PERIOD - 最短周期
     */
    public Integer getShortestPeriod() {
        return shortestPeriod;
    }

    /**
     * 设置最短周期
     *
     * @param shortestPeriod 最短周期
     */
    public void setShortestPeriod(Integer shortestPeriod) {
        this.shortestPeriod = shortestPeriod;
    }

    /**
     * 获取风险等级
     *
     * @return RISK_LEVEL - 风险等级
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    /**
     * 设置风险等级
     *
     * @param riskLevel 风险等级
     */
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
}
