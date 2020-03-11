package com.sxdx.customer.extend.CusExtends;

import java.io.Serializable;

/**
 * @author 毕必成
 * @description 客户信息管理
 * @data 2020-02-2020/2/20
 **/
public class CusInfoManager implements Serializable {

    private Integer id;
    private String authName;
    private String path;

    public CusInfoManager() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getId() {
        return id;
    }

    public String getAuthName() {
        return authName;
    }

    public String getPath() {
        return path;
    }
}
