package com.czbank.childrenfinancial.postput;

public class ProdBuyInfo {
    String card;
    String prodId;
    String amount;
    String period;

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "ProdBuyInfo{" +
                "card='" + card + '\'' +
                ", prodId='" + prodId + '\'' +
                ", amount='" + amount + '\'' +
                ", period='" + period + '\'' +
                '}';
    }

}
