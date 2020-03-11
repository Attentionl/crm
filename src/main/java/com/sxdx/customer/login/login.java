package com.sxdx.customer.login;

import com.sxdx.basic.utils.JwtTokenUtil;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.customer.controller.CustomerController;
import com.sxdx.customer.test.userVm.UserVM;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author 毕必成
 * @description 登录Controller
 * @data 2020-03-2020/3/9
 **/

@Validated
@RestController
@RequestMapping("/user")
public class login {

    @Autowired
    private CustomerController cus;

    private JwtTokenUtil jtoken;

    String jwt = null;

    @PostMapping("login")
    public Message userLogin(@RequestBody UserVM userVM){
        System.out.println(userVM);
        String username = userVM.getUsername();
        System.out.println(username);

        Message meta = cus.selectCusByName(username);

        HashMap<String, String> map = new HashMap<>();


        if(meta.getCode() != 0){//查询客户成功
            jwt = jtoken.createJWT(1, username);
            map.put("token",jwt);
            return MessageUtil.success(map);
        }else{
            return MessageUtil.error("没有该用户");
        }

    }
    @ApiOperation(value = "通过token获取用户的基本信息")
    @GetMapping("info")
    public Message info(String token){
        // 1. 通过token获取用户信息  {id,use,gender,roles:[]}
        UserVM user = new UserVM();
        user.setUsername("李一");
        user.setPassword("123456");
        return MessageUtil.success(user);
    }



}
