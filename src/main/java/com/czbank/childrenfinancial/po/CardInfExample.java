package com.czbank.childrenfinancial.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CardInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CardInfExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCardIdIsNull() {
            addCriterion("CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("CARD_ID =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("CARD_ID <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("CARD_ID >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_ID >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("CARD_ID <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("CARD_ID <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("CARD_ID like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("CARD_ID not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("CARD_ID in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("CARD_ID not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("CARD_ID between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("CARD_ID not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("ID_CARD =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("ID_CARD <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("ID_CARD >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CARD >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("ID_CARD <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("ID_CARD <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("ID_CARD like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("ID_CARD not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("ID_CARD in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("ID_CARD not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("ID_CARD between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("ID_CARD not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andCardNbrIsNull() {
            addCriterion("CARD_NBR is null");
            return (Criteria) this;
        }

        public Criteria andCardNbrIsNotNull() {
            addCriterion("CARD_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andCardNbrEqualTo(String value) {
            addCriterion("CARD_NBR =", value, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrNotEqualTo(String value) {
            addCriterion("CARD_NBR <>", value, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrGreaterThan(String value) {
            addCriterion("CARD_NBR >", value, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NBR >=", value, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrLessThan(String value) {
            addCriterion("CARD_NBR <", value, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrLessThanOrEqualTo(String value) {
            addCriterion("CARD_NBR <=", value, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrLike(String value) {
            addCriterion("CARD_NBR like", value, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrNotLike(String value) {
            addCriterion("CARD_NBR not like", value, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrIn(List<String> values) {
            addCriterion("CARD_NBR in", values, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrNotIn(List<String> values) {
            addCriterion("CARD_NBR not in", values, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrBetween(String value1, String value2) {
            addCriterion("CARD_NBR between", value1, value2, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrNotBetween(String value1, String value2) {
            addCriterion("CARD_NBR not between", value1, value2, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardProNameIsNull() {
            addCriterion("CARD_PRO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCardProNameIsNotNull() {
            addCriterion("CARD_PRO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCardProNameEqualTo(String value) {
            addCriterion("CARD_PRO_NAME =", value, "cardProName");
            return (Criteria) this;
        }

        public Criteria andCardProNameNotEqualTo(String value) {
            addCriterion("CARD_PRO_NAME <>", value, "cardProName");
            return (Criteria) this;
        }

        public Criteria andCardProNameGreaterThan(String value) {
            addCriterion("CARD_PRO_NAME >", value, "cardProName");
            return (Criteria) this;
        }

        public Criteria andCardProNameGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_PRO_NAME >=", value, "cardProName");
            return (Criteria) this;
        }

        public Criteria andCardProNameLessThan(String value) {
            addCriterion("CARD_PRO_NAME <", value, "cardProName");
            return (Criteria) this;
        }

        public Criteria andCardProNameLessThanOrEqualTo(String value) {
            addCriterion("CARD_PRO_NAME <=", value, "cardProName");
            return (Criteria) this;
        }

        public Criteria andCardProNameLike(String value) {
            addCriterion("CARD_PRO_NAME like", value, "cardProName");
            return (Criteria) this;
        }

        public Criteria andCardProNameNotLike(String value) {
            addCriterion("CARD_PRO_NAME not like", value, "cardProName");
            return (Criteria) this;
        }

        public Criteria andCardProNameIn(List<String> values) {
            addCriterion("CARD_PRO_NAME in", values, "cardProName");
            return (Criteria) this;
        }

        public Criteria andCardProNameNotIn(List<String> values) {
            addCriterion("CARD_PRO_NAME not in", values, "cardProName");
            return (Criteria) this;
        }

        public Criteria andCardProNameBetween(String value1, String value2) {
            addCriterion("CARD_PRO_NAME between", value1, value2, "cardProName");
            return (Criteria) this;
        }

        public Criteria andCardProNameNotBetween(String value1, String value2) {
            addCriterion("CARD_PRO_NAME not between", value1, value2, "cardProName");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("CARD_TYPE =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("CARD_TYPE <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("CARD_TYPE >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("CARD_TYPE <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("CARD_TYPE like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("CARD_TYPE not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("CARD_TYPE in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("CARD_TYPE not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("CARD_TYPE between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("CARD_TYPE not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andPayPwIsNull() {
            addCriterion("PAY_PW is null");
            return (Criteria) this;
        }

        public Criteria andPayPwIsNotNull() {
            addCriterion("PAY_PW is not null");
            return (Criteria) this;
        }

        public Criteria andPayPwEqualTo(String value) {
            addCriterion("PAY_PW =", value, "payPw");
            return (Criteria) this;
        }

        public Criteria andPayPwNotEqualTo(String value) {
            addCriterion("PAY_PW <>", value, "payPw");
            return (Criteria) this;
        }

        public Criteria andPayPwGreaterThan(String value) {
            addCriterion("PAY_PW >", value, "payPw");
            return (Criteria) this;
        }

        public Criteria andPayPwGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_PW >=", value, "payPw");
            return (Criteria) this;
        }

        public Criteria andPayPwLessThan(String value) {
            addCriterion("PAY_PW <", value, "payPw");
            return (Criteria) this;
        }

        public Criteria andPayPwLessThanOrEqualTo(String value) {
            addCriterion("PAY_PW <=", value, "payPw");
            return (Criteria) this;
        }

        public Criteria andPayPwLike(String value) {
            addCriterion("PAY_PW like", value, "payPw");
            return (Criteria) this;
        }

        public Criteria andPayPwNotLike(String value) {
            addCriterion("PAY_PW not like", value, "payPw");
            return (Criteria) this;
        }

        public Criteria andPayPwIn(List<String> values) {
            addCriterion("PAY_PW in", values, "payPw");
            return (Criteria) this;
        }

        public Criteria andPayPwNotIn(List<String> values) {
            addCriterion("PAY_PW not in", values, "payPw");
            return (Criteria) this;
        }

        public Criteria andPayPwBetween(String value1, String value2) {
            addCriterion("PAY_PW between", value1, value2, "payPw");
            return (Criteria) this;
        }

        public Criteria andPayPwNotBetween(String value1, String value2) {
            addCriterion("PAY_PW not between", value1, value2, "payPw");
            return (Criteria) this;
        }

        public Criteria andAmtIsNull() {
            addCriterion("AMT is null");
            return (Criteria) this;
        }

        public Criteria andAmtIsNotNull() {
            addCriterion("AMT is not null");
            return (Criteria) this;
        }

        public Criteria andAmtEqualTo(BigDecimal value) {
            addCriterion("AMT =", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotEqualTo(BigDecimal value) {
            addCriterion("AMT <>", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtGreaterThan(BigDecimal value) {
            addCriterion("AMT >", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT >=", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLessThan(BigDecimal value) {
            addCriterion("AMT <", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT <=", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtIn(List<BigDecimal> values) {
            addCriterion("AMT in", values, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotIn(List<BigDecimal> values) {
            addCriterion("AMT not in", values, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT between", value1, value2, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT not between", value1, value2, "amt");
            return (Criteria) this;
        }

        public Criteria andBaseRateIsNull() {
            addCriterion("BASE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andBaseRateIsNotNull() {
            addCriterion("BASE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andBaseRateEqualTo(BigDecimal value) {
            addCriterion("BASE_RATE =", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateNotEqualTo(BigDecimal value) {
            addCriterion("BASE_RATE <>", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateGreaterThan(BigDecimal value) {
            addCriterion("BASE_RATE >", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_RATE >=", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateLessThan(BigDecimal value) {
            addCriterion("BASE_RATE <", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_RATE <=", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateIn(List<BigDecimal> values) {
            addCriterion("BASE_RATE in", values, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateNotIn(List<BigDecimal> values) {
            addCriterion("BASE_RATE not in", values, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_RATE between", value1, value2, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_RATE not between", value1, value2, "baseRate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}