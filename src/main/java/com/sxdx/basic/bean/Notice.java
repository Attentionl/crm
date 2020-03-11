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
 * @date: 2020/2/22 11:32
 **/
@Getter
@Setter
@ToString
public class Notice {
    private Integer id;

    private String name;

    private String content;

    private Integer times;

    private Date publishtime;

    private Date outtime;

    private Integer publisherid;

    private String status;
}