package com.sxdx.announcementInformation.service.impl;

import com.sxdx.announcementInformation.service.AnnoInfoControllerService;
import com.sxdx.basic.bean.Notice;
import com.sxdx.basic.bean.NoticeExample;
import com.sxdx.basic.exception.CustomerException;
import com.sxdx.basic.mapper.NoticeMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description: 公告信息管理接口实现
 * @author: Likyeong
 * @date: 2020/2/17 9:56
 **/
@Service
public class AnnoInfoControllerServiceImpl implements AnnoInfoControllerService {
    @Resource
    NoticeMapper noticeMapper;
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Integer AddNotice(Notice notice) {
        int i = noticeMapper.insert(notice);
        return i;
    }

    @Override
    public List<Notice> selectAllNotice() {
        NoticeExample noticeExample=new NoticeExample();
        noticeExample.setOrderByClause("'publishTime' desc");//通过发布时间排序
        noticeExample.createCriteria().andIdIsNotNull();
        List<Notice> notices = noticeMapper.selectByExample(noticeExample);
        return notices;
    }

    @Override
    public Notice selectNoticeById(Integer id) {
        NoticeExample noticeExample=new NoticeExample();
        noticeExample.createCriteria().andIdEqualTo(id);
        List<Notice> notices = noticeMapper.selectByExample(noticeExample);
        if(notices.isEmpty()){
            throw new CustomerException("公告不存在");
        }
        return notices.get(0);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateNoticeById(Integer id) {
        NoticeExample noticeExample=new NoticeExample();
        noticeExample.createCriteria().andIdEqualTo(id);
        List<Notice> notices = noticeMapper.selectByExample(noticeExample);
        noticeMapper.updateByExample(notices.get(0),noticeExample);
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deleteNoticeById(Integer id) {
        NoticeExample noticeExample=new NoticeExample();
        noticeExample.createCriteria().andIdEqualTo(id);
        noticeMapper.deleteByExample(noticeExample);
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deleteAutoNotice() {
        NoticeExample noticeExample=new NoticeExample();
        noticeExample.createCriteria().andIdIsNotNull();
        List<Notice> notices = noticeMapper.selectByExample(noticeExample);
        if(notices.isEmpty()){
            return;
        }
        for(Notice notice:notices){
            Date date = new Date();
            Date outtime = notice.getOuttime();
            if(date.after(outtime)){
                Integer id = notice.getId();
                noticeMapper.deleteByPrimaryKey(id);
            }
        }
    }

    @Override
    public void addAutoNotice() {
        NoticeExample noticeExample=new NoticeExample();
        noticeExample.createCriteria().andIdIsNotNull();
        List<Notice> notices = noticeMapper.selectByExample(noticeExample);
        if(notices.isEmpty()){
            return;
        }
        for(Notice notice:notices){
            String status = notice.getStatus();
            if(status.equals("0")){
                Date date=new Date();
                Date publishtime = notice.getPublishtime();
                if(date.after(publishtime)){
                    notice.setStatus("1");
                    noticeMapper.updateByPrimaryKey(notice);
                }
            }
        }
    }
}
