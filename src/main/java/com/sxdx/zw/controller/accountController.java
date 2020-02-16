package com.sxdx.zw.controller;

import com.sxdx.basic.bean.Account;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.zw.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangwei
 * @className accountController
 * @version1.0
 * @description
 * @createdTime 2020/2/15 19:45
 */
@RestController("account")
public class accountController {

    @Autowired
    private AccountService accountService;
//添加
    @PostMapping(value = "addAccount")
    public Message addAccount(Account account){
        int i = accountService.addAccount(account);
        if (i != 0) {
            //1代表success
            return MessageUtil.success("success", "status", 1);
        } else {
            //0代表fail
            return MessageUtil.success("fail", "status", 0);
        }
    }
//通过id删除
    @GetMapping(value = "deleteAccountById")
    public Message deleteAccountById( Integer id){
        int i =accountService.deleteAccountById(id);
        if (i != 0) {
            //1代表success
            return MessageUtil.success("success", "status", 1);
        } else {
            //0代表fail
            return MessageUtil.success("fail", "status", 0);
        }
    }
    //通过名字删除
    @GetMapping(value = "deleteAccountByName")
    public Message deleteAccountByName( String name){
        int i =accountService.deleteAccountByName(name);
        if (i != 0) {
            //1代表success
            return MessageUtil.success("success", "status", 1);
        } else {
            //0代表fail
            return MessageUtil.success("fail", "status", 0);
        }
    }
    //更新
    @PostMapping(value = "updateAccountById")
    public Message updateAccountById(Account account){
        int i=accountService.updateAccountById(account);
        if (i != 0) {
            //1代表success
            return MessageUtil.success("success", "status", 1);
        } else {
            //0代表fail
            return MessageUtil.success("fail", "status", 0);
        }
    }
//查看个人信息
@PostMapping(value = "selectAccountById")
public Message selectAccountById(Integer id){
    Account account=accountService.selectAccountById(id);
    if (account != null) {
        //1代表success
        return MessageUtil.success("success", "status", account);
    } else {
        //0代表fail
        return MessageUtil.success("fail", "status", 0);
    }
}
//查看所有信息
    @GetMapping(value = "selectAllAccount")
    public Message selectAllAccount(){
        List<Account> list = accountService.selectAllAccount();
        if (list!=null) {
            //1代表success
            return MessageUtil.success("success", "status", list);
        } else {
            //0代表fail
            return MessageUtil.success("fail", "status", 0);
        }
    }
}