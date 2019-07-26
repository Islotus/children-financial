package com.czbank.childrenfinancial.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegularTransInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegularTransInfExample() {
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

        public Criteria andTransIdIsNull() {
            addCriterion("TRANS_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNotNull() {
            addCriterion("TRANS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransIdEqualTo(String value) {
            addCriterion("TRANS_ID =", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotEqualTo(String value) {
            addCriterion("TRANS_ID <>", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThan(String value) {
            addCriterion("TRANS_ID >", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_ID >=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThan(String value) {
            addCriterion("TRANS_ID <", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThanOrEqualTo(String value) {
            addCriterion("TRANS_ID <=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLike(String value) {
            addCriterion("TRANS_ID like", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotLike(String value) {
            addCriterion("TRANS_ID not like", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdIn(List<String> values) {
            addCriterion("TRANS_ID in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotIn(List<String> values) {
            addCriterion("TRANS_ID not in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdBetween(String value1, String value2) {
            addCriterion("TRANS_ID between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotBetween(String value1, String value2) {
            addCriterion("TRANS_ID not between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOutAcctIsNull() {
            addCriterion("OUT_ACCT is null");
            return (Criteria) this;
        }

        public Criteria andOutAcctIsNotNull() {
            addCriterion("OUT_ACCT is not null");
            return (Criteria) this;
        }

        public Criteria andOutAcctEqualTo(String value) {
            addCriterion("OUT_ACCT =", value, "outAcct");
            return (Criteria) this;
        }

        public Criteria andOutAcctNotEqualTo(String value) {
            addCriterion("OUT_ACCT <>", value, "outAcct");
            return (Criteria) this;
        }

        public Criteria andOutAcctGreaterThan(String value) {
            addCriterion("OUT_ACCT >", value, "outAcct");
            return (Criteria) this;
        }

        public Criteria andOutAcctGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_ACCT >=", value, "outAcct");
            return (Criteria) this;
        }

        public Criteria andOutAcctLessThan(String value) {
            addCriterion("OUT_ACCT <", value, "outAcct");
            return (Criteria) this;
        }

        public Criteria andOutAcctLessThanOrEqualTo(String value) {
            addCriterion("OUT_ACCT <=", value, "outAcct");
            return (Criteria) this;
        }

        public Criteria andOutAcctLike(String value) {
            addCriterion("OUT_ACCT like", value, "outAcct");
            return (Criteria) this;
        }

        public Criteria andOutAcctNotLike(String value) {
            addCriterion("OUT_ACCT not like", value, "outAcct");
            return (Criteria) this;
        }

        public Criteria andOutAcctIn(List<String> values) {
            addCriterion("OUT_ACCT in", values, "outAcct");
            return (Criteria) this;
        }

        public Criteria andOutAcctNotIn(List<String> values) {
            addCriterion("OUT_ACCT not in", values, "outAcct");
            return (Criteria) this;
        }

        public Criteria andOutAcctBetween(String value1, String value2) {
            addCriterion("OUT_ACCT between", value1, value2, "outAcct");
            return (Criteria) this;
        }

        public Criteria andOutAcctNotBetween(String value1, String value2) {
            addCriterion("OUT_ACCT not between", value1, value2, "outAcct");
            return (Criteria) this;
        }

        public Criteria andInAcctIsNull() {
            addCriterion("IN_ACCT is null");
            return (Criteria) this;
        }

        public Criteria andInAcctIsNotNull() {
            addCriterion("IN_ACCT is not null");
            return (Criteria) this;
        }

        public Criteria andInAcctEqualTo(String value) {
            addCriterion("IN_ACCT =", value, "inAcct");
            return (Criteria) this;
        }

        public Criteria andInAcctNotEqualTo(String value) {
            addCriterion("IN_ACCT <>", value, "inAcct");
            return (Criteria) this;
        }

        public Criteria andInAcctGreaterThan(String value) {
            addCriterion("IN_ACCT >", value, "inAcct");
            return (Criteria) this;
        }

        public Criteria andInAcctGreaterThanOrEqualTo(String value) {
            addCriterion("IN_ACCT >=", value, "inAcct");
            return (Criteria) this;
        }

        public Criteria andInAcctLessThan(String value) {
            addCriterion("IN_ACCT <", value, "inAcct");
            return (Criteria) this;
        }

        public Criteria andInAcctLessThanOrEqualTo(String value) {
            addCriterion("IN_ACCT <=", value, "inAcct");
            return (Criteria) this;
        }

        public Criteria andInAcctLike(String value) {
            addCriterion("IN_ACCT like", value, "inAcct");
            return (Criteria) this;
        }

        public Criteria andInAcctNotLike(String value) {
            addCriterion("IN_ACCT not like", value, "inAcct");
            return (Criteria) this;
        }

        public Criteria andInAcctIn(List<String> values) {
            addCriterion("IN_ACCT in", values, "inAcct");
            return (Criteria) this;
        }

        public Criteria andInAcctNotIn(List<String> values) {
            addCriterion("IN_ACCT not in", values, "inAcct");
            return (Criteria) this;
        }

        public Criteria andInAcctBetween(String value1, String value2) {
            addCriterion("IN_ACCT between", value1, value2, "inAcct");
            return (Criteria) this;
        }

        public Criteria andInAcctNotBetween(String value1, String value2) {
            addCriterion("IN_ACCT not between", value1, value2, "inAcct");
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

        public Criteria andTransTimeIsNull() {
            addCriterion("TRANS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNotNull() {
            addCriterion("TRANS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTransTimeEqualTo(Date value) {
            addCriterion("TRANS_TIME =", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotEqualTo(Date value) {
            addCriterion("TRANS_TIME <>", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThan(Date value) {
            addCriterion("TRANS_TIME >", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TRANS_TIME >=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThan(Date value) {
            addCriterion("TRANS_TIME <", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThanOrEqualTo(Date value) {
            addCriterion("TRANS_TIME <=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeIn(List<Date> values) {
            addCriterion("TRANS_TIME in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotIn(List<Date> values) {
            addCriterion("TRANS_TIME not in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeBetween(Date value1, Date value2) {
            addCriterion("TRANS_TIME between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotBetween(Date value1, Date value2) {
            addCriterion("TRANS_TIME not between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransPeriodIsNull() {
            addCriterion("TRANS_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andTransPeriodIsNotNull() {
            addCriterion("TRANS_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andTransPeriodEqualTo(Integer value) {
            addCriterion("TRANS_PERIOD =", value, "transPeriod");
            return (Criteria) this;
        }

        public Criteria andTransPeriodNotEqualTo(Integer value) {
            addCriterion("TRANS_PERIOD <>", value, "transPeriod");
            return (Criteria) this;
        }

        public Criteria andTransPeriodGreaterThan(Integer value) {
            addCriterion("TRANS_PERIOD >", value, "transPeriod");
            return (Criteria) this;
        }

        public Criteria andTransPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANS_PERIOD >=", value, "transPeriod");
            return (Criteria) this;
        }

        public Criteria andTransPeriodLessThan(Integer value) {
            addCriterion("TRANS_PERIOD <", value, "transPeriod");
            return (Criteria) this;
        }

        public Criteria andTransPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("TRANS_PERIOD <=", value, "transPeriod");
            return (Criteria) this;
        }

        public Criteria andTransPeriodIn(List<Integer> values) {
            addCriterion("TRANS_PERIOD in", values, "transPeriod");
            return (Criteria) this;
        }

        public Criteria andTransPeriodNotIn(List<Integer> values) {
            addCriterion("TRANS_PERIOD not in", values, "transPeriod");
            return (Criteria) this;
        }

        public Criteria andTransPeriodBetween(Integer value1, Integer value2) {
            addCriterion("TRANS_PERIOD between", value1, value2, "transPeriod");
            return (Criteria) this;
        }

        public Criteria andTransPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANS_PERIOD not between", value1, value2, "transPeriod");
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