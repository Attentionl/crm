package com.sxdx.basic.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReceiptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceiptExample() {
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

        public Criteria andReceiptidIsNull() {
            addCriterion("receiptId is null");
            return (Criteria) this;
        }

        public Criteria andReceiptidIsNotNull() {
            addCriterion("receiptId is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptidEqualTo(Integer value) {
            addCriterion("receiptId =", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotEqualTo(Integer value) {
            addCriterion("receiptId <>", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidGreaterThan(Integer value) {
            addCriterion("receiptId >", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiptId >=", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidLessThan(Integer value) {
            addCriterion("receiptId <", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidLessThanOrEqualTo(Integer value) {
            addCriterion("receiptId <=", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidIn(List<Integer> values) {
            addCriterion("receiptId in", values, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotIn(List<Integer> values) {
            addCriterion("receiptId not in", values, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidBetween(Integer value1, Integer value2) {
            addCriterion("receiptId between", value1, value2, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotBetween(Integer value1, Integer value2) {
            addCriterion("receiptId not between", value1, value2, "receiptid");
            return (Criteria) this;
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

        public Criteria andRefundidIsNull() {
            addCriterion("refundId is null");
            return (Criteria) this;
        }

        public Criteria andRefundidIsNotNull() {
            addCriterion("refundId is not null");
            return (Criteria) this;
        }

        public Criteria andRefundidEqualTo(Integer value) {
            addCriterion("refundId =", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidNotEqualTo(Integer value) {
            addCriterion("refundId <>", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidGreaterThan(Integer value) {
            addCriterion("refundId >", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidGreaterThanOrEqualTo(Integer value) {
            addCriterion("refundId >=", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidLessThan(Integer value) {
            addCriterion("refundId <", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidLessThanOrEqualTo(Integer value) {
            addCriterion("refundId <=", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidIn(List<Integer> values) {
            addCriterion("refundId in", values, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidNotIn(List<Integer> values) {
            addCriterion("refundId not in", values, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidBetween(Integer value1, Integer value2) {
            addCriterion("refundId between", value1, value2, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidNotBetween(Integer value1, Integer value2) {
            addCriterion("refundId not between", value1, value2, "refundid");
            return (Criteria) this;
        }

        public Criteria andReceipttypeIsNull() {
            addCriterion("receiptType is null");
            return (Criteria) this;
        }

        public Criteria andReceipttypeIsNotNull() {
            addCriterion("receiptType is not null");
            return (Criteria) this;
        }

        public Criteria andReceipttypeEqualTo(String value) {
            addCriterion("receiptType =", value, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNotEqualTo(String value) {
            addCriterion("receiptType <>", value, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeGreaterThan(String value) {
            addCriterion("receiptType >", value, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeGreaterThanOrEqualTo(String value) {
            addCriterion("receiptType >=", value, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeLessThan(String value) {
            addCriterion("receiptType <", value, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeLessThanOrEqualTo(String value) {
            addCriterion("receiptType <=", value, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeLike(String value) {
            addCriterion("receiptType like", value, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNotLike(String value) {
            addCriterion("receiptType not like", value, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeIn(List<String> values) {
            addCriterion("receiptType in", values, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNotIn(List<String> values) {
            addCriterion("receiptType not in", values, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeBetween(String value1, String value2) {
            addCriterion("receiptType between", value1, value2, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceipttypeNotBetween(String value1, String value2) {
            addCriterion("receiptType not between", value1, value2, "receipttype");
            return (Criteria) this;
        }

        public Criteria andReceiptamountIsNull() {
            addCriterion("receiptAmount is null");
            return (Criteria) this;
        }

        public Criteria andReceiptamountIsNotNull() {
            addCriterion("receiptAmount is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptamountEqualTo(Float value) {
            addCriterion("receiptAmount =", value, "receiptamount");
            return (Criteria) this;
        }

        public Criteria andReceiptamountNotEqualTo(Float value) {
            addCriterion("receiptAmount <>", value, "receiptamount");
            return (Criteria) this;
        }

        public Criteria andReceiptamountGreaterThan(Float value) {
            addCriterion("receiptAmount >", value, "receiptamount");
            return (Criteria) this;
        }

        public Criteria andReceiptamountGreaterThanOrEqualTo(Float value) {
            addCriterion("receiptAmount >=", value, "receiptamount");
            return (Criteria) this;
        }

        public Criteria andReceiptamountLessThan(Float value) {
            addCriterion("receiptAmount <", value, "receiptamount");
            return (Criteria) this;
        }

        public Criteria andReceiptamountLessThanOrEqualTo(Float value) {
            addCriterion("receiptAmount <=", value, "receiptamount");
            return (Criteria) this;
        }

        public Criteria andReceiptamountIn(List<Float> values) {
            addCriterion("receiptAmount in", values, "receiptamount");
            return (Criteria) this;
        }

        public Criteria andReceiptamountNotIn(List<Float> values) {
            addCriterion("receiptAmount not in", values, "receiptamount");
            return (Criteria) this;
        }

        public Criteria andReceiptamountBetween(Float value1, Float value2) {
            addCriterion("receiptAmount between", value1, value2, "receiptamount");
            return (Criteria) this;
        }

        public Criteria andReceiptamountNotBetween(Float value1, Float value2) {
            addCriterion("receiptAmount not between", value1, value2, "receiptamount");
            return (Criteria) this;
        }

        public Criteria andReceiptdateIsNull() {
            addCriterion("receiptDate is null");
            return (Criteria) this;
        }

        public Criteria andReceiptdateIsNotNull() {
            addCriterion("receiptDate is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptdateEqualTo(Date value) {
            addCriterion("receiptDate =", value, "receiptdate");
            return (Criteria) this;
        }

        public Criteria andReceiptdateNotEqualTo(Date value) {
            addCriterion("receiptDate <>", value, "receiptdate");
            return (Criteria) this;
        }

        public Criteria andReceiptdateGreaterThan(Date value) {
            addCriterion("receiptDate >", value, "receiptdate");
            return (Criteria) this;
        }

        public Criteria andReceiptdateGreaterThanOrEqualTo(Date value) {
            addCriterion("receiptDate >=", value, "receiptdate");
            return (Criteria) this;
        }

        public Criteria andReceiptdateLessThan(Date value) {
            addCriterion("receiptDate <", value, "receiptdate");
            return (Criteria) this;
        }

        public Criteria andReceiptdateLessThanOrEqualTo(Date value) {
            addCriterion("receiptDate <=", value, "receiptdate");
            return (Criteria) this;
        }

        public Criteria andReceiptdateIn(List<Date> values) {
            addCriterion("receiptDate in", values, "receiptdate");
            return (Criteria) this;
        }

        public Criteria andReceiptdateNotIn(List<Date> values) {
            addCriterion("receiptDate not in", values, "receiptdate");
            return (Criteria) this;
        }

        public Criteria andReceiptdateBetween(Date value1, Date value2) {
            addCriterion("receiptDate between", value1, value2, "receiptdate");
            return (Criteria) this;
        }

        public Criteria andReceiptdateNotBetween(Date value1, Date value2) {
            addCriterion("receiptDate not between", value1, value2, "receiptdate");
            return (Criteria) this;
        }

        public Criteria andCreateridIsNull() {
            addCriterion("createrId is null");
            return (Criteria) this;
        }

        public Criteria andCreateridIsNotNull() {
            addCriterion("createrId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateridEqualTo(Integer value) {
            addCriterion("createrId =", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridNotEqualTo(Integer value) {
            addCriterion("createrId <>", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridGreaterThan(Integer value) {
            addCriterion("createrId >", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridGreaterThanOrEqualTo(Integer value) {
            addCriterion("createrId >=", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridLessThan(Integer value) {
            addCriterion("createrId <", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridLessThanOrEqualTo(Integer value) {
            addCriterion("createrId <=", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridIn(List<Integer> values) {
            addCriterion("createrId in", values, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridNotIn(List<Integer> values) {
            addCriterion("createrId not in", values, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridBetween(Integer value1, Integer value2) {
            addCriterion("createrId between", value1, value2, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridNotBetween(Integer value1, Integer value2) {
            addCriterion("createrId not between", value1, value2, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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