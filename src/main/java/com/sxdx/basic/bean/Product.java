package com.sxdx.basic.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description:
 * @author: Likyeong
 * @date: 2020/3/4 15:24
 **/
@Getter
@Setter
@ToString
public class Product {
    private Integer id;

    private Integer parentid;

    private String name;

    private String category;

    private Double costprice;

    private Double sellingprice;

    private String describtion;

    private String stock;
}