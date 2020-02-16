package com.sxdx.customer.controller;

import com.sxdx.customer.service.CusSourceService;
import com.sxdx.basic.bean.CusSource;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 毕必成
 * @description CusSourceController
 * @data 2020-02-2020/2/16
 **/

@RestController
@RequestMapping("/CusSource")
@Transactional
public class CusSourceController {

    @Autowired(required = false)
    private CusSourceService cusSourceService;

    /*
     *@param: [consumer]
     *@name: addCusSource
     *@description: 添加客户来源controller
     *@retrun: com.sxdx.basic.utils.CusSource
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @RequestMapping("addCusSource")
    public Message addCusSource(CusSource cusSource){
        int i = cusSourceService.addCusSource(cusSource);
        if(i != 0){
            return MessageUtil.success("添加客户来源成功","status",1);
        }else{
            return MessageUtil.success("添加客户来源失败","status",0);
        }
    }
    /*
     *@param: [integer]
     *@name: deleteCusSource
     *@description: 通过id 来删除客户来源
     *@retrun: com.sxdx.basic.utils.CusSource
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @RequestMapping("delteCustomerById")
    public Message deleteCusSource(Integer integer){
        int i = cusSourceService.deleteCusSource(integer);
        if(i != 0){
            return MessageUtil.success("删除客户来源成功","status",1);
        }else{
            return MessageUtil.success("删除客户来源失败","status",0);
        }
    }
    /*
     *@param: [customer]
     *@name: updateCusSource
     *@description: 更新客户来源
     *@retrun: com.sxdx.basic.utils.CusSource
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @RequestMapping("updateCustomer")
    public Message updateCusSource(CusSource cusSource){
        int i = cusSourceService.updateCusSource(cusSource);

        if (i != 0){
            return MessageUtil.success("更新客户来源成功","status",1);
        }else{
            return MessageUtil.success("更新客户来源失败","status",0);
        }

    }
    /*
     *@param: []
     *@name: selectAllCusSource
     *@description: 查询所有的客户来源
     *@retrun: com.sxdx.basic.utils.CusSource
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @RequestMapping("selectAllCusSource")
    public Message selectAllCusSource(){
        List<CusSource> follows = cusSourceService.selectAllCusSource();
        if( follows != null){
            return MessageUtil.success("查询所有客户来源成功","status",1);
        }else{
            return MessageUtil.success("查询所有客户来源失败","status",0);
        }
    }

    /*
    *@param: [integer]
    *@name: selectCusSourceById
    *@description: 通过id查找客户来源
    *@retrun: com.sxdx.basic.utils.Message
    *@date: 2020/2/16
    *@author: 毕必成
    */
    @RequestMapping("selectCusSourceById")
    public Message selectCusSourceById(Integer integer){
        CusSource  cusSource  = cusSourceService.selectCusSourceById(integer);
        if (cusSource != null){
            return MessageUtil.success("存在该客户来源","status",1);
        }else{
            return MessageUtil.success("不存在该客户来源","status",0);
        }
    }

}
