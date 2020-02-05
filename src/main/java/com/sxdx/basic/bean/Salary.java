package com.sxdx.basic.bean;

import java.util.Date;

public class Salary {
    private Integer id;

    private Float basicsalary;

    private Float extrasalary;

    private Float absenteeismsalary;

    private Float performancebonus;

    private Float otherbonus;

    private Date payofftime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(Float basicsalary) {
        this.basicsalary = basicsalary;
    }

    public Float getExtrasalary() {
        return extrasalary;
    }

    public void setExtrasalary(Float extrasalary) {
        this.extrasalary = extrasalary;
    }

    public Float getAbsenteeismsalary() {
        return absenteeismsalary;
    }

    public void setAbsenteeismsalary(Float absenteeismsalary) {
        this.absenteeismsalary = absenteeismsalary;
    }

    public Float getPerformancebonus() {
        return performancebonus;
    }

    public void setPerformancebonus(Float performancebonus) {
        this.performancebonus = performancebonus;
    }

    public Float getOtherbonus() {
        return otherbonus;
    }

    public void setOtherbonus(Float otherbonus) {
        this.otherbonus = otherbonus;
    }

    public Date getPayofftime() {
        return payofftime;
    }

    public void setPayofftime(Date payofftime) {
        this.payofftime = payofftime;
    }
}