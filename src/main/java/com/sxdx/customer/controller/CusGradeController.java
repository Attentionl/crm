package com.sxdx.customer.controller;

import com.sxdx.customer.service.CusGradService;
import com.sxdx.basic.bean.CusGrade;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 毕必成
 * @description Follow Controller
 * @data 2020-02-2020/2/14
 **/
@RestController
@RequestMapping("/CusGrade")
@Transactional
public class CusGradeController {

    @Autowired(required = false)
    private CusGradService cusGradService;

    /*
     *@param: [consumer]
     *@name: addConsumer
     *@description: 添加客户等级controller
     *@retrun: com.sxdx.basic.utils.Message
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @PostMapping("addCusGrad")
    public Message addConsumer(CusGrade cusGrade){
        int i = cusGradService.addCusGrade(cusGrade);
        if(i != 0){
            return MessageUtil.success("添加客户等级成功","status",1);
        }else{
            return MessageUtil.success("添加客户等级失败","status",0);
        }
    }
    /*
     *@param: [integer]
     *@name: deleteConsumer
     *@description: 通过id 来删除客户等级
     *@retrun: com.sxdx.basic.utils.Message
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @DeleteMapping("delteCustomerById")
    public Message deleteCusGrad(Integer integer){
        int i = cusGradService.deleteCusGrade(integer);
        if(i != 0){
            return MessageUtil.success("删除客户等级成功","status",1);
        }else{
            return MessageUtil.success("删除客户等级失败","status",0);
        }
    }
    /*
     *@param: [customer]
     *@name: updateCustomer
     *@description: 更新客户等级
     *@retrun: com.sxdx.basic.utils.Message
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @PutMapping("updateCustomer")
    public Message updateCusGrad(CusGrade cusGrad){
        int i = cusGradService.updateCusGrade(cusGrad);

        if (i != 0){
            return MessageUtil.success("更新客户等级成功","status",1);
        }else{
            return MessageUtil.success("更新客户等级失败","status",0);
        }

    }
    /*
     *@param: []
     *@name: selectAllCustomer
     *@description: 查询所有的客户等级
     *@retrun: com.sxdx.basic.utils.Message
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @GetMapping("selectAllCustomer")
    public Message selectAllCusGrad(){
        List<CusGrade> cusGrades = cusGradService.selectAllCusGrade();
        if( cusGrades != null){
            return MessageUtil.success("查询所有客户等级成功","status",1);
        }else{
            return MessageUtil.success("查询所有客户等级失败","status",0);
        }
    }

    /*
    *@param: [integer]
    *@name: selectCusGradById
    *@description: 根据id查找客户等级
    *@retrun: com.sxdx.basic.utils.Message
    *@date: 2020/2/16
    *@author: 毕必成
    */
    @GetMapping("selectCusGradById")
    public Message selectCusGradById(Integer integer){
          CusGrade cusGrade  = cusGradService.selectCusGradeById(integer);
        if (cusGrade != null){
            return MessageUtil.success("存在该客户等级","status",1);
        }else{
            return MessageUtil.success("不存在该客户等级","status",0);
        }
    }

}
