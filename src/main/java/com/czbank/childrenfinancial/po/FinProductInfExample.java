package com.czbank.childrenfinancial.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FinProductInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinProductInfExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andSettleCardnbrIsNull() {
            addCriterion("SETTLE_CARDNBR is null");
            return (Criteria) this;
        }

        public Criteria andSettleCardnbrIsNotNull() {
            addCriterion("SETTLE_CARDNBR is not null");
            return (Criteria) this;
        }

        public Criteria andSettleCardnbrEqualTo(String value) {
            addCriterion("SETTLE_CARDNBR =", value, "settleCardnbr");
            return (Criteria) this;
        }

        public Criteria andSettleCardnbrNotEqualTo(String value) {
            addCriterion("SETTLE_CARDNBR <>", value, "settleCardnbr");
            return (Criteria) this;
        }

        public Criteria andSettleCardnbrGreaterThan(String value) {
            addCriterion("SETTLE_CARDNBR >", value, "settleCardnbr");
            return (Criteria) this;
        }

        public Criteria andSettleCardnbrGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_CARDNBR >=", value, "settleCardnbr");
            return (Criteria) this;
        }

        public Criteria andSettleCardnbrLessThan(String value) {
            addCriterion("SETTLE_CARDNBR <", value, "settleCardnbr");
            return (Criteria) this;
        }

        public Criteria andSettleCardnbrLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_CARDNBR <=", value, "settleCardnbr");
            return (Criteria) this;
        }

        public Criteria andSettleCardnbrLike(String value) {
            addCriterion("SETTLE_CARDNBR like", value, "settleCardnbr");
            return (Criteria) this;
        }

        public Criteria andSettleCardnbrNotLike(String value) {
            addCriterion("SETTLE_CARDNBR not like", value, "settleCardnbr");
            return (Criteria) this;
        }

        public Criteria andSettleCardnbrIn(List<String> values) {
            addCriterion("SETTLE_CARDNBR in", values, "settleCardnbr");
            return (Criteria) this;
        }

        public Criteria andSettleCardnbrNotIn(List<String> values) {
            addCriterion("SETTLE_CARDNBR not in", values, "settleCardnbr");
            return (Criteria) this;
        }

        public Criteria andSettleCardnbrBetween(String value1, String value2) {
            addCriterion("SETTLE_CARDNBR between", value1, value2, "settleCardnbr");
            return (Criteria) this;
        }

        public Criteria andSettleCardnbrNotBetween(String value1, String value2) {
            addCriterion("SETTLE_CARDNBR not between", value1, value2, "settleCardnbr");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andStartAmtIsNull() {
            addCriterion("START_AMT is null");
            return (Criteria) this;
        }

        public Criteria andStartAmtIsNotNull() {
            addCriterion("START_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andStartAmtEqualTo(BigDecimal value) {
            addCriterion("START_AMT =", value, "startAmt");
            return (Criteria) this;
        }

        public Criteria andStartAmtNotEqualTo(BigDecimal value) {
            addCriterion("START_AMT <>", value, "startAmt");
            return (Criteria) this;
        }

        public Criteria andStartAmtGreaterThan(BigDecimal value) {
            addCriterion("START_AMT >", value, "startAmt");
            return (Criteria) this;
        }

        public Criteria andStartAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("START_AMT >=", value, "startAmt");
            return (Criteria) this;
        }

        public Criteria andStartAmtLessThan(BigDecimal value) {
            addCriterion("START_AMT <", value, "startAmt");
            return (Criteria) this;
        }

        public Criteria andStartAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("START_AMT <=", value, "startAmt");
            return (Criteria) this;
        }

        public Criteria andStartAmtIn(List<BigDecimal> values) {
            addCriterion("START_AMT in", values, "startAmt");
            return (Criteria) this;
        }

        public Criteria andStartAmtNotIn(List<BigDecimal> values) {
            addCriterion("START_AMT not in", values, "startAmt");
            return (Criteria) this;
        }

        public Criteria andStartAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("START_AMT between", value1, value2, "startAmt");
            return (Criteria) this;
        }

        public Criteria andStartAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("START_AMT not between", value1, value2, "startAmt");
            return (Criteria) this;
        }

        public Criteria andEndAmtIsNull() {
            addCriterion("END_AMT is null");
            return (Criteria) this;
        }

        public Criteria andEndAmtIsNotNull() {
            addCriterion("END_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andEndAmtEqualTo(BigDecimal value) {
            addCriterion("END_AMT =", value, "endAmt");
            return (Criteria) this;
        }

        public Criteria andEndAmtNotEqualTo(BigDecimal value) {
            addCriterion("END_AMT <>", value, "endAmt");
            return (Criteria) this;
        }

        public Criteria andEndAmtGreaterThan(BigDecimal value) {
            addCriterion("END_AMT >", value, "endAmt");
            return (Criteria) this;
        }

        public Criteria andEndAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("END_AMT >=", value, "endAmt");
            return (Criteria) this;
        }

        public Criteria andEndAmtLessThan(BigDecimal value) {
            addCriterion("END_AMT <", value, "endAmt");
            return (Criteria) this;
        }

        public Criteria andEndAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("END_AMT <=", value, "endAmt");
            return (Criteria) this;
        }

        public Criteria andEndAmtIn(List<BigDecimal> values) {
            addCriterion("END_AMT in", values, "endAmt");
            return (Criteria) this;
        }

        public Criteria andEndAmtNotIn(List<BigDecimal> values) {
            addCriterion("END_AMT not in", values, "endAmt");
            return (Criteria) this;
        }

        public Criteria andEndAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("END_AMT between", value1, value2, "endAmt");
            return (Criteria) this;
        }

        public Criteria andEndAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("END_AMT not between", value1, value2, "endAmt");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("RATE is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("RATE =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("RATE <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("RATE >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("RATE <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("RATE in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("RATE not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andShortestPeriodIsNull() {
            addCriterion("SHORTEST_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andShortestPeriodIsNotNull() {
            addCriterion("SHORTEST_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andShortestPeriodEqualTo(Integer value) {
            addCriterion("SHORTEST_PERIOD =", value, "shortestPeriod");
            return (Criteria) this;
        }

        public Criteria andShortestPeriodNotEqualTo(Integer value) {
            addCriterion("SHORTEST_PERIOD <>", value, "shortestPeriod");
            return (Criteria) this;
        }

        public Criteria andShortestPeriodGreaterThan(Integer value) {
            addCriterion("SHORTEST_PERIOD >", value, "shortestPeriod");
            return (Criteria) this;
        }

        public Criteria andShortestPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHORTEST_PERIOD >=", value, "shortestPeriod");
            return (Criteria) this;
        }

        public Criteria andShortestPeriodLessThan(Integer value) {
            addCriterion("SHORTEST_PERIOD <", value, "shortestPeriod");
            return (Criteria) this;
        }

        public Criteria andShortestPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("SHORTEST_PERIOD <=", value, "shortestPeriod");
            return (Criteria) this;
        }

        public Criteria andShortestPeriodIn(List<Integer> values) {
            addCriterion("SHORTEST_PERIOD in", values, "shortestPeriod");
            return (Criteria) this;
        }

        public Criteria andShortestPeriodNotIn(List<Integer> values) {
            addCriterion("SHORTEST_PERIOD not in", values, "shortestPeriod");
            return (Criteria) this;
        }

        public Criteria andShortestPeriodBetween(Integer value1, Integer value2) {
            addCriterion("SHORTEST_PERIOD between", value1, value2, "shortestPeriod");
            return (Criteria) this;
        }

        public Criteria andShortestPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("SHORTEST_PERIOD not between", value1, value2, "shortestPeriod");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNull() {
            addCriterion("RISK_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNotNull() {
            addCriterion("RISK_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelEqualTo(String value) {
            addCriterion("RISK_LEVEL =", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotEqualTo(String value) {
            addCriterion("RISK_LEVEL <>", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThan(String value) {
            addCriterion("RISK_LEVEL >", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_LEVEL >=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThan(String value) {
            addCriterion("RISK_LEVEL <", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThanOrEqualTo(String value) {
            addCriterion("RISK_LEVEL <=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLike(String value) {
            addCriterion("RISK_LEVEL like", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotLike(String value) {
            addCriterion("RISK_LEVEL not like", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIn(List<String> values) {
            addCriterion("RISK_LEVEL in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotIn(List<String> values) {
            addCriterion("RISK_LEVEL not in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelBetween(String value1, String value2) {
            addCriterion("RISK_LEVEL between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotBetween(String value1, String value2) {
            addCriterion("RISK_LEVEL not between", value1, value2, "riskLevel");
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