package com.sxdx.basic.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConstractExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(String value) {
            addCriterion("term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(String value) {
            addCriterion("term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(String value) {
            addCriterion("term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(String value) {
            addCriterion("term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(String value) {
            addCriterion("term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(String value) {
            addCriterion("term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLike(String value) {
            addCriterion("term like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotLike(String value) {
            addCriterion("term not like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<String> values) {
            addCriterion("term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<String> values) {
            addCriterion("term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(String value1, String value2) {
            addCriterion("term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(String value1, String value2) {
            addCriterion("term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Float value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Float value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Float value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Float value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Float value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Float> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Float> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Float value1, Float value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Float value1, Float value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNull() {
            addCriterion("signTime is null");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNotNull() {
            addCriterion("signTime is not null");
            return (Criteria) this;
        }

        public Criteria andSigntimeEqualTo(Date value) {
            addCriterion("signTime =", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotEqualTo(Date value) {
            addCriterion("signTime <>", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThan(Date value) {
            addCriterion("signTime >", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("signTime >=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThan(Date value) {
            addCriterion("signTime <", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThanOrEqualTo(Date value) {
            addCriterion("signTime <=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeIn(List<Date> values) {
            addCriterion("signTime in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotIn(List<Date> values) {
            addCriterion("signTime not in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeBetween(Date value1, Date value2) {
            addCriterion("signTime between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotBetween(Date value1, Date value2) {
            addCriterion("signTime not between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("beginTime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("beginTime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterion("beginTime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterion("beginTime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterion("beginTime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("beginTime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterion("beginTime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("beginTime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterion("beginTime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterion("beginTime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterion("beginTime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("beginTime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerId is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerId =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerId <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerId >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerId >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerId <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerId <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerId in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerId not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerId between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerId not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNull() {
            addCriterion("employeeId is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNotNull() {
            addCriterion("employeeId is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidEqualTo(Integer value) {
            addCriterion("employeeId =", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotEqualTo(Integer value) {
            addCriterion("employeeId <>", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThan(Integer value) {
            addCriterion("employeeId >", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("employeeId >=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThan(Integer value) {
            addCriterion("employeeId <", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThanOrEqualTo(Integer value) {
            addCriterion("employeeId <=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIn(List<Integer> values) {
            addCriterion("employeeId in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotIn(List<Integer> values) {
            addCriterion("employeeId not in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidBetween(Integer value1, Integer value2) {
            addCriterion("employeeId between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotBetween(Integer value1, Integer value2) {
            addCriterion("employeeId not between", value1, value2, "employeeid");
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