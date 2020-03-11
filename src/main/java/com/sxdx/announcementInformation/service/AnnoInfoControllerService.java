package com.sxdx.announcementInformation.service;

import com.sxdx.basic.bean.Notice;

import java.util.List;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description: 公告信息模块接口
 * @author: Likyeong
 * @date: 2020/2/17 9:55
 **/
public interface AnnoInfoControllerService {
    /**
    *@Author: LiKyeong
    *@since: JDK 1.8
    *@Description: 发布公告
    *@Return: int
    *@Param: [notice]
    *@Date: 10:20 2020/2/17
    **/
    Integer AddNotice(Notice notice);
    /**
    *@Author: LiKyeong
    *@since: JDK 1.8
    *@Description: 查询所有
    *@Return: java.util.List<com.sxdx.basic.bean.Notice>
    *@Param: []
    *@Date: 10:09 2020/2/22
    **/
    List<Notice> selectAllNotice();
    /**
    *@Author: LiKyeong
    *@since: JDK 1.8
    *@Description: 通过id查询
    *@Return: com.sxdx.basic.bean.Notice
    *@Param: [id]
    *@Date: 10:09 2020/2/22
    **/
    Notice selectNoticeById(Integer id);
    /**
    *@Author: LiKyeong
    *@since: JDK 1.8
    *@Description: 通过id修改内容
    *@Return: void
    *@Param: [id]
    *@Date: 10:11 2020/2/22
    **/
    void updateNoticeById(Integer id);
    /**
    *@Author: LiKyeong
    *@since: JDK 1.8
    *@Description: 通过id手动删除公告
    *@Return: void
    *@Param: [id]
    *@Date: 10:46 2020/2/22
    **/
    void deleteNoticeById(Integer id);
    /**
    *@Author: LiKyeong
    *@since: JDK 1.8
    *@Description: 跑批删除公告
    *@Return: void
    *@Param: []
    *@Date: 10:47 2020/2/22
    **/
    void deleteAutoNotice();
    /**
    *@Author: LiKyeong
    *@since: JDK 1.8
    *@Description: 跑批发布公告
    *@Return: void
    *@Param: []
    *@Date: 11:20 2020/2/22
    **/
    void addAutoNotice();
}
