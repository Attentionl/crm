package com.sxdx.announcementInformation.extend.controller.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description:
 * @author: Likyeong
 * @date: 2020/3/14 21:46
 **/
public class AnnoMenu {
    public static AnnoInfoManger getAnno(){
        AnnoInfoManger annoInfoManger=new AnnoInfoManger();
        annoInfoManger.setId(2);
        annoInfoManger.setAuthName("公告栏目");


        AnnoInfo1Manger annoInfoManger1=new AnnoInfo1Manger();
        annoInfoManger1.setId(21);
        annoInfoManger1.setAuthName("客户公告管理");
        annoInfoManger1.setPath("cusAnno");

        AnnoInfo2Manger annoInfoManger2=new AnnoInfo2Manger();
        annoInfoManger2.setId(22);
        annoInfoManger2.setAuthName("员工公告管理");
        annoInfoManger2.setPath("emAnno");

        Map<String, Object> map = new HashMap<String, Object>();
        map.put(annoInfoManger1.getAuthName(),annoInfoManger1);
        map.put(annoInfoManger2.getAuthName(),annoInfoManger2);

        annoInfoManger.setChildren((HashMap) map);
        return  annoInfoManger;
    }
}
