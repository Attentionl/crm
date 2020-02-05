package com.sxdx.basic.bean;

import java.util.Date;

public class Refund {
    private Integer refundid;

    private Integer receivablesid;

    private Integer contractid;

    private Float refundamount;

    private Date refundtime;

    private Integer createrid;

    private Date createtime;

    private String ifreceipt;

    private String remark;

    public Integer getRefundid() {
        return refundid;
    }

    public void setRefundid(Integer refundid) {
        this.refundid = refundid;
    }

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

    public Float getRefundamount() {
        return refundamount;
    }

    public void setRefundamount(Float refundamount) {
        this.refundamount = refundamount;
    }

    public Date getRefundtime() {
        return refundtime;
    }

    public void setRefundtime(Date refundtime) {
        this.refundtime = refundtime;
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

    public String getIfreceipt() {
        return ifreceipt;
    }

    public void setIfreceipt(String ifreceipt) {
        this.ifreceipt = ifreceipt == null ? null : ifreceipt.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}