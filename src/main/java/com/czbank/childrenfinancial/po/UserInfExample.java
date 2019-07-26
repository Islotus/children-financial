package com.czbank.childrenfinancial.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfExample() {
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

        public Criteria andAccountIsNull() {
            addCriterion("ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("ACCOUNT =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("ACCOUNT <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("ACCOUNT >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("ACCOUNT <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("ACCOUNT like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("ACCOUNT not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("ACCOUNT in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("ACCOUNT not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("ACCOUNT between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andRelatedAccountIsNull() {
            addCriterion("RELATED_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRelatedAccountIsNotNull() {
            addCriterion("RELATED_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedAccountEqualTo(String value) {
            addCriterion("RELATED_ACCOUNT =", value, "relatedAccount");
            return (Criteria) this;
        }

        public Criteria andRelatedAccountNotEqualTo(String value) {
            addCriterion("RELATED_ACCOUNT <>", value, "relatedAccount");
            return (Criteria) this;
        }

        public Criteria andRelatedAccountGreaterThan(String value) {
            addCriterion("RELATED_ACCOUNT >", value, "relatedAccount");
            return (Criteria) this;
        }

        public Criteria andRelatedAccountGreaterThanOrEqualTo(String value) {
            addCriterion("RELATED_ACCOUNT >=", value, "relatedAccount");
            return (Criteria) this;
        }

        public Criteria andRelatedAccountLessThan(String value) {
            addCriterion("RELATED_ACCOUNT <", value, "relatedAccount");
            return (Criteria) this;
        }

        public Criteria andRelatedAccountLessThanOrEqualTo(String value) {
            addCriterion("RELATED_ACCOUNT <=", value, "relatedAccount");
            return (Criteria) this;
        }

        public Criteria andRelatedAccountLike(String value) {
            addCriterion("RELATED_ACCOUNT like", value, "relatedAccount");
            return (Criteria) this;
        }

        public Criteria andRelatedAccountNotLike(String value) {
            addCriterion("RELATED_ACCOUNT not like", value, "relatedAccount");
            return (Criteria) this;
        }

        public Criteria andRelatedAccountIn(List<String> values) {
            addCriterion("RELATED_ACCOUNT in", values, "relatedAccount");
            return (Criteria) this;
        }

        public Criteria andRelatedAccountNotIn(List<String> values) {
            addCriterion("RELATED_ACCOUNT not in", values, "relatedAccount");
            return (Criteria) this;
        }

        public Criteria andRelatedAccountBetween(String value1, String value2) {
            addCriterion("RELATED_ACCOUNT between", value1, value2, "relatedAccount");
            return (Criteria) this;
        }

        public Criteria andRelatedAccountNotBetween(String value1, String value2) {
            addCriterion("RELATED_ACCOUNT not between", value1, value2, "relatedAccount");
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

        public Criteria andIsParentIsNull() {
            addCriterion("IS_PARENT is null");
            return (Criteria) this;
        }

        public Criteria andIsParentIsNotNull() {
            addCriterion("IS_PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsParentEqualTo(String value) {
            addCriterion("IS_PARENT =", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentNotEqualTo(String value) {
            addCriterion("IS_PARENT <>", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentGreaterThan(String value) {
            addCriterion("IS_PARENT >", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PARENT >=", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentLessThan(String value) {
            addCriterion("IS_PARENT <", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentLessThanOrEqualTo(String value) {
            addCriterion("IS_PARENT <=", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentLike(String value) {
            addCriterion("IS_PARENT like", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentNotLike(String value) {
            addCriterion("IS_PARENT not like", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentIn(List<String> values) {
            addCriterion("IS_PARENT in", values, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentNotIn(List<String> values) {
            addCriterion("IS_PARENT not in", values, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentBetween(String value1, String value2) {
            addCriterion("IS_PARENT between", value1, value2, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentNotBetween(String value1, String value2) {
            addCriterion("IS_PARENT not between", value1, value2, "isParent");
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

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("BIRTHDAY like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("BIRTHDAY not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andPhoneNbrIsNull() {
            addCriterion("PHONE_NBR is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNbrIsNotNull() {
            addCriterion("PHONE_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNbrEqualTo(String value) {
            addCriterion("PHONE_NBR =", value, "phoneNbr");
            return (Criteria) this;
        }

        public Criteria andPhoneNbrNotEqualTo(String value) {
            addCriterion("PHONE_NBR <>", value, "phoneNbr");
            return (Criteria) this;
        }

        public Criteria andPhoneNbrGreaterThan(String value) {
            addCriterion("PHONE_NBR >", value, "phoneNbr");
            return (Criteria) this;
        }

        public Criteria andPhoneNbrGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NBR >=", value, "phoneNbr");
            return (Criteria) this;
        }

        public Criteria andPhoneNbrLessThan(String value) {
            addCriterion("PHONE_NBR <", value, "phoneNbr");
            return (Criteria) this;
        }

        public Criteria andPhoneNbrLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NBR <=", value, "phoneNbr");
            return (Criteria) this;
        }

        public Criteria andPhoneNbrLike(String value) {
            addCriterion("PHONE_NBR like", value, "phoneNbr");
            return (Criteria) this;
        }

        public Criteria andPhoneNbrNotLike(String value) {
            addCriterion("PHONE_NBR not like", value, "phoneNbr");
            return (Criteria) this;
        }

        public Criteria andPhoneNbrIn(List<String> values) {
            addCriterion("PHONE_NBR in", values, "phoneNbr");
            return (Criteria) this;
        }

        public Criteria andPhoneNbrNotIn(List<String> values) {
            addCriterion("PHONE_NBR not in", values, "phoneNbr");
            return (Criteria) this;
        }

        public Criteria andPhoneNbrBetween(String value1, String value2) {
            addCriterion("PHONE_NBR between", value1, value2, "phoneNbr");
            return (Criteria) this;
        }

        public Criteria andPhoneNbrNotBetween(String value1, String value2) {
            addCriterion("PHONE_NBR not between", value1, value2, "phoneNbr");
            return (Criteria) this;
        }

        public Criteria andLoginPwIsNull() {
            addCriterion("LOGIN_PW is null");
            return (Criteria) this;
        }

        public Criteria andLoginPwIsNotNull() {
            addCriterion("LOGIN_PW is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPwEqualTo(String value) {
            addCriterion("LOGIN_PW =", value, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwNotEqualTo(String value) {
            addCriterion("LOGIN_PW <>", value, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwGreaterThan(String value) {
            addCriterion("LOGIN_PW >", value, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_PW >=", value, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwLessThan(String value) {
            addCriterion("LOGIN_PW <", value, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_PW <=", value, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwLike(String value) {
            addCriterion("LOGIN_PW like", value, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwNotLike(String value) {
            addCriterion("LOGIN_PW not like", value, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwIn(List<String> values) {
            addCriterion("LOGIN_PW in", values, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwNotIn(List<String> values) {
            addCriterion("LOGIN_PW not in", values, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwBetween(String value1, String value2) {
            addCriterion("LOGIN_PW between", value1, value2, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwNotBetween(String value1, String value2) {
            addCriterion("LOGIN_PW not between", value1, value2, "loginPw");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("OPEN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("OPEN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(Date value) {
            addCriterion("OPEN_TIME =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(Date value) {
            addCriterion("OPEN_TIME <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(Date value) {
            addCriterion("OPEN_TIME >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPEN_TIME >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(Date value) {
            addCriterion("OPEN_TIME <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(Date value) {
            addCriterion("OPEN_TIME <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<Date> values) {
            addCriterion("OPEN_TIME in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<Date> values) {
            addCriterion("OPEN_TIME not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(Date value1, Date value2) {
            addCriterion("OPEN_TIME between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(Date value1, Date value2) {
            addCriterion("OPEN_TIME not between", value1, value2, "openTime");
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