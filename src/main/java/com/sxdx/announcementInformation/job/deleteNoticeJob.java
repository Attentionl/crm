package com.sxdx.announcementInformation.job;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description:
 * @author: Likyeong
 * @date: 2020/2/22 10:44
 **/
public interface deleteNoticeJob {
    /**
    *@Author: LiKyeong
    *@since: JDK 1.8
    *@Description: 跑批删除公告
    *@Return: void
    *@Param: []
    *@Date: 10:53 2020/2/22
     **/
    void deleteNotice();
    /**
    *@Author: LiKyeong
    *@since: JDK 1.8
    *@Description: 跑批添加公告
    *@Return: void
    *@Param: []
    *@Date: 11:16 2020/2/22
    **/
    void addNotice();
}
