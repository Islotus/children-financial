package com.czbank.childrenfinancial.po;

import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@ToString
@Table(name = "busi_inf")
public class BusiInf {
    /**
     * 业务编号
     */
    @Column(name = "BUSI_ID")
    private String busiId;

    /**
     * 用户编号
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 理财产品编号
     */
    @Column(name = "FIN_PRODUCT_ID")
    private String finProductId;

    /**
     * 余额
     */
    @Column(name = "AMT")
    private BigDecimal amt;

    /**
     * 更新时间
     */
    @Column(name = "UPD_TIME")
    private Date updTime;

    /**
     * 产品类型product_type string
     */
    @Column(name = "product_type")
    private String productType;

    /**
     * 定时起始时间start_time datetime
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 定时周期time_period int
     */
    @Column(name = "time_period")
    private int timePeriod;


    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    /**
     * 收益
     */
    @Column(name = "profit")
    private BigDecimal profit;

    @Column(name = "sum_amt")
    private BigDecimal sumAmt;

    /**
     * 卡号
     */
    @Column(name = "CARD_NBR")
    private int cardNbr;

    /**
     * 获取业务编号
     *
     * @return BUSI_ID - 业务编号
     */
    public String getBusiId() {
        return busiId;
    }

    /**
     * 设置业务编号
     *
     * @param busiId 业务编号
     */
    public void setBusiId(String busiId) {
        this.busiId = busiId;
    }

    /**
     * 获取用户编号
     *
     * @return USER_ID - 用户编号
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取理财产品编号
     *
     * @return FIN_PRODUCT_ID - 理财产品编号
     */
    public String getFinProductId() {
        return finProductId;
    }

    /**
     * 设置理财产品编号
     *
     * @param finProductId 理财产品编号
     */
    public void setFinProductId(String finProductId) {
        this.finProductId = finProductId;
    }

    /**
     * 获取余额
     *
     * @return AMT - 余额
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * 设置余额
     *
     * @param amt 余额
     */
    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    /**
     * 获取更新时间
     *
     * @return UPD_TIME - 更新时间
     */
    public Date getUpdTime() {
        return updTime;
    }

    /**
     * 设置更新时间
     *
     * @param updTime 更新时间
     */
    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public int getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(int timePeriod) {
        this.timePeriod = timePeriod;
    }

    public int getCardNbr() {
        return cardNbr;
    }

    public void setCardNbr(int cardNbr) {
        this.cardNbr = cardNbr;
    }

    public BigDecimal getSumAmt() {
        return sumAmt;
    }

    public void setSumAmt(BigDecimal sumAmt) {
        this.sumAmt = sumAmt;
    }
}
