package com.sxdx.zw.controller;

import com.sxdx.basic.bean.Orderform;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.zw.service.OrderformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangwei
 * @className OrderformFormController
 * @version1.0
 * @description
 * @createdTime 2020/2/15 19:36
 */
@RestController("orderform")
public class orderformController {
    @Autowired
    private OrderformService orderformService;
    //添加
    @PostMapping(value = "addOrderform")
    public Message addOrderform(Orderform orderform){
        int i = orderformService.addOrderform(orderform);
        if (i != 0) {
            //1代表success
            return MessageUtil.success("success", "status", 1);
        } else {
            //0代表fail
            return MessageUtil.success("fail", "status", 0);
        }
    }
    //通过id删除
    @GetMapping(value = "deletOrderformById")
    public Message deleteOrderformById( Integer id){
        int i =orderformService.deleteOrderformById(id);
        if (i != 0) {
            //1代表success
            return MessageUtil.success("success", "status", 1);
        } else {
            //0代表fail
            return MessageUtil.success("fail", "status", 0);
        }
    }

    //更新
    @PostMapping(value = "updateOrderformById")
    public Message updateOrderformById(Orderform orderform){
        int i=orderformService.updateOrderformById(orderform);
        if (i != 0) {
            //1代表success
            return MessageUtil.success("success", "status", 1);
        } else {
            //0代表fail
            return MessageUtil.success("fail", "status", 0);
        }
    }
    //查看个人信息
    @PostMapping(value = "selectOrderformById")
    public Message selectOrderformById(Integer id){
        Orderform orderform=orderformService.selectOrderformById(id);
        if (orderform != null) {
            //success
            return MessageUtil.success("success", "status", 1);
        } else {
            //fail
            return MessageUtil.success("fail", "status", orderform);
        }
    }
    //查看所有信息
    @GetMapping(value = "selectAllOrderform")
    public Message selectAllOrderform(){
        List<Orderform> list = orderformService.selectAllOrderform();
        if (list!=null) {
            //success
            return MessageUtil.success("success", "status", list);
        } else {
            //fail
            return MessageUtil.success("fail", "status", 0);
        }
    }
}
