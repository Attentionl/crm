package com.sxdx.customer.service;

import com.sxdx.basic.bean.Follow;

import java.util.List;

/**
 * @author 毕必成
 * @description 跟进管理
 * @data 2020-02-2020/2/16
 **/
public interface FollowService {
    
    /*
    *@param: [follow]
    *@name: addFollower
    *@description: 添加一个跟进信息
    *@retrun: int
    *@date: 2020/2/16 
    *@author: 毕必成
    */
    int addFollower(Follow follow);
    
    /*
    *@param: [integer]
    *@name: deleteFollower
    *@description: 删除一个跟进
    *@retrun: int
    *@date: 2020/2/16 
    *@author: 毕必成
    */
    int deleteFollower(Integer integer);
    
    /*
    *@param: [follow]
    *@name: updateFollower
    *@description: 更新一个跟进
    *@retrun: int
    *@date: 2020/2/16 
    *@author: 毕必成
    */
    int updateFollower(Follow follow);
    
    /*
    *@param: []
    *@name: selectAllFoller
    *@description: 查询所有的跟进
    *@retrun: java.util.List<com.sxdx.basic.bean.Follow>
    *@date: 2020/2/16 
    *@author: 毕必成
    */
    List<Follow> selectAllFoller();
    
    /*
    *@param: [integer]
    *@name: selectFollowById
    *@description: 根据id查询跟进
    *@retrun: com.sxdx.basic.bean.Follow
    *@date: 2020/2/16 
    *@author: 毕必成
    */
    Follow selectFollowById(Integer integer);

}
