package com.sxdx.customer.controller;

import com.sxdx.basic.bean.Customer;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.basic.utils.Message;
import com.sxdx.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 毕必成
 * @description 客户信息 Controller
 * @data 2020-02-2020/2/14
 **/
@RestController
@RequestMapping("/customer")
@Transactional
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /*
    *@param: [consumer]
    *@name: addConsumer
    *@description: 添加客户controller
    *@retrun: com.sxdx.basic.utils.Message
    *@date: 2020/2/14
    *@author: 毕必成
    */
    @PostMapping("addCustomer")
    public Message addConsumer(Customer consumer){
        int i = customerService.addCustomer(consumer);
        if(i != 0){
            return MessageUtil.success("添加客户成功","status",1);
        }else{
            return MessageUtil.success("添加客户失败","status",0);
        }
    }
    /*
    *@param: [integer]
    *@name: deleteConsumer
    *@description: 通过id 来删除客户
    *@retrun: com.sxdx.basic.utils.Message
    *@date: 2020/2/14
    *@author: 毕必成
    */
    @DeleteMapping("delteCustomerById")
    public Message deleteConsumer(Integer integer){
        int i = customerService.deleteCustomer(integer);
        if(i != 0){
            return MessageUtil.success("删除客户成功","status",1);
        }else{
            return MessageUtil.success("删除客户失败","status",0);
        }
    }
    /*
    *@param: [customer]
    *@name: updateCustomer
    *@description: 更新客户
    *@retrun: com.sxdx.basic.utils.Message
    *@date: 2020/2/14
    *@author: 毕必成
    */
    @PutMapping("updateCustomer")
    public Message updateCustomer(Customer customer){
       int i = customerService.updateCustomer(customer);

       if (i != 0){
           return MessageUtil.success("更新客户成功","status",1);
       }else{
           return MessageUtil.success("更新客户失败","status",0);
       }

    }
    /*
    *@param: []
    *@name: selectAllCustomer
    *@description: 查询所有的客户
    *@retrun: com.sxdx.basic.utils.Message
    *@date: 2020/2/14
    *@author: 毕必成
    */
    @GetMapping("selectAllCustomer")
    public Message selectAllCustomer(){
        List<Customer> customers = customerService.selectAllCustomer();
        if( customers != null){
            return MessageUtil.success("查询所有客户成功","status",1);
        }else{
            return MessageUtil.success("查询所有客户失败","status",0);
        }
    }

    /*
    *@param: [integer]
    *@name: selectCustomerById
    *@description: 根据id查找客户
    *@retrun: com.sxdx.basic.utils.Message
    *@date: 2020/2/16
    *@author: 毕必成
    */
    @GetMapping("selectCustomerById")
    public Message selectCustomerById(Integer integer){
        Customer customer = customerService.selcteByCusId(integer);
        if (customer != null){
            return MessageUtil.success("存在该客户","status",1);
        }else{
            return MessageUtil.success("不存在该客户","status",0);
        }
    }

    @GetMapping ("selectCusByName/login")
    public Message selectCusByName(String username){
        List<Customer> customers = customerService.selectByCusName(username);
        if(customers != null){
            return MessageUtil.success("存在该客户","status",1);
        }else{
            return MessageUtil.success("不存在该客户","status",0);
        }
    }

}
