package com.czbank.childrenfinancial.po;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

public class UserInf {
    //0定义字段
    private String userId;
    private String account;
    private String relatedAccount;
    private String name;
    private String isParent;
    private String idCard;
    private String birthday;
    private String phoneNbr;
    private String loginPw;
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date openTime;

    //1定义属性 get,set
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRelatedAccount() {
        return relatedAccount;
    }

    public void setRelatedAccount(String relatedAccount) {
        this.relatedAccount = relatedAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsParent() {
        return isParent;
    }

    public void setIsParent(String isParent) {
        this.isParent = isParent;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNbr() {
        return phoneNbr;
    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public String getLoginPw() {
        return loginPw;
    }

    public void setLoginPw(String loginPw) {
        this.loginPw = loginPw;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    //2定义空构造
    public UserInf() {
    }

    //3定义构造的重载
    public UserInf(String userId, String account, String relatedAccount, String name, String isParent, String idCard, String birthday, String phoneNbr, String loginPw, Date openTime) {
        this.userId = userId;
        this.account = account;
        this.relatedAccount = relatedAccount;
        this.name = name;
        this.isParent = isParent;
        this.idCard = idCard;
        this.birthday = birthday;
        this.phoneNbr = phoneNbr;
        this.loginPw = loginPw;
        this.openTime = openTime;
    }

    //4定义重写toString()方法
    @Override
    public String toString() {
        return "TblUserInfo{" +
                "userId='" + userId + '\'' +
                ", account='" + account + '\'' +
                ", relatedAccount='" + relatedAccount + '\'' +
                ", name='" + name + '\'' +
                ", isParent='" + isParent + '\'' +
                ", idCard='" + idCard + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phoneNbr='" + phoneNbr + '\'' +
                ", loginPw='" + loginPw + '\'' +
                ", openTime=" + openTime +
                '}';
    }
}
