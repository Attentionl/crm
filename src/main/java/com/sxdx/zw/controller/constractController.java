package com.sxdx.zw.controller;

import com.sxdx.basic.bean.Constract;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.zw.service.ConstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangwei
 * @className constractController
 * @version1.0
 * @description
 * @createdTime 2020/2/15 19:46
 */
@RestController("constract")
public class constractController {

   @Autowired
   private ConstractService constractService;
    //添加
    @PostMapping(value = "addConstract")
    public Message addConstract(Constract constract){
        int i = constractService.addConstract(constract);
        if (i != 0) {
            //1代表success
            return MessageUtil.success("success", "status", 1);
        } else {
            //0代表fail
            return MessageUtil.success("fail", "status", 0);
        }
    }
    //通过id删除
    @GetMapping(value = "deleteContractById")
    public Message deleteConstractById(Integer id){
        int i =constractService.deleteConstractById(id);
        if (i != 0) {
            //1代表success
            return MessageUtil.success("success", "status", 1);
        } else {
            //0代表fail
            return MessageUtil.success("fail", "status", 0);
        }
    }
    //通过名字删除
    @GetMapping(value = "deleteConstractByName")
    public Message deleteConstractByName( String name){
        int i =constractService.deleteConstractByName(name);
        if (i != 0) {
            //1代表success
            return MessageUtil.success("success", "status", 1);
        } else {
            //0代表fail
            return MessageUtil.success("fail", "status", 0);
        }
    }
    //更新
    @PostMapping(value = "updateConstractById")
    public Message updateConstractById(Constract constract){
        int i=constractService.updateConstractById( constract);
        if (i != 0) {
            //1代表success
            return MessageUtil.success("success", "status", 1);
        } else {
            //0代表fail
            return MessageUtil.success("fail", "status", 0);
        }
    }
    //查看个人信息
    @PostMapping(value = "selectConstractById")
    public Message selectConstractById(Integer id){
        Constract constract=constractService.selectConstractById(id);
        if (constract != null) {
            //success
            return MessageUtil.success("success", "status", constract);
        } else {
            //fail
            return MessageUtil.success("fail", "status", 0);
        }
    }
    //查看所有信息
    @GetMapping(value = "selectAllConstract")
    public Message selectAllConstract(){
        List<Constract> list = constractService.selectAllConstract();
        if (list!=null) {
            //success
            return MessageUtil.success("success", "status", list);
        } else {
            //fail
            return MessageUtil.success("fail", "status", 0);
        }
    }
}
