package com.sxdx.customer.controller;

import com.sxdx.customer.service.CusStateService;
import com.sxdx.customer.service.FollowService;
import com.sxdx.basic.bean.CusState;
import com.sxdx.basic.bean.Follow;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 毕必成
 * @description CusState Controller
 * @data 2020-02-2020/2/14
 **/

@RestController
@RequestMapping("/CusState")
@Transactional
public class CusStateController {

    @Autowired
    private CusStateService cusStateService;

    /*
     *@param: [CusState]
     *@name: addCusState
     *@description: 添加客户状态controller
     *@retrun: com.sxdx.basic.utils.Message
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @RequestMapping("addCusState")
    public Message addCusState(CusState cusState){
        int i = cusStateService.addCusState(cusState);
        if(i != 0){
            return MessageUtil.success("添加客户状态成功","status",1);
        }else{
            return MessageUtil.success("添加客户状态失败","status",0);
        }
    }
    /*
     *@param: [integer]
     *@name: deleteCusState
     *@description: 通过id 来删除客户
     *@retrun: com.sxdx.basic.utils.Message
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @RequestMapping("delteCusStateById")
    public Message deleteCusState(Integer integer){
        int i = cusStateService.deleteCusState(integer);
        if(i != 0){
            return MessageUtil.success("删除客户状态成功","status",1);
        }else{
            return MessageUtil.success("删除客户状态失败","status",0);
        }
    }
    /*
     *@param: [customer]
     *@name: updateCusState
     *@description: 更新客户
     *@retrun: com.sxdx.basic.utils.Message
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @RequestMapping("updateCusState")
    public Message updateCusState(CusState cusState){
        int i = cusStateService.updateCusState(cusState);

        if (i != 0){
            return MessageUtil.success("更新客户状态成功","status",1);
        }else{
            return MessageUtil.success("更新客户状态失败","status",0);
        }

    }
    /*
     *@param: []
     *@name: selectAllCusState
     *@description: 查询所有的客户
     *@retrun: com.sxdx.basic.utils.Message
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @RequestMapping("selectAllCusState")
    public Message selectAllCusState(){
        List<CusState> cusStates = cusStateService.selectAllCusState();
        if( cusStates != null){
            return MessageUtil.success("查询所有客户状态成功","status",1);
        }else{
            return MessageUtil.success("查询所有客户状态失败","status",0);
        }
    }

    /*
    *@param: [integer]
    *@name: selectCusStateById
    *@description: 根据id查找客户状态
    *@retrun: com.sxdx.basic.utils.Message
    *@date: 2020/2/16
    *@author: 毕必成
    */
    @RequestMapping("selectCusStateById")
    public Message selectCusStateById(Integer integer){
        CusState  cusState  = cusStateService.selectCusStateById(integer);
        if (cusState != null){
            return MessageUtil.success("存在该客户状态","status",1);
        }else{
            return MessageUtil.success("不存在该客户状态","status",0);
        }
    }

}
