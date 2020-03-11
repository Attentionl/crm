package com.sxdx.announcementInformation.job.impl;

import com.sxdx.announcementInformation.job.deleteNoticeJob;
import com.sxdx.announcementInformation.service.AnnoInfoControllerService;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description:
 * @author: Likyeong
 * @date: 2020/2/22 10:54
 **/
public class deleteNoticeJobImpl implements deleteNoticeJob {
    @Resource
    AnnoInfoControllerService annoInfoControllerService;
     /**
     *      * 每日00点开始执行
     *      * 测试的时候用下面的表达式，每二十秒执行一次
     *      * 0/20 * * * * ?
     *      * 0 0 0 * * ?
     *      */
    @Scheduled(cron = "0/20 * * * * ?")
    @Override
    public void deleteNotice() {
        annoInfoControllerService.deleteAutoNotice();
    }

    @Scheduled(cron = "0/20 * * * * ?")
    @Override
    public void addNotice() {
        annoInfoControllerService.addAutoNotice();
    }
}
