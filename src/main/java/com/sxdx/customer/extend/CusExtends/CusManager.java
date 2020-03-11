package com.sxdx.customer.extend.CusExtends;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author 毕必成
 * @description 客户管理
 * @data 2020-02-2020/2/20
 **/
public class CusManager implements Serializable {

    private Integer id;
    private String authName;
    private String path = null;
    private HashMap<String,Object> children;


    //客户信息管理
    private CusInfoManager cusInfoManager;
    //客户列表
    private CusList cusList;
    //联系人管理
    private CusLinkManager cusLinkManager;
    //跟进管理
    private FollowManager followManager;

    public CusManager() {
    }

    public HashMap<String, Object> getChildren() {
        return children;
    }

    public void setChildren(HashMap<String, Object> children) {
        this.children = children;
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

    public CusInfoManager getCusInfoManager() {
        return cusInfoManager;
    }

    public CusList getCusList() {
        return cusList;
    }

    public CusLinkManager getCusLinkManager() {
        return cusLinkManager;
    }

    public FollowManager getFollowManager() {
        return followManager;
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

    public void setCusInfoManager(CusInfoManager cusInfoManager) {
        this.cusInfoManager = cusInfoManager;
    }

    public void setCusList(CusList cusList) {
        this.cusList = cusList;
    }

    public void setCusLinkManager(CusLinkManager cusLinkManager) {
        this.cusLinkManager = cusLinkManager;
    }

    public void setFollowManager(FollowManager followManager) {
        this.followManager = followManager;
    }
    @Override
    public String toString() {
        return "CusManager{" +
                "id=" + id +
                ", authName='" + authName + '\'' +
                ", path='" + path + '\'' +
                ", children=" + children +
                ", cusInfoManager=" + cusInfoManager +
                ", cusList=" + cusList +
                ", cusLinkManager=" + cusLinkManager +
                ", followManager=" + followManager +
                '}';
    }

}
