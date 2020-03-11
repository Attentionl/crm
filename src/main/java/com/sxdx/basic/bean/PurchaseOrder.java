package com.sxdx.basic.bean;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description:
 * @author: Likyeong
 * @date: 2020/3/4 16:05
 **/
@Getter
@Setter
@ToString
public class PurchaseOrder {
    private String id;

    private Integer customerId;

    private Integer productId;

    private Double amount;

    private Date createTime;
}