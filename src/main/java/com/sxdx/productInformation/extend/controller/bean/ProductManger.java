package com.sxdx.productInformation.extend.controller.bean;

import lombok.Data;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description:
 * @author: Likyeong
 * @date: 2020/3/14 20:25
 **/
@Data
public class ProductManger {
    private String path;
    private String authName;
    private Integer id;
    private Object children;
    private ProductManger1 productManger1;
    private ProductManger2 productManger2;
    private ProductManger3 productManger3;
}
