package com.sxdx.customer.service.impl;

import com.sxdx.customer.service.CusSourceService;
import com.sxdx.basic.bean.CusSource;
import com.sxdx.basic.bean.CusSourceExample;
import com.sxdx.basic.mapper.CusSourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 毕必成
 * @description 客户来源接口实现类
 * @data 2020-02-2020/2/14
 **/
@Service
public class CusSourceServiceImpl implements CusSourceService {

    @Autowired(required = false)
    private CusSourceMapper cusSourceMapper;


    /*
     *@param: [follow]
     *@name: addCusSource
     *@description: 新增一个跟进
     *@retrun: int
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @Override
    public int addCusSource(CusSource cusSource) {
        return  cusSourceMapper.insert(cusSource);
    }

    /*
     *@param: [integer]
     *@name: deleteCusSource
     *@description: 删除跟进
     *@retrun: int
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @Override
    public int deleteCusSource(Integer integer) {
        return cusSourceMapper.deleteByPrimaryKey(integer);
    }

    /*
     *@param: [cusSource]
     *@name: updateCusSource
     *@description: 跟新跟进
     *@retrun: int
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @Override
    public int updateCusSource(CusSource cusSource) {
        return cusSourceMapper.updateByPrimaryKey(cusSource);
    }

    /*
     *@param: []
     *@name: selectAllCusSource
     *@description: 查询所有的跟进
     *@retrun: java.util.List<com.sxdx.basic.bean.CusSource>
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @Override
    public List<CusSource> selectAllCusSource() {

        CusSourceExample example = new CusSourceExample();
        example.createCriteria().andIdIsNotNull();
        List<CusSource> cusSources = cusSourceMapper.selectByExample(example);

        return cusSources;
    }

    /*
     *@param: [integer]
     *@name: selectCusSourceById
     *@description: 跟进id查询跟进
     *@retrun: com.sxdx.basic.bean.CusSource
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @Override
    public CusSource selectCusSourceById(Integer integer) {
        CusSource cusSource = cusSourceMapper.selectByPrimaryKey(integer);
        return cusSource;
    }

}
