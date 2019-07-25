package com.czbank.childrenfinancial.po;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "ls_inf")
public class LsInf {
    /**
     * 业务受理编号
     */
    @Column(name = "BUSI_ACCEPT_ID")
    private String busiAcceptId;

    /**
     * 我方账号
     */
    @Column(name = "OWN_ACCT")
    private String ownAcct;

    /**
     * 对方账号
     */
    @Column(name = "YOUR_ACCT")
    private String yourAcct;

    /**
     * 出入状态
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 金额
     */
    @Column(name = "AMT")
    private BigDecimal amt;

    /**
     * 剩余金额
     */
    @Column(name = "REMAIN_AMT")
    private BigDecimal remainAmt;

    /**
     * 录入时间
     */
    @Column(name = "ADD_TIME")
    private Date addTime;

    /**
     * 获取业务受理编号
     *
     * @return BUSI_ACCEPT_ID - 业务受理编号
     */
    public String getBusiAcceptId() {
        return busiAcceptId;
    }

    /**
     * 设置业务受理编号
     *
     * @param busiAcceptId 业务受理编号
     */
    public void setBusiAcceptId(String busiAcceptId) {
        this.busiAcceptId = busiAcceptId;
    }

    /**
     * 获取我方账号
     *
     * @return OWN_ACCT - 我方账号
     */
    public String getOwnAcct() {
        return ownAcct;
    }

    /**
     * 设置我方账号
     *
     * @param ownAcct 我方账号
     */
    public void setOwnAcct(String ownAcct) {
        this.ownAcct = ownAcct;
    }

    /**
     * 获取对方账号
     *
     * @return YOUR_ACCT - 对方账号
     */
    public String getYourAcct() {
        return yourAcct;
    }

    /**
     * 设置对方账号
     *
     * @param yourAcct 对方账号
     */
    public void setYourAcct(String yourAcct) {
        this.yourAcct = yourAcct;
    }

    /**
     * 获取出入状态
     *
     * @return STATUS - 出入状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置出入状态
     *
     * @param status 出入状态
     */
    public void setStatus(String status) {
        this.status = status;
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
     * 获取剩余金额
     *
     * @return REMAIN_AMT - 剩余金额
     */
    public BigDecimal getRemainAmt() {
        return remainAmt;
    }

    /**
     * 设置剩余金额
     *
     * @param remainAmt 剩余金额
     */
    public void setRemainAmt(BigDecimal remainAmt) {
        this.remainAmt = remainAmt;
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
