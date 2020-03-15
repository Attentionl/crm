package com.sxdx.customer.extend;

import com.sxdx.customer.extend.CusExtends.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description: 客户管理模块栏目
 * @author: 毕必成
 * @date: 2020/3/15 16:28
 **/
public class CusMenu {
    public static CusManager getCusManger(){
        CusManager cus = new CusManager();
        cus.setId(1);
        cus.setAuthName("客户管理");
        CusInfoManager cusInfoManager = new CusInfoManager();


        cusInfoManager.setId(12);
        cusInfoManager.setAuthName("客户信息管理");
        cusInfoManager.setPath(null);

        CusLinkManager cusLinkManager = new CusLinkManager();
        cusLinkManager.setId(13);
        cusLinkManager.setAuthName("客户联系人管理");
        cusLinkManager.setPath(null);

        FollowManager followManager = new FollowManager();
        followManager.setAuthName("跟进管理");
        followManager.setPath(null);
        followManager.setId(14);

        CusList cusList = new CusList();
        cusList.setAuthName("客户列表");
        cusList.setPath(null);
        cusList.setId(15);


        Map<String, Object> map = new HashMap<String, Object>();
        map.put(cusInfoManager.getAuthName(),cusInfoManager);
        map.put(cusLinkManager.getAuthName(),cusLinkManager);
        map.put(followManager.getAuthName(),followManager);
        map.put(cusList.getAuthName(),cusList);

        cus.setChildren((HashMap) map);
        return cus;
    }
}
