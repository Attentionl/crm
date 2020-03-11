package com.sxdx.customer.controller;

import com.sxdx.customer.service.FollowService;
import com.sxdx.basic.bean.Follow;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 毕必成
 * @description Follow Controller
 * @data 2020-02-2020/2/16
 **/
@RestController
@RequestMapping("/follow")
@Transactional
public class FollowController {
    @Autowired
    private FollowService followService;

    /*
     *@param: [Follow]
     *@name: addFollow
     *@description: 添加客户controller
     *@retrun: com.sxdx.basic.utils.Message
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @PostMapping("addFollow")
    public Message addConsumer(Follow follow){
        int i = followService.addFollower(follow);
        if(i != 0){
            return MessageUtil.success("添加跟进成功","status",1);
        }else{
            return MessageUtil.success("添加跟进失败","status",0);
        }
    }
    /*
     *@param: [integer]
     *@name: deleteFollow
     *@description: 通过id 来删除客户
     *@retrun: com.sxdx.basic.utils.Message
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @DeleteMapping("delteFollowById")
    public Message deleteFollow(Integer integer){
        int i = followService.deleteFollower(integer);
        if(i != 0){
            return MessageUtil.success("删除跟进成功","status",1);
        }else{
            return MessageUtil.success("删除跟进失败","status",0);
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
    @PutMapping("updateFollow")
    public Message updateFollow(Follow follow){
        int i = followService.updateFollower(follow);

        if (i != 0){
            return MessageUtil.success("更新跟进成功","status",1);
        }else{
            return MessageUtil.success("更新跟进失败","status",0);
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
    @GetMapping("selectAllFollow")
    public Message selectAllFollow(){
        List<Follow> follows = followService.selectAllFoller();
        if( follows != null){
            return MessageUtil.success("查询所有跟进成功","status",1);
        }else{
            return MessageUtil.success("查询所有跟进失败","status",0);
        }
    }
    /*
    *@param: [integer]
    *@name: selectFollowById
    *@description: 根据id查找跟进
    *@retrun: com.sxdx.basic.utils.Message
    *@date: 2020/2/16
    *@author: 毕必成
    */
    @GetMapping("selectFollowById")
    public Message selectFollowById(Integer integer){
        Follow  follow  = followService.selectFollowById(integer);
        if (follow != null){
            return MessageUtil.success("存在该跟进","status",1);
        }else{
            return MessageUtil.success("不存在该跟进","status",0);
        }
    }
}
