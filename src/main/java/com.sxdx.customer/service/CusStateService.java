package com.sxdx.customer.service;

import com.sxdx.basic.bean.CusState;
import com.sxdx.basic.bean.Follow;
import com.sxdx.basic.bean.FollowExample;
import com.sxdx.basic.mapper.FollowMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 毕必成
 * @description 客户状态信息
 * @data 2020-02-2020/2/16
 **/
public interface CusStateService {

    /*
     *@param: [cusState]
     *@name: addFollower
     *@description: 添加一个客户状态
     *@retrun: int
     *@date: 2020/2/16
     *@author: 毕必成
     */
    int addCusState(CusState cusState);

    /*
     *@param: [integer]
     *@name: deleteFollower
     *@description: 删除一个客户状态
     *@retrun: int
     *@date: 2020/2/16
     *@author: 毕必成
     */
    int deleteCusState(Integer integer);

    /*
     *@param: [cusState]
     *@name: updateFollower
     *@description: 更新一个客户状态
     *@retrun: int
     *@date: 2020/2/16
     *@author: 毕必成
     */
    int updateCusState(CusState cusState);

    /*
     *@param: []
     *@name: selectAllFoller
     *@description: 查询所有的客户状态
     *@retrun: java.util.List<com.sxdx.basic.bean.Follow>
     *@date: 2020/2/16
     *@author: 毕必成
     */
    List<CusState> selectAllCusState();

    /*
     *@param: [integer]
     *@name: selectFollowById
     *@description: 根据id查询客户状态
     *@retrun: com.sxdx.basic.bean.Follow
     *@date: 2020/2/16
     *@author: 毕必成
     */
    CusState selectCusStateById(Integer integer);

}
