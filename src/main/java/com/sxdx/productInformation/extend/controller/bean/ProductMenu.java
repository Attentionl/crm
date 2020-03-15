package com.sxdx.productInformation.extend.controller.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description:
 * @author: Likyeong
 * @date: 2020/3/14 21:46
 **/
public class ProductMenu {
    public static ProductManger getProduct(){
        ProductManger productManger=new ProductManger();
        productManger.setId(3);
        productManger.setAuthName("产品栏目");


        ProductManger1 productManger1=new ProductManger1();
        productManger1.setId(31);
        productManger1.setAuthName("产品销售管理");
        productManger1.setPath("payProduct");

        ProductManger2 productManger2=new ProductManger2();
        productManger2.setId(32);
        productManger2.setAuthName("已售产品管理");
        productManger2.setPath("purchaseProduct");

        ProductManger3 productManger3=new ProductManger3();
        productManger3.setId(33);
        productManger3.setAuthName("产品生产管理");
        productManger3.setPath("getProduct");

        Map<String, Object> map = new HashMap<String, Object>();
        map.put(productManger1.getAuthName(),productManger1);
        map.put(productManger2.getAuthName(),productManger2);
        map.put(productManger3.getAuthName(),productManger3);

        productManger.setChildren((HashMap) map);
        return  productManger;
    }
}
