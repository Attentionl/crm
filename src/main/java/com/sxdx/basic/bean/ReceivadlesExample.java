package com.sxdx.basic.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReceivadlesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceivadlesExample() {
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

        public Criteria andAmountreceivableIsNull() {
            addCriterion("amountReceivable is null");
            return (Criteria) this;
        }

        public Criteria andAmountreceivableIsNotNull() {
            addCriterion("amountReceivable is not null");
            return (Criteria) this;
        }

        public Criteria andAmountreceivableEqualTo(Float value) {
            addCriterion("amountReceivable =", value, "amountreceivable");
            return (Criteria) this;
        }

        public Criteria andAmountreceivableNotEqualTo(Float value) {
            addCriterion("amountReceivable <>", value, "amountreceivable");
            return (Criteria) this;
        }

        public Criteria andAmountreceivableGreaterThan(Float value) {
            addCriterion("amountReceivable >", value, "amountreceivable");
            return (Criteria) this;
        }

        public Criteria andAmountreceivableGreaterThanOrEqualTo(Float value) {
            addCriterion("amountReceivable >=", value, "amountreceivable");
            return (Criteria) this;
        }

        public Criteria andAmountreceivableLessThan(Float value) {
            addCriterion("amountReceivable <", value, "amountreceivable");
            return (Criteria) this;
        }

        public Criteria andAmountreceivableLessThanOrEqualTo(Float value) {
            addCriterion("amountReceivable <=", value, "amountreceivable");
            return (Criteria) this;
        }

        public Criteria andAmountreceivableIn(List<Float> values) {
            addCriterion("amountReceivable in", values, "amountreceivable");
            return (Criteria) this;
        }

        public Criteria andAmountreceivableNotIn(List<Float> values) {
            addCriterion("amountReceivable not in", values, "amountreceivable");
            return (Criteria) this;
        }

        public Criteria andAmountreceivableBetween(Float value1, Float value2) {
            addCriterion("amountReceivable between", value1, value2, "amountreceivable");
            return (Criteria) this;
        }

        public Criteria andAmountreceivableNotBetween(Float value1, Float value2) {
            addCriterion("amountReceivable not between", value1, value2, "amountreceivable");
            return (Criteria) this;
        }

        public Criteria andReceivabletimeIsNull() {
            addCriterion("receivableTime is null");
            return (Criteria) this;
        }

        public Criteria andReceivabletimeIsNotNull() {
            addCriterion("receivableTime is not null");
            return (Criteria) this;
        }

        public Criteria andReceivabletimeEqualTo(Date value) {
            addCriterion("receivableTime =", value, "receivabletime");
            return (Criteria) this;
        }

        public Criteria andReceivabletimeNotEqualTo(Date value) {
            addCriterion("receivableTime <>", value, "receivabletime");
            return (Criteria) this;
        }

        public Criteria andReceivabletimeGreaterThan(Date value) {
            addCriterion("receivableTime >", value, "receivabletime");
            return (Criteria) this;
        }

        public Criteria andReceivabletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receivableTime >=", value, "receivabletime");
            return (Criteria) this;
        }

        public Criteria andReceivabletimeLessThan(Date value) {
            addCriterion("receivableTime <", value, "receivabletime");
            return (Criteria) this;
        }

        public Criteria andReceivabletimeLessThanOrEqualTo(Date value) {
            addCriterion("receivableTime <=", value, "receivabletime");
            return (Criteria) this;
        }

        public Criteria andReceivabletimeIn(List<Date> values) {
            addCriterion("receivableTime in", values, "receivabletime");
            return (Criteria) this;
        }

        public Criteria andReceivabletimeNotIn(List<Date> values) {
            addCriterion("receivableTime not in", values, "receivabletime");
            return (Criteria) this;
        }

        public Criteria andReceivabletimeBetween(Date value1, Date value2) {
            addCriterion("receivableTime between", value1, value2, "receivabletime");
            return (Criteria) this;
        }

        public Criteria andReceivabletimeNotBetween(Date value1, Date value2) {
            addCriterion("receivableTime not between", value1, value2, "receivabletime");
            return (Criteria) this;
        }

        public Criteria andAmountreceivedIsNull() {
            addCriterion("amountReceived is null");
            return (Criteria) this;
        }

        public Criteria andAmountreceivedIsNotNull() {
            addCriterion("amountReceived is not null");
            return (Criteria) this;
        }

        public Criteria andAmountreceivedEqualTo(Float value) {
            addCriterion("amountReceived =", value, "amountreceived");
            return (Criteria) this;
        }

        public Criteria andAmountreceivedNotEqualTo(Float value) {
            addCriterion("amountReceived <>", value, "amountreceived");
            return (Criteria) this;
        }

        public Criteria andAmountreceivedGreaterThan(Float value) {
            addCriterion("amountReceived >", value, "amountreceived");
            return (Criteria) this;
        }

        public Criteria andAmountreceivedGreaterThanOrEqualTo(Float value) {
            addCriterion("amountReceived >=", value, "amountreceived");
            return (Criteria) this;
        }

        public Criteria andAmountreceivedLessThan(Float value) {
            addCriterion("amountReceived <", value, "amountreceived");
            return (Criteria) this;
        }

        public Criteria andAmountreceivedLessThanOrEqualTo(Float value) {
            addCriterion("amountReceived <=", value, "amountreceived");
            return (Criteria) this;
        }

        public Criteria andAmountreceivedIn(List<Float> values) {
            addCriterion("amountReceived in", values, "amountreceived");
            return (Criteria) this;
        }

        public Criteria andAmountreceivedNotIn(List<Float> values) {
            addCriterion("amountReceived not in", values, "amountreceived");
            return (Criteria) this;
        }

        public Criteria andAmountreceivedBetween(Float value1, Float value2) {
            addCriterion("amountReceived between", value1, value2, "amountreceived");
            return (Criteria) this;
        }

        public Criteria andAmountreceivedNotBetween(Float value1, Float value2) {
            addCriterion("amountReceived not between", value1, value2, "amountreceived");
            return (Criteria) this;
        }

        public Criteria andUncollectedamountIsNull() {
            addCriterion("uncollectedAmount is null");
            return (Criteria) this;
        }

        public Criteria andUncollectedamountIsNotNull() {
            addCriterion("uncollectedAmount is not null");
            return (Criteria) this;
        }

        public Criteria andUncollectedamountEqualTo(Float value) {
            addCriterion("uncollectedAmount =", value, "uncollectedamount");
            return (Criteria) this;
        }

        public Criteria andUncollectedamountNotEqualTo(Float value) {
            addCriterion("uncollectedAmount <>", value, "uncollectedamount");
            return (Criteria) this;
        }

        public Criteria andUncollectedamountGreaterThan(Float value) {
            addCriterion("uncollectedAmount >", value, "uncollectedamount");
            return (Criteria) this;
        }

        public Criteria andUncollectedamountGreaterThanOrEqualTo(Float value) {
            addCriterion("uncollectedAmount >=", value, "uncollectedamount");
            return (Criteria) this;
        }

        public Criteria andUncollectedamountLessThan(Float value) {
            addCriterion("uncollectedAmount <", value, "uncollectedamount");
            return (Criteria) this;
        }

        public Criteria andUncollectedamountLessThanOrEqualTo(Float value) {
            addCriterion("uncollectedAmount <=", value, "uncollectedamount");
            return (Criteria) this;
        }

        public Criteria andUncollectedamountIn(List<Float> values) {
            addCriterion("uncollectedAmount in", values, "uncollectedamount");
            return (Criteria) this;
        }

        public Criteria andUncollectedamountNotIn(List<Float> values) {
            addCriterion("uncollectedAmount not in", values, "uncollectedamount");
            return (Criteria) this;
        }

        public Criteria andUncollectedamountBetween(Float value1, Float value2) {
            addCriterion("uncollectedAmount between", value1, value2, "uncollectedamount");
            return (Criteria) this;
        }

        public Criteria andUncollectedamountNotBetween(Float value1, Float value2) {
            addCriterion("uncollectedAmount not between", value1, value2, "uncollectedamount");
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

        public Criteria andPaymentreminderIsNull() {
            addCriterion("paymentReminder is null");
            return (Criteria) this;
        }

        public Criteria andPaymentreminderIsNotNull() {
            addCriterion("paymentReminder is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentreminderEqualTo(String value) {
            addCriterion("paymentReminder =", value, "paymentreminder");
            return (Criteria) this;
        }

        public Criteria andPaymentreminderNotEqualTo(String value) {
            addCriterion("paymentReminder <>", value, "paymentreminder");
            return (Criteria) this;
        }

        public Criteria andPaymentreminderGreaterThan(String value) {
            addCriterion("paymentReminder >", value, "paymentreminder");
            return (Criteria) this;
        }

        public Criteria andPaymentreminderGreaterThanOrEqualTo(String value) {
            addCriterion("paymentReminder >=", value, "paymentreminder");
            return (Criteria) this;
        }

        public Criteria andPaymentreminderLessThan(String value) {
            addCriterion("paymentReminder <", value, "paymentreminder");
            return (Criteria) this;
        }

        public Criteria andPaymentreminderLessThanOrEqualTo(String value) {
            addCriterion("paymentReminder <=", value, "paymentreminder");
            return (Criteria) this;
        }

        public Criteria andPaymentreminderLike(String value) {
            addCriterion("paymentReminder like", value, "paymentreminder");
            return (Criteria) this;
        }

        public Criteria andPaymentreminderNotLike(String value) {
            addCriterion("paymentReminder not like", value, "paymentreminder");
            return (Criteria) this;
        }

        public Criteria andPaymentreminderIn(List<String> values) {
            addCriterion("paymentReminder in", values, "paymentreminder");
            return (Criteria) this;
        }

        public Criteria andPaymentreminderNotIn(List<String> values) {
            addCriterion("paymentReminder not in", values, "paymentreminder");
            return (Criteria) this;
        }

        public Criteria andPaymentreminderBetween(String value1, String value2) {
            addCriterion("paymentReminder between", value1, value2, "paymentreminder");
            return (Criteria) this;
        }

        public Criteria andPaymentreminderNotBetween(String value1, String value2) {
            addCriterion("paymentReminder not between", value1, value2, "paymentreminder");
            return (Criteria) this;
        }

        public Criteria andReminderidIsNull() {
            addCriterion("reminderId is null");
            return (Criteria) this;
        }

        public Criteria andReminderidIsNotNull() {
            addCriterion("reminderId is not null");
            return (Criteria) this;
        }

        public Criteria andReminderidEqualTo(Integer value) {
            addCriterion("reminderId =", value, "reminderid");
            return (Criteria) this;
        }

        public Criteria andReminderidNotEqualTo(Integer value) {
            addCriterion("reminderId <>", value, "reminderid");
            return (Criteria) this;
        }

        public Criteria andReminderidGreaterThan(Integer value) {
            addCriterion("reminderId >", value, "reminderid");
            return (Criteria) this;
        }

        public Criteria andReminderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reminderId >=", value, "reminderid");
            return (Criteria) this;
        }

        public Criteria andReminderidLessThan(Integer value) {
            addCriterion("reminderId <", value, "reminderid");
            return (Criteria) this;
        }

        public Criteria andReminderidLessThanOrEqualTo(Integer value) {
            addCriterion("reminderId <=", value, "reminderid");
            return (Criteria) this;
        }

        public Criteria andReminderidIn(List<Integer> values) {
            addCriterion("reminderId in", values, "reminderid");
            return (Criteria) this;
        }

        public Criteria andReminderidNotIn(List<Integer> values) {
            addCriterion("reminderId not in", values, "reminderid");
            return (Criteria) this;
        }

        public Criteria andReminderidBetween(Integer value1, Integer value2) {
            addCriterion("reminderId between", value1, value2, "reminderid");
            return (Criteria) this;
        }

        public Criteria andReminderidNotBetween(Integer value1, Integer value2) {
            addCriterion("reminderId not between", value1, value2, "reminderid");
            return (Criteria) this;
        }

        public Criteria andExtrareminderidIsNull() {
            addCriterion("extraReminderId is null");
            return (Criteria) this;
        }

        public Criteria andExtrareminderidIsNotNull() {
            addCriterion("extraReminderId is not null");
            return (Criteria) this;
        }

        public Criteria andExtrareminderidEqualTo(Integer value) {
            addCriterion("extraReminderId =", value, "extrareminderid");
            return (Criteria) this;
        }

        public Criteria andExtrareminderidNotEqualTo(Integer value) {
            addCriterion("extraReminderId <>", value, "extrareminderid");
            return (Criteria) this;
        }

        public Criteria andExtrareminderidGreaterThan(Integer value) {
            addCriterion("extraReminderId >", value, "extrareminderid");
            return (Criteria) this;
        }

        public Criteria andExtrareminderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("extraReminderId >=", value, "extrareminderid");
            return (Criteria) this;
        }

        public Criteria andExtrareminderidLessThan(Integer value) {
            addCriterion("extraReminderId <", value, "extrareminderid");
            return (Criteria) this;
        }

        public Criteria andExtrareminderidLessThanOrEqualTo(Integer value) {
            addCriterion("extraReminderId <=", value, "extrareminderid");
            return (Criteria) this;
        }

        public Criteria andExtrareminderidIn(List<Integer> values) {
            addCriterion("extraReminderId in", values, "extrareminderid");
            return (Criteria) this;
        }

        public Criteria andExtrareminderidNotIn(List<Integer> values) {
            addCriterion("extraReminderId not in", values, "extrareminderid");
            return (Criteria) this;
        }

        public Criteria andExtrareminderidBetween(Integer value1, Integer value2) {
            addCriterion("extraReminderId between", value1, value2, "extrareminderid");
            return (Criteria) this;
        }

        public Criteria andExtrareminderidNotBetween(Integer value1, Integer value2) {
            addCriterion("extraReminderId not between", value1, value2, "extrareminderid");
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