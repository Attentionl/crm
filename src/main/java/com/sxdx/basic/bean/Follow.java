package com.sxdx.basic.bean;

import java.util.Date;

public class Follow {
    private Integer id;

    private Integer cusid;

    private Integer employeeid;

    private String state;

    private Date nextdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCusid() {
        return cusid;
    }

    public void setCusid(Integer cusid) {
        this.cusid = cusid;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getNextdate() {
        return nextdate;
    }

    public void setNextdate(Date nextdate) {
        this.nextdate = nextdate;
    }
}