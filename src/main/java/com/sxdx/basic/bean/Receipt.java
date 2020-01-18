package com.sxdx.basic.bean;

import java.util.Date;

public class Receipt {
    private Integer receiptid;

    private Integer id;

    private Integer refundid;

    private String receipttype;

    private Float receiptamount;

    private Date receiptdate;

    private Integer createrid;

    private Date createtime;

    private String remark;

    public Integer getReceiptid() {
        return receiptid;
    }

    public void setReceiptid(Integer receiptid) {
        this.receiptid = receiptid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRefundid() {
        return refundid;
    }

    public void setRefundid(Integer refundid) {
        this.refundid = refundid;
    }

    public String getReceipttype() {
        return receipttype;
    }

    public void setReceipttype(String receipttype) {
        this.receipttype = receipttype == null ? null : receipttype.trim();
    }

    public Float getReceiptamount() {
        return receiptamount;
    }

    public void setReceiptamount(Float receiptamount) {
        this.receiptamount = receiptamount;
    }

    public Date getReceiptdate() {
        return receiptdate;
    }

    public void setReceiptdate(Date receiptdate) {
        this.receiptdate = receiptdate;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}