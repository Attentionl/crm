package com.sxdx.basic.bean;

import java.util.Date;

public class Account {
    private Integer id;

    private String type;

    private String name;

    private String password;

    private String privilege;

    private Date lastlogintime;

    private Date lastlogouttime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege == null ? null : privilege.trim();
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Date getLastlogouttime() {
        return lastlogouttime;
    }

    public void setLastlogouttime(Date lastlogouttime) {
        this.lastlogouttime = lastlogouttime;
    }
}