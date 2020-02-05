package com.sxdx.basic.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefundExample() {
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

        public Criteria andReceivablesidIsNull() {
            addCriterion("receivablesId is null");
            return (Criteria) this;
        }

        public Criteria andReceivablesidIsNotNull() {
            addCriterion("receivablesId is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablesidEqualTo(Integer value) {
            addCriterion("receivablesId =", value, "receivablesid");
            return (Criteria) this;
        }

        public Criteria andReceivablesidNotEqualTo(Integer value) {
            addCriterion("receivablesId <>", value, "receivablesid");
            return (Criteria) this;
        }

        public Criteria andReceivablesidGreaterThan(Integer value) {
            addCriterion("receivablesId >", value, "receivablesid");
            return (Criteria) this;
        }

        public Criteria andReceivablesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("receivablesId >=", value, "receivablesid");
            return (Criteria) this;
        }

        public Criteria andReceivablesidLessThan(Integer value) {
            addCriterion("receivablesId <", value, "receivablesid");
            return (Criteria) this;
        }

        public Criteria andReceivablesidLessThanOrEqualTo(Integer value) {
            addCriterion("receivablesId <=", value, "receivablesid");
            return (Criteria) this;
        }

        public Criteria andReceivablesidIn(List<Integer> values) {
            addCriterion("receivablesId in", values, "receivablesid");
            return (Criteria) this;
        }

        public Criteria andReceivablesidNotIn(List<Integer> values) {
            addCriterion("receivablesId not in", values, "receivablesid");
            return (Criteria) this;
        }

        public Criteria andReceivablesidBetween(Integer value1, Integer value2) {
            addCriterion("receivablesId between", value1, value2, "receivablesid");
            return (Criteria) this;
        }

        public Criteria andReceivablesidNotBetween(Integer value1, Integer value2) {
            addCriterion("receivablesId not between", value1, value2, "receivablesid");
            return (Criteria) this;
        }

        public Criteria andContractidIsNull() {
            addCriterion("contractId is null");
            return (Criteria) this;
        }

        public Criteria andContractidIsNotNull() {
            addCriterion("contractId is not null");
            return (Criteria) this;
        }

        public Criteria andContractidEqualTo(Integer value) {
            addCriterion("contractId =", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotEqualTo(Integer value) {
            addCriterion("contractId <>", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThan(Integer value) {
            addCriterion("contractId >", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThanOrEqualTo(Integer value) {
            addCriterion("contractId >=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThan(Integer value) {
            addCriterion("contractId <", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThanOrEqualTo(Integer value) {
            addCriterion("contractId <=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidIn(List<Integer> values) {
            addCriterion("contractId in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotIn(List<Integer> values) {
            addCriterion("contractId not in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidBetween(Integer value1, Integer value2) {
            addCriterion("contractId between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotBetween(Integer value1, Integer value2) {
            addCriterion("contractId not between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andRefundamountIsNull() {
            addCriterion("refundAmount is null");
            return (Criteria) this;
        }

        public Criteria andRefundamountIsNotNull() {
            addCriterion("refundAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundamountEqualTo(Float value) {
            addCriterion("refundAmount =", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotEqualTo(Float value) {
            addCriterion("refundAmount <>", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountGreaterThan(Float value) {
            addCriterion("refundAmount >", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountGreaterThanOrEqualTo(Float value) {
            addCriterion("refundAmount >=", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountLessThan(Float value) {
            addCriterion("refundAmount <", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountLessThanOrEqualTo(Float value) {
            addCriterion("refundAmount <=", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountIn(List<Float> values) {
            addCriterion("refundAmount in", values, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotIn(List<Float> values) {
            addCriterion("refundAmount not in", values, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountBetween(Float value1, Float value2) {
            addCriterion("refundAmount between", value1, value2, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotBetween(Float value1, Float value2) {
            addCriterion("refundAmount not between", value1, value2, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundtimeIsNull() {
            addCriterion("refundTime is null");
            return (Criteria) this;
        }

        public Criteria andRefundtimeIsNotNull() {
            addCriterion("refundTime is not null");
            return (Criteria) this;
        }

        public Criteria andRefundtimeEqualTo(Date value) {
            addCriterion("refundTime =", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeNotEqualTo(Date value) {
            addCriterion("refundTime <>", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeGreaterThan(Date value) {
            addCriterion("refundTime >", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refundTime >=", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeLessThan(Date value) {
            addCriterion("refundTime <", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeLessThanOrEqualTo(Date value) {
            addCriterion("refundTime <=", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeIn(List<Date> values) {
            addCriterion("refundTime in", values, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeNotIn(List<Date> values) {
            addCriterion("refundTime not in", values, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeBetween(Date value1, Date value2) {
            addCriterion("refundTime between", value1, value2, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeNotBetween(Date value1, Date value2) {
            addCriterion("refundTime not between", value1, value2, "refundtime");
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

        public Criteria andIfreceiptIsNull() {
            addCriterion("ifReceipt is null");
            return (Criteria) this;
        }

        public Criteria andIfreceiptIsNotNull() {
            addCriterion("ifReceipt is not null");
            return (Criteria) this;
        }

        public Criteria andIfreceiptEqualTo(String value) {
            addCriterion("ifReceipt =", value, "ifreceipt");
            return (Criteria) this;
        }

        public Criteria andIfreceiptNotEqualTo(String value) {
            addCriterion("ifReceipt <>", value, "ifreceipt");
            return (Criteria) this;
        }

        public Criteria andIfreceiptGreaterThan(String value) {
            addCriterion("ifReceipt >", value, "ifreceipt");
            return (Criteria) this;
        }

        public Criteria andIfreceiptGreaterThanOrEqualTo(String value) {
            addCriterion("ifReceipt >=", value, "ifreceipt");
            return (Criteria) this;
        }

        public Criteria andIfreceiptLessThan(String value) {
            addCriterion("ifReceipt <", value, "ifreceipt");
            return (Criteria) this;
        }

        public Criteria andIfreceiptLessThanOrEqualTo(String value) {
            addCriterion("ifReceipt <=", value, "ifreceipt");
            return (Criteria) this;
        }

        public Criteria andIfreceiptLike(String value) {
            addCriterion("ifReceipt like", value, "ifreceipt");
            return (Criteria) this;
        }

        public Criteria andIfreceiptNotLike(String value) {
            addCriterion("ifReceipt not like", value, "ifreceipt");
            return (Criteria) this;
        }

        public Criteria andIfreceiptIn(List<String> values) {
            addCriterion("ifReceipt in", values, "ifreceipt");
            return (Criteria) this;
        }

        public Criteria andIfreceiptNotIn(List<String> values) {
            addCriterion("ifReceipt not in", values, "ifreceipt");
            return (Criteria) this;
        }

        public Criteria andIfreceiptBetween(String value1, String value2) {
            addCriterion("ifReceipt between", value1, value2, "ifreceipt");
            return (Criteria) this;
        }

        public Criteria andIfreceiptNotBetween(String value1, String value2) {
            addCriterion("ifReceipt not between", value1, value2, "ifreceipt");
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