package com.sxdx.announcementInformation.extend.controller.bean;

import lombok.Data;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description:
 * @author: Likyeong
 * @date: 2020/3/14 20:25
 **/
@Data
public class AnnoInfoManger {
    private String path;
    private String authName;
    private Integer id;
    private Object children;
    private  AnnoInfo1Manger annoInfo1Manger;
    private  AnnoInfo2Manger annoInfo2Manger;
}
