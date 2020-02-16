package com.sxdx.customer.service.impl;

import com.sxdx.customer.service.CusStateService;
import com.sxdx.basic.bean.CusState;
import com.sxdx.basic.bean.CusStateExample;
import com.sxdx.basic.bean.Follow;
import com.sxdx.basic.bean.FollowExample;
import com.sxdx.basic.mapper.CusStateMapper;
import com.sxdx.basic.mapper.FollowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 毕必成
 * @description 客户状态接口实现
 * @data 2020-02-2020/2/14
 **/
@Service
public class CusStateServiceImpl implements CusStateService {

    @Autowired(required = false)
    private CusStateMapper cusStateMapper;


    /*
     *@param: [follow]
     *@name: addFollower
     *@description: 新增一个跟进
     *@retrun: int
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @Override
    public int addCusState(CusState cusState) {
        return  cusStateMapper.insert(cusState);
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
    public int deleteCusState(Integer integer) {
        return cusStateMapper.deleteByPrimaryKey(integer);
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
    public int updateCusState(CusState cusState) {
        return cusStateMapper.updateByPrimaryKey(cusState);
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
    public List<CusState> selectAllCusState() {

        CusStateExample example = new CusStateExample();
        example.createCriteria().andIdIsNotNull();
        List<CusState> cusStates = cusStateMapper.selectByExample(example);

        return cusStates;
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
    public CusState selectCusStateById(Integer integer) {
        CusState cusState = cusStateMapper.selectByPrimaryKey(integer);
        return cusState;
    }

}
