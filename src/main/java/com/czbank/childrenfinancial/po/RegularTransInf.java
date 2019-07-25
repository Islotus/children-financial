package com.czbank.childrenfinancial.po;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "regular_trans_inf")
public class RegularTransInf {
    /**
     * 转账编号
     */
    @Column(name = "TRANS_ID")
    private String transId;

    /**
     * 姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 转出账号
     */
    @Column(name = "OUT_ACCT")
    private String outAcct;

    /**
     * 转入账号
     */
    @Column(name = "IN_ACCT")
    private String inAcct;

    /**
     * 金额
     */
    @Column(name = "AMT")
    private BigDecimal amt;

    /**
     * 转账时间
     */
    @Column(name = "TRANS_TIME")
    private Date transTime;

    /**
     * 转账周期
     */
    @Column(name = "TRANS_PERIOD")
    private Integer transPeriod;

    /**
     * 获取转账编号
     *
     * @return TRANS_ID - 转账编号
     */
    public String getTransId() {
        return transId;
    }

    /**
     * 设置转账编号
     *
     * @param transId 转账编号
     */
    public void setTransId(String transId) {
        this.transId = transId;
    }

    /**
     * 获取姓名
     *
     * @return NAME - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取转出账号
     *
     * @return OUT_ACCT - 转出账号
     */
    public String getOutAcct() {
        return outAcct;
    }

    /**
     * 设置转出账号
     *
     * @param outAcct 转出账号
     */
    public void setOutAcct(String outAcct) {
        this.outAcct = outAcct;
    }

    /**
     * 获取转入账号
     *
     * @return IN_ACCT - 转入账号
     */
    public String getInAcct() {
        return inAcct;
    }

    /**
     * 设置转入账号
     *
     * @param inAcct 转入账号
     */
    public void setInAcct(String inAcct) {
        this.inAcct = inAcct;
    }

    /**
     * 获取金额
     *
     * @return AMT - 金额
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * 设置金额
     *
     * @param amt 金额
     */
    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    /**
     * 获取转账时间
     *
     * @return TRANS_TIME - 转账时间
     */
    public Date getTransTime() {
        return transTime;
    }

    /**
     * 设置转账时间
     *
     * @param transTime 转账时间
     */
    public void setTransTime(Date transTime) {
        this.transTime = transTime;
    }

    /**
     * 获取转账周期
     *
     * @return TRANS_PERIOD - 转账周期
     */
    public Integer getTransPeriod() {
        return transPeriod;
    }

    /**
     * 设置转账周期
     *
     * @param transPeriod 转账周期
     */
    public void setTransPeriod(Integer transPeriod) {
        this.transPeriod = transPeriod;
    }
}
