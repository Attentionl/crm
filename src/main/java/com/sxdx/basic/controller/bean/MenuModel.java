package com.sxdx.basic.controller.bean;

import com.sxdx.announcementInformation.extend.controller.bean.AnnoInfoManger;
import com.sxdx.customer.extend.CusExtends.CusInfoManager;
import com.sxdx.customer.extend.CusExtends.CusManager;
import com.sxdx.productInformation.extend.controller.bean.ProductManger;
import lombok.Data;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description: 栏目公共类,根据属性的顺序决定前端栏目数据显示的先后
 * @author: Likyeong
 * @date: 2020/3/15 16:22
 **/
@Data
public class MenuModel {
    //公告管理栏目
    private AnnoInfoManger annoInfoManger;
    //客户管理类栏目
    private CusManager cusManager;
    //产品管理栏目
    private ProductManger productManger;

}
