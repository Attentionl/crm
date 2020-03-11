package com.sxdx.customer.extend.controller;

import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.customer.extend.CusExtends.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 毕必成
 * @description 客户管理controller
 * @data 2020-02-2020/2/20
 **/
@RestController
@RequestMapping("/user")
@Transactional
public class CusManagerController {

    @GetMapping("menu")
    public Message getCusManager(){
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

        Map<String,Object> map1 = new HashMap<String,Object>();

        map1.put("data",cus);

        return MessageUtil.success(map1);
    }
}
