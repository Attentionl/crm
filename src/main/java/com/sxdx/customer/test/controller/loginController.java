package com.sxdx.customer.test.controller;

import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.customer.test.userVm.UserVM;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 毕必成
 * @description 登录测试
 * @data 2020-02-2020/2/20
 **/
@Validated
@RestController
@RequestMapping("/user")
public class loginController {

    @PostMapping("login1")
    public Message login(@RequestBody UserVM userVM){
        // 1. 认证用户的用户名和密码
        // 2. 如果登录成功产生token,将token缓存起来，返回
        // 3. 如果登录失败
        Map<String,String> map = new HashMap<>();
        map.put("token","admin-token");
        System.out.println(userVM);
        return MessageUtil.success(map);
    }
    @ApiOperation(value = "通过token获取用户的基本信息")
    @GetMapping("info1")
    public Message info(String token){
        // 1. 通过token获取用户信息  {id,use,gender,roles:[]}
        UserVM user = new UserVM();
        user.setUsername("admin");
        user.setPassword("123456");
        return MessageUtil.success(user);
    }

}
