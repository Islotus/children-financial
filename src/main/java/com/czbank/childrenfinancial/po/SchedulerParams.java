package com.czbank.childrenfinancial.po;

import java.util.Date;

public class SchedulerParams {
    String busiId;
    String userId;
    double amt;
    int timediff;
    int timePeriod;
    String cardNbr;

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }


    public int getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(int timePeriod) {
        this.timePeriod = timePeriod;
    }

    public int getTimediff() {
        return timediff;
    }

    public void setTimediff(int timediff) {
        this.timediff = timediff;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCardNbr() {
        return cardNbr;
    }

    public void setCardNbr(String cardNbr) {
        this.cardNbr = cardNbr;
    }

    public String getBusiId() {
        return busiId;
    }

    public void setBusiId(String busiId) {
        this.busiId = busiId;
    }

    @Override
    public String toString() {
        return "SchedulerParams{" +
                "busiId='" + busiId + '\'' +
                ", userId='" + userId + '\'' +
                ", amt=" + amt +
                ", timediff=" + timediff +
                ", timePeriod=" + timePeriod +
                ", cardNbr='" + cardNbr + '\'' +
                '}';
    }
}
