package com.czbank.childrenfinancial.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LsInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LsInfExample() {
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

        public Criteria andBusiAcceptIdIsNull() {
            addCriterion("BUSI_ACCEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusiAcceptIdIsNotNull() {
            addCriterion("BUSI_ACCEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusiAcceptIdEqualTo(String value) {
            addCriterion("BUSI_ACCEPT_ID =", value, "busiAcceptId");
            return (Criteria) this;
        }

        public Criteria andBusiAcceptIdNotEqualTo(String value) {
            addCriterion("BUSI_ACCEPT_ID <>", value, "busiAcceptId");
            return (Criteria) this;
        }

        public Criteria andBusiAcceptIdGreaterThan(String value) {
            addCriterion("BUSI_ACCEPT_ID >", value, "busiAcceptId");
            return (Criteria) this;
        }

        public Criteria andBusiAcceptIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_ACCEPT_ID >=", value, "busiAcceptId");
            return (Criteria) this;
        }

        public Criteria andBusiAcceptIdLessThan(String value) {
            addCriterion("BUSI_ACCEPT_ID <", value, "busiAcceptId");
            return (Criteria) this;
        }

        public Criteria andBusiAcceptIdLessThanOrEqualTo(String value) {
            addCriterion("BUSI_ACCEPT_ID <=", value, "busiAcceptId");
            return (Criteria) this;
        }

        public Criteria andBusiAcceptIdLike(String value) {
            addCriterion("BUSI_ACCEPT_ID like", value, "busiAcceptId");
            return (Criteria) this;
        }

        public Criteria andBusiAcceptIdNotLike(String value) {
            addCriterion("BUSI_ACCEPT_ID not like", value, "busiAcceptId");
            return (Criteria) this;
        }

        public Criteria andBusiAcceptIdIn(List<String> values) {
            addCriterion("BUSI_ACCEPT_ID in", values, "busiAcceptId");
            return (Criteria) this;
        }

        public Criteria andBusiAcceptIdNotIn(List<String> values) {
            addCriterion("BUSI_ACCEPT_ID not in", values, "busiAcceptId");
            return (Criteria) this;
        }

        public Criteria andBusiAcceptIdBetween(String value1, String value2) {
            addCriterion("BUSI_ACCEPT_ID between", value1, value2, "busiAcceptId");
            return (Criteria) this;
        }

        public Criteria andBusiAcceptIdNotBetween(String value1, String value2) {
            addCriterion("BUSI_ACCEPT_ID not between", value1, value2, "busiAcceptId");
            return (Criteria) this;
        }

        public Criteria andOwnAcctIsNull() {
            addCriterion("OWN_ACCT is null");
            return (Criteria) this;
        }

        public Criteria andOwnAcctIsNotNull() {
            addCriterion("OWN_ACCT is not null");
            return (Criteria) this;
        }

        public Criteria andOwnAcctEqualTo(String value) {
            addCriterion("OWN_ACCT =", value, "ownAcct");
            return (Criteria) this;
        }

        public Criteria andOwnAcctNotEqualTo(String value) {
            addCriterion("OWN_ACCT <>", value, "ownAcct");
            return (Criteria) this;
        }

        public Criteria andOwnAcctGreaterThan(String value) {
            addCriterion("OWN_ACCT >", value, "ownAcct");
            return (Criteria) this;
        }

        public Criteria andOwnAcctGreaterThanOrEqualTo(String value) {
            addCriterion("OWN_ACCT >=", value, "ownAcct");
            return (Criteria) this;
        }

        public Criteria andOwnAcctLessThan(String value) {
            addCriterion("OWN_ACCT <", value, "ownAcct");
            return (Criteria) this;
        }

        public Criteria andOwnAcctLessThanOrEqualTo(String value) {
            addCriterion("OWN_ACCT <=", value, "ownAcct");
            return (Criteria) this;
        }

        public Criteria andOwnAcctLike(String value) {
            addCriterion("OWN_ACCT like", value, "ownAcct");
            return (Criteria) this;
        }

        public Criteria andOwnAcctNotLike(String value) {
            addCriterion("OWN_ACCT not like", value, "ownAcct");
            return (Criteria) this;
        }

        public Criteria andOwnAcctIn(List<String> values) {
            addCriterion("OWN_ACCT in", values, "ownAcct");
            return (Criteria) this;
        }

        public Criteria andOwnAcctNotIn(List<String> values) {
            addCriterion("OWN_ACCT not in", values, "ownAcct");
            return (Criteria) this;
        }

        public Criteria andOwnAcctBetween(String value1, String value2) {
            addCriterion("OWN_ACCT between", value1, value2, "ownAcct");
            return (Criteria) this;
        }

        public Criteria andOwnAcctNotBetween(String value1, String value2) {
            addCriterion("OWN_ACCT not between", value1, value2, "ownAcct");
            return (Criteria) this;
        }

        public Criteria andYourAcctIsNull() {
            addCriterion("YOUR_ACCT is null");
            return (Criteria) this;
        }

        public Criteria andYourAcctIsNotNull() {
            addCriterion("YOUR_ACCT is not null");
            return (Criteria) this;
        }

        public Criteria andYourAcctEqualTo(String value) {
            addCriterion("YOUR_ACCT =", value, "yourAcct");
            return (Criteria) this;
        }

        public Criteria andYourAcctNotEqualTo(String value) {
            addCriterion("YOUR_ACCT <>", value, "yourAcct");
            return (Criteria) this;
        }

        public Criteria andYourAcctGreaterThan(String value) {
            addCriterion("YOUR_ACCT >", value, "yourAcct");
            return (Criteria) this;
        }

        public Criteria andYourAcctGreaterThanOrEqualTo(String value) {
            addCriterion("YOUR_ACCT >=", value, "yourAcct");
            return (Criteria) this;
        }

        public Criteria andYourAcctLessThan(String value) {
            addCriterion("YOUR_ACCT <", value, "yourAcct");
            return (Criteria) this;
        }

        public Criteria andYourAcctLessThanOrEqualTo(String value) {
            addCriterion("YOUR_ACCT <=", value, "yourAcct");
            return (Criteria) this;
        }

        public Criteria andYourAcctLike(String value) {
            addCriterion("YOUR_ACCT like", value, "yourAcct");
            return (Criteria) this;
        }

        public Criteria andYourAcctNotLike(String value) {
            addCriterion("YOUR_ACCT not like", value, "yourAcct");
            return (Criteria) this;
        }

        public Criteria andYourAcctIn(List<String> values) {
            addCriterion("YOUR_ACCT in", values, "yourAcct");
            return (Criteria) this;
        }

        public Criteria andYourAcctNotIn(List<String> values) {
            addCriterion("YOUR_ACCT not in", values, "yourAcct");
            return (Criteria) this;
        }

        public Criteria andYourAcctBetween(String value1, String value2) {
            addCriterion("YOUR_ACCT between", value1, value2, "yourAcct");
            return (Criteria) this;
        }

        public Criteria andYourAcctNotBetween(String value1, String value2) {
            addCriterion("YOUR_ACCT not between", value1, value2, "yourAcct");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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

        public Criteria andRemainAmtIsNull() {
            addCriterion("REMAIN_AMT is null");
            return (Criteria) this;
        }

        public Criteria andRemainAmtIsNotNull() {
            addCriterion("REMAIN_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andRemainAmtEqualTo(BigDecimal value) {
            addCriterion("REMAIN_AMT =", value, "remainAmt");
            return (Criteria) this;
        }

        public Criteria andRemainAmtNotEqualTo(BigDecimal value) {
            addCriterion("REMAIN_AMT <>", value, "remainAmt");
            return (Criteria) this;
        }

        public Criteria andRemainAmtGreaterThan(BigDecimal value) {
            addCriterion("REMAIN_AMT >", value, "remainAmt");
            return (Criteria) this;
        }

        public Criteria andRemainAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAIN_AMT >=", value, "remainAmt");
            return (Criteria) this;
        }

        public Criteria andRemainAmtLessThan(BigDecimal value) {
            addCriterion("REMAIN_AMT <", value, "remainAmt");
            return (Criteria) this;
        }

        public Criteria andRemainAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAIN_AMT <=", value, "remainAmt");
            return (Criteria) this;
        }

        public Criteria andRemainAmtIn(List<BigDecimal> values) {
            addCriterion("REMAIN_AMT in", values, "remainAmt");
            return (Criteria) this;
        }

        public Criteria andRemainAmtNotIn(List<BigDecimal> values) {
            addCriterion("REMAIN_AMT not in", values, "remainAmt");
            return (Criteria) this;
        }

        public Criteria andRemainAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAIN_AMT between", value1, value2, "remainAmt");
            return (Criteria) this;
        }

        public Criteria andRemainAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAIN_AMT not between", value1, value2, "remainAmt");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("ADD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("ADD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("ADD_TIME =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("ADD_TIME <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("ADD_TIME >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ADD_TIME >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("ADD_TIME <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("ADD_TIME <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("ADD_TIME in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("ADD_TIME not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("ADD_TIME between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("ADD_TIME not between", value1, value2, "addTime");
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