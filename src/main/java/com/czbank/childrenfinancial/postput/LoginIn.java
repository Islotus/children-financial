package com.czbank.childrenfinancial.postput;

public class LoginIn {
    String userId;
    String account;
    String loginPw;
    String isParent;

    public String getIsParent() {
        return isParent;
    }

    public void setIsParent(String isParent) {
        this.isParent = isParent;
    }

    public String getLoginPw() {
        System.out.println("loginPw: " + loginPw);
        return loginPw;
    }

    public void setLoginPw(String loginPw) {
        this.loginPw = loginPw;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccount() {
        System.out.println("account: " + account);
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
