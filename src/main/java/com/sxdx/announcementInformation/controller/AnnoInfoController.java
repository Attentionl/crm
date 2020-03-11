package com.sxdx.announcementInformation.controller;

import com.sxdx.announcementInformation.service.AnnoInfoControllerService;
import com.sxdx.basic.bean.Notice;
import com.sxdx.basic.bean.Receipt;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description: 公告信息模块controller
 * @author: Likyeong
 * @date: 2020/2/17 9:45
 **/
@RestController
@RequestMapping("annoInformation")
public class AnnoInfoController {
    @Resource
    AnnoInfoControllerService annoInfoControllerService;
    @ApiOperation(value = "查询所有公告信息")
    @GetMapping("selectAll")
    public Message selectAll(){
        List<Notice> notices = annoInfoControllerService.selectAllNotice();
        return MessageUtil.success("查询成功","notices",notices);
    }
    @ApiOperation(value = "添加公告信息")
    @GetMapping("addNotice")
    public Message addNotice(Notice notice){
        Integer integer = annoInfoControllerService.AddNotice(notice);
        if(integer==1) {
            return MessageUtil.success("发布成功");
        }
            return MessageUtil.success("发布失败");

    }
    @ApiOperation(value = "根据Id修改信息")
    @GetMapping("updateById")
    public Message updateById(Integer id){
        annoInfoControllerService.updateNoticeById(id);
        return MessageUtil.success("修改成功");
    }
    @ApiOperation(value = "根据id查询公告")
    @GetMapping("selectNoticeById")
    public Message selectNoticeById(Integer id){
        Notice notice = annoInfoControllerService.selectNoticeById(id);
        return MessageUtil.success("查询成功","notice",notice);
    }
    @ApiOperation(value = "根据id删除公告")
    @GetMapping("deleteNoticeById")
    public Message deleteNoticeById(Integer id){
        annoInfoControllerService.deleteNoticeById(id);
        return MessageUtil.success("删除成功");
    }
}
