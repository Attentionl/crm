package com.sxdx.customer.service.impl;

import com.sxdx.customer.service.FollowService;
import com.sxdx.basic.bean.Follow;
import com.sxdx.basic.bean.FollowExample;
import com.sxdx.basic.mapper.FollowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 毕必成
 * @description 跟进的实现类
 * @data 2020-02-2020/2/14
 **/

@Service
public class FollowServiceImpl implements FollowService {

    @Autowired(required = false)
    private FollowMapper followMapper;
    
    
    /*
    *@param: [follow]
    *@name: addFollower
    *@description: 新增一个跟进
    *@retrun: int
    *@date: 2020/2/14
    *@author: 毕必成
    */
    @Override
    public int addFollower(Follow follow) {
        return  followMapper.insert(follow);
    }

    /*
    *@param: [integer]
    *@name: deleteFollower
    *@description: 删除跟进
    *@retrun: int
    *@date: 2020/2/14
    *@author: 毕必成
    */
    @Override
    public int deleteFollower(Integer integer) {
        return followMapper.deleteByPrimaryKey(integer);
    }
    
    /*
    *@param: [follow]
    *@name: updateFollower
    *@description: 跟新跟进
    *@retrun: int
    *@date: 2020/2/14
    *@author: 毕必成
    */
    @Override
    public int updateFollower(Follow follow) {
        return followMapper.updateByPrimaryKey(follow);
    }
    
    /*
    *@param: []
    *@name: selectAllFoller
    *@description: 查询所有的跟进
    *@retrun: java.util.List<com.sxdx.basic.bean.Follow>
    *@date: 2020/2/14
    *@author: 毕必成
    */
    @Override
    public List<Follow> selectAllFoller() {

        FollowExample example = new FollowExample();
        FollowExample.Criteria criteria = example.createCriteria().andIdIsNotNull();
        List<Follow> follows = followMapper.selectByExample(example);

        return follows;
    }
    
    /*
    *@param: [integer]
    *@name: selectFollowById
    *@description: 跟进id查询跟进
    *@retrun: com.sxdx.basic.bean.Follow
    *@date: 2020/2/14
    *@author: 毕必成
    */
    @Override
    public Follow selectFollowById(Integer integer) {
        Follow follow = followMapper.selectByPrimaryKey(integer);
        return follow;
    }
}
