package com.sxdx.productInformation.extend.controller;

import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.productInformation.extend.controller.bean.ProductManger;
import com.sxdx.productInformation.extend.controller.bean.ProductManger1;
import com.sxdx.productInformation.extend.controller.bean.ProductManger2;
import com.sxdx.productInformation.extend.controller.bean.ProductManger3;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
*@Author: LiKyeong
*@since: JDK 1.8
*@Description: 公告管理模块前端显示栏目
*@Return: 
*@Param: 
*@Date: 19:26 2020/3/12
**/
@RestController
@RequestMapping("/anno")
@Transactional
public class ProductManegerController {

    @GetMapping("product")
    public Message getCusManager(){
        ProductManger annoInfoManger=new ProductManger();
        annoInfoManger.setId(3);
        annoInfoManger.setAuthName("产品栏目");


        ProductManger1 annoInfoManger1=new ProductManger1();
        annoInfoManger1.setId(31);
        annoInfoManger1.setAuthName("产品销售管理");
        annoInfoManger1.setPath("payProduct");

        ProductManger2 annoInfoManger2=new ProductManger2();
        annoInfoManger2.setId(32);
        annoInfoManger2.setAuthName("已售产品管理");
        annoInfoManger2.setPath("purchaseProduct");

        ProductManger3 annoInfoManger3=new ProductManger3();
        annoInfoManger3.setId(33);
        annoInfoManger3.setAuthName("产品生产管理");
        annoInfoManger3.setPath("getProduct");

        Map<String, Object> map = new HashMap<String, Object>();
        map.put(annoInfoManger1.getAuthName(),annoInfoManger1);
        map.put(annoInfoManger2.getAuthName(),annoInfoManger2);
        map.put(annoInfoManger3.getAuthName(),annoInfoManger3);

        annoInfoManger.setChildren((HashMap) map);

        Map<String,Object> map1 = new HashMap<String,Object>();

        map1.put("data",annoInfoManger);

        return MessageUtil.success(map1);
    }
}
