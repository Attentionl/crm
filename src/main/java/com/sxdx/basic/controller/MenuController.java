package com.sxdx.basic.controller;

import com.sxdx.announcementInformation.extend.controller.bean.AnnoInfoManger;
import com.sxdx.announcementInformation.extend.controller.bean.AnnoMenu;
import com.sxdx.basic.controller.bean.MenuModel;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.customer.extend.CusExtends.CusManager;
import com.sxdx.customer.extend.CusMenu;
import com.sxdx.productInformation.extend.controller.bean.ProductManger;
import com.sxdx.productInformation.extend.controller.bean.ProductMenu;
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
@RequestMapping("/user")
@Transactional
public class MenuController {

    @GetMapping("menu")
    public Message getTest(){
        MenuModel menuModel=new MenuModel();
        AnnoInfoManger anno = AnnoMenu.getAnno();
        ProductManger product = ProductMenu.getProduct();
        CusManager cusManager= CusMenu.getCusManger();
        menuModel.setProductManger(product);
        menuModel.setAnnoInfoManger(anno);
        menuModel.setCusManager(cusManager);
        Map<String,Object> map2 = new HashMap<String,Object>();

        map2.put("data",menuModel);

        return MessageUtil.success(map2);
    }
}
