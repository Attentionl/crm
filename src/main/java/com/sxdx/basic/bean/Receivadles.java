package com.sxdx.basic.bean;

import java.util.Date;

public class Receivadles {
    private Integer receivablesid;

    private Integer contractid;

    private Float amountreceivable;

    private Date receivabletime;

    private Float amountreceived;

    private Float uncollectedamount;

    private Integer createrid;

    private Date createtime;

    private String paymentreminder;

    private Integer reminderid;

    private Integer extrareminderid;

    private String remark;

    public Integer getReceivablesid() {
        return receivablesid;
    }

    public void setReceivablesid(Integer receivablesid) {
        this.receivablesid = receivablesid;
    }

    public Integer getContractid() {
        return contractid;
    }

    public void setContractid(Integer contractid) {
        this.contractid = contractid;
    }

    public Float getAmountreceivable() {
        return amountreceivable;
    }

    public void setAmountreceivable(Float amountreceivable) {
        this.amountreceivable = amountreceivable;
    }

    public Date getReceivabletime() {
        return receivabletime;
    }

    public void setReceivabletime(Date receivabletime) {
        this.receivabletime = receivabletime;
    }

    public Float getAmountreceived() {
        return amountreceived;
    }

    public void setAmountreceived(Float amountreceived) {
        this.amountreceived = amountreceived;
    }

    public Float getUncollectedamount() {
        return uncollectedamount;
    }

    public void setUncollectedamount(Float uncollectedamount) {
        this.uncollectedamount = uncollectedamount;
    }

    public Integer getCreaterid() {
        return createrid;
    }

    public void setCreaterid(Integer createrid) {
        this.createrid = createrid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getPaymentreminder() {
        return paymentreminder;
    }

    public void setPaymentreminder(String paymentreminder) {
        this.paymentreminder = paymentreminder == null ? null : paymentreminder.trim();
    }

    public Integer getReminderid() {
        return reminderid;
    }

    public void setReminderid(Integer reminderid) {
        this.reminderid = reminderid;
    }

    public Integer getExtrareminderid() {
        return extrareminderid;
    }

    public void setExtrareminderid(Integer extrareminderid) {
        this.extrareminderid = extrareminderid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}