//package com.sxdx.user.controller;
//
//import com.sxdx.basic.utils.MessageUtil;
//import com.sxdx.basic.utils.TokenUtil;
//import org.springframework.web.bind.annotation.*;
//
//import javax.annotation.Resource;
//
///**
// * @Program: crm
// * @since: JDK 1.8
// * @Description:
// * @author: Likyeong
// * @date: 2020/3/10 20:08
// **/
//@RestController
//@RequestMapping("/user")
//public class UserController {
//    @Resource
//    TokenUtil tokenUtil;
//    /**
//     *todo:
//     * 登录功能的控制层
//     * @param password
//     * @param verificationCode
//     * @param mobile
//     * @return 返回成功的数据，并且将产品信息也返回
//     */
//    @GetMapping(value = "login")
//    public ResultMessage<UserVo> login(String password, String verificationCode, String mobile) {
//        iVerificationCode.vefCodeIsRight(mobile, verificationCode);
//        User user = userService.login(mobile,password);
//        UserVo userVo = new UserVo();
//        userVo.setUser(user);
//        String token = tokenUtil.createToken(user.getId());
//        userVo.setToken(token);
//        return new ResultMessage<>(Constants.StatusCode.SUCCESS, "登录成功",userVo);
//    }
//}
