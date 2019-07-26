package com.czbank.childrenfinancial.po;

import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;

@ToString
@Table(name = "card_inf")
public class CardInf {
    /**
     * 卡编号
     */
    @Column(name = "CARD_ID")
    private String cardId;

    /**
     * 用户编号
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 身份证号
     */
    @Column(name = "ID_CARD")
    private String idCard;

    /**
     * 银行卡号
     */
    @Column(name = "CARD_NBR")
    private String cardNbr;

    /**
     * 卡产品名称
     */
    @Column(name = "CARD_PRO_NAME")
    private String cardProName;

    /**
     * 卡类型
     */
    @Column(name = "CARD_TYPE")
    private String cardType;

    /**
     * 支付密码
     */
    @Column(name = "PAY_PW")
    private String payPw;

    /**
     * 金额
     */
    @Column(name = "AMT")
    private BigDecimal amt;

    /**
     * 基础利率
     */
    @Column(name = "BASE_RATE")
    private BigDecimal baseRate;

    /**
     * 获取卡编号
     *
     * @return CARD_ID - 卡编号
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 设置卡编号
     *
     * @param cardId 卡编号
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
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
     * 获取身份证号
     *
     * @return ID_CARD - 身份证号
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置身份证号
     *
     * @param idCard 身份证号
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取银行卡号
     *
     * @return CARD_NBR - 银行卡号
     */
    public String getCardNbr() {
        return cardNbr;
    }

    /**
     * 设置银行卡号
     *
     * @param cardNbr 银行卡号
     */
    public void setCardNbr(String cardNbr) {
        this.cardNbr = cardNbr;
    }

    /**
     * 获取卡产品名称
     *
     * @return CARD_PRO_NAME - 卡产品名称
     */
    public String getCardProName() {
        return cardProName;
    }

    /**
     * 设置卡产品名称
     *
     * @param cardProName 卡产品名称
     */
    public void setCardProName(String cardProName) {
        this.cardProName = cardProName;
    }

    /**
     * 获取卡类型
     *
     * @return CARD_TYPE - 卡类型
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * 设置卡类型
     *
     * @param cardType 卡类型
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * 获取支付密码
     *
     * @return PAY_PW - 支付密码
     */
    public String getPayPw() {
        return payPw;
    }

    /**
     * 设置支付密码
     *
     * @param payPw 支付密码
     */
    public void setPayPw(String payPw) {
        this.payPw = payPw;
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
     * 获取基础利率
     *
     * @return BASE_RATE - 基础利率
     */
    public BigDecimal getBaseRate() {
        return baseRate;
    }

    /**
     * 设置基础利率
     *
     * @param baseRate 基础利率
     */
    public void setBaseRate(BigDecimal baseRate) {
        this.baseRate = baseRate;
    }
}
