package com.sxdx.basic.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryExample() {
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

        public Criteria andBasicsalaryIsNull() {
            addCriterion("basicSalary is null");
            return (Criteria) this;
        }

        public Criteria andBasicsalaryIsNotNull() {
            addCriterion("basicSalary is not null");
            return (Criteria) this;
        }

        public Criteria andBasicsalaryEqualTo(Float value) {
            addCriterion("basicSalary =", value, "basicsalary");
            return (Criteria) this;
        }

        public Criteria andBasicsalaryNotEqualTo(Float value) {
            addCriterion("basicSalary <>", value, "basicsalary");
            return (Criteria) this;
        }

        public Criteria andBasicsalaryGreaterThan(Float value) {
            addCriterion("basicSalary >", value, "basicsalary");
            return (Criteria) this;
        }

        public Criteria andBasicsalaryGreaterThanOrEqualTo(Float value) {
            addCriterion("basicSalary >=", value, "basicsalary");
            return (Criteria) this;
        }

        public Criteria andBasicsalaryLessThan(Float value) {
            addCriterion("basicSalary <", value, "basicsalary");
            return (Criteria) this;
        }

        public Criteria andBasicsalaryLessThanOrEqualTo(Float value) {
            addCriterion("basicSalary <=", value, "basicsalary");
            return (Criteria) this;
        }

        public Criteria andBasicsalaryIn(List<Float> values) {
            addCriterion("basicSalary in", values, "basicsalary");
            return (Criteria) this;
        }

        public Criteria andBasicsalaryNotIn(List<Float> values) {
            addCriterion("basicSalary not in", values, "basicsalary");
            return (Criteria) this;
        }

        public Criteria andBasicsalaryBetween(Float value1, Float value2) {
            addCriterion("basicSalary between", value1, value2, "basicsalary");
            return (Criteria) this;
        }

        public Criteria andBasicsalaryNotBetween(Float value1, Float value2) {
            addCriterion("basicSalary not between", value1, value2, "basicsalary");
            return (Criteria) this;
        }

        public Criteria andExtrasalaryIsNull() {
            addCriterion("extraSalary is null");
            return (Criteria) this;
        }

        public Criteria andExtrasalaryIsNotNull() {
            addCriterion("extraSalary is not null");
            return (Criteria) this;
        }

        public Criteria andExtrasalaryEqualTo(Float value) {
            addCriterion("extraSalary =", value, "extrasalary");
            return (Criteria) this;
        }

        public Criteria andExtrasalaryNotEqualTo(Float value) {
            addCriterion("extraSalary <>", value, "extrasalary");
            return (Criteria) this;
        }

        public Criteria andExtrasalaryGreaterThan(Float value) {
            addCriterion("extraSalary >", value, "extrasalary");
            return (Criteria) this;
        }

        public Criteria andExtrasalaryGreaterThanOrEqualTo(Float value) {
            addCriterion("extraSalary >=", value, "extrasalary");
            return (Criteria) this;
        }

        public Criteria andExtrasalaryLessThan(Float value) {
            addCriterion("extraSalary <", value, "extrasalary");
            return (Criteria) this;
        }

        public Criteria andExtrasalaryLessThanOrEqualTo(Float value) {
            addCriterion("extraSalary <=", value, "extrasalary");
            return (Criteria) this;
        }

        public Criteria andExtrasalaryIn(List<Float> values) {
            addCriterion("extraSalary in", values, "extrasalary");
            return (Criteria) this;
        }

        public Criteria andExtrasalaryNotIn(List<Float> values) {
            addCriterion("extraSalary not in", values, "extrasalary");
            return (Criteria) this;
        }

        public Criteria andExtrasalaryBetween(Float value1, Float value2) {
            addCriterion("extraSalary between", value1, value2, "extrasalary");
            return (Criteria) this;
        }

        public Criteria andExtrasalaryNotBetween(Float value1, Float value2) {
            addCriterion("extraSalary not between", value1, value2, "extrasalary");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismsalaryIsNull() {
            addCriterion("absenteeismSalary is null");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismsalaryIsNotNull() {
            addCriterion("absenteeismSalary is not null");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismsalaryEqualTo(Float value) {
            addCriterion("absenteeismSalary =", value, "absenteeismsalary");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismsalaryNotEqualTo(Float value) {
            addCriterion("absenteeismSalary <>", value, "absenteeismsalary");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismsalaryGreaterThan(Float value) {
            addCriterion("absenteeismSalary >", value, "absenteeismsalary");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismsalaryGreaterThanOrEqualTo(Float value) {
            addCriterion("absenteeismSalary >=", value, "absenteeismsalary");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismsalaryLessThan(Float value) {
            addCriterion("absenteeismSalary <", value, "absenteeismsalary");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismsalaryLessThanOrEqualTo(Float value) {
            addCriterion("absenteeismSalary <=", value, "absenteeismsalary");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismsalaryIn(List<Float> values) {
            addCriterion("absenteeismSalary in", values, "absenteeismsalary");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismsalaryNotIn(List<Float> values) {
            addCriterion("absenteeismSalary not in", values, "absenteeismsalary");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismsalaryBetween(Float value1, Float value2) {
            addCriterion("absenteeismSalary between", value1, value2, "absenteeismsalary");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismsalaryNotBetween(Float value1, Float value2) {
            addCriterion("absenteeismSalary not between", value1, value2, "absenteeismsalary");
            return (Criteria) this;
        }

        public Criteria andPerformancebonusIsNull() {
            addCriterion("performanceBonus is null");
            return (Criteria) this;
        }

        public Criteria andPerformancebonusIsNotNull() {
            addCriterion("performanceBonus is not null");
            return (Criteria) this;
        }

        public Criteria andPerformancebonusEqualTo(Float value) {
            addCriterion("performanceBonus =", value, "performancebonus");
            return (Criteria) this;
        }

        public Criteria andPerformancebonusNotEqualTo(Float value) {
            addCriterion("performanceBonus <>", value, "performancebonus");
            return (Criteria) this;
        }

        public Criteria andPerformancebonusGreaterThan(Float value) {
            addCriterion("performanceBonus >", value, "performancebonus");
            return (Criteria) this;
        }

        public Criteria andPerformancebonusGreaterThanOrEqualTo(Float value) {
            addCriterion("performanceBonus >=", value, "performancebonus");
            return (Criteria) this;
        }

        public Criteria andPerformancebonusLessThan(Float value) {
            addCriterion("performanceBonus <", value, "performancebonus");
            return (Criteria) this;
        }

        public Criteria andPerformancebonusLessThanOrEqualTo(Float value) {
            addCriterion("performanceBonus <=", value, "performancebonus");
            return (Criteria) this;
        }

        public Criteria andPerformancebonusIn(List<Float> values) {
            addCriterion("performanceBonus in", values, "performancebonus");
            return (Criteria) this;
        }

        public Criteria andPerformancebonusNotIn(List<Float> values) {
            addCriterion("performanceBonus not in", values, "performancebonus");
            return (Criteria) this;
        }

        public Criteria andPerformancebonusBetween(Float value1, Float value2) {
            addCriterion("performanceBonus between", value1, value2, "performancebonus");
            return (Criteria) this;
        }

        public Criteria andPerformancebonusNotBetween(Float value1, Float value2) {
            addCriterion("performanceBonus not between", value1, value2, "performancebonus");
            return (Criteria) this;
        }

        public Criteria andOtherbonusIsNull() {
            addCriterion("otherBonus is null");
            return (Criteria) this;
        }

        public Criteria andOtherbonusIsNotNull() {
            addCriterion("otherBonus is not null");
            return (Criteria) this;
        }

        public Criteria andOtherbonusEqualTo(Float value) {
            addCriterion("otherBonus =", value, "otherbonus");
            return (Criteria) this;
        }

        public Criteria andOtherbonusNotEqualTo(Float value) {
            addCriterion("otherBonus <>", value, "otherbonus");
            return (Criteria) this;
        }

        public Criteria andOtherbonusGreaterThan(Float value) {
            addCriterion("otherBonus >", value, "otherbonus");
            return (Criteria) this;
        }

        public Criteria andOtherbonusGreaterThanOrEqualTo(Float value) {
            addCriterion("otherBonus >=", value, "otherbonus");
            return (Criteria) this;
        }

        public Criteria andOtherbonusLessThan(Float value) {
            addCriterion("otherBonus <", value, "otherbonus");
            return (Criteria) this;
        }

        public Criteria andOtherbonusLessThanOrEqualTo(Float value) {
            addCriterion("otherBonus <=", value, "otherbonus");
            return (Criteria) this;
        }

        public Criteria andOtherbonusIn(List<Float> values) {
            addCriterion("otherBonus in", values, "otherbonus");
            return (Criteria) this;
        }

        public Criteria andOtherbonusNotIn(List<Float> values) {
            addCriterion("otherBonus not in", values, "otherbonus");
            return (Criteria) this;
        }

        public Criteria andOtherbonusBetween(Float value1, Float value2) {
            addCriterion("otherBonus between", value1, value2, "otherbonus");
            return (Criteria) this;
        }

        public Criteria andOtherbonusNotBetween(Float value1, Float value2) {
            addCriterion("otherBonus not between", value1, value2, "otherbonus");
            return (Criteria) this;
        }

        public Criteria andPayofftimeIsNull() {
            addCriterion("payoffTime is null");
            return (Criteria) this;
        }

        public Criteria andPayofftimeIsNotNull() {
            addCriterion("payoffTime is not null");
            return (Criteria) this;
        }

        public Criteria andPayofftimeEqualTo(Date value) {
            addCriterion("payoffTime =", value, "payofftime");
            return (Criteria) this;
        }

        public Criteria andPayofftimeNotEqualTo(Date value) {
            addCriterion("payoffTime <>", value, "payofftime");
            return (Criteria) this;
        }

        public Criteria andPayofftimeGreaterThan(Date value) {
            addCriterion("payoffTime >", value, "payofftime");
            return (Criteria) this;
        }

        public Criteria andPayofftimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payoffTime >=", value, "payofftime");
            return (Criteria) this;
        }

        public Criteria andPayofftimeLessThan(Date value) {
            addCriterion("payoffTime <", value, "payofftime");
            return (Criteria) this;
        }

        public Criteria andPayofftimeLessThanOrEqualTo(Date value) {
            addCriterion("payoffTime <=", value, "payofftime");
            return (Criteria) this;
        }

        public Criteria andPayofftimeIn(List<Date> values) {
            addCriterion("payoffTime in", values, "payofftime");
            return (Criteria) this;
        }

        public Criteria andPayofftimeNotIn(List<Date> values) {
            addCriterion("payoffTime not in", values, "payofftime");
            return (Criteria) this;
        }

        public Criteria andPayofftimeBetween(Date value1, Date value2) {
            addCriterion("payoffTime between", value1, value2, "payofftime");
            return (Criteria) this;
        }

        public Criteria andPayofftimeNotBetween(Date value1, Date value2) {
            addCriterion("payoffTime not between", value1, value2, "payofftime");
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