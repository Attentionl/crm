package com.sxdx.customer.service.impl;

import com.sxdx.customer.service.CusGradService;
import com.sxdx.basic.bean.CusGrade;
import com.sxdx.basic.bean.CusGradeExample;
import com.sxdx.basic.mapper.CusGradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 毕必成
 * @description CusGrade 的实现类
 * @data 2020-02-2020/2/16
 **/

@Service
public class CusGradeServiceImpl implements CusGradService {

    @Autowired(required = false)
    private CusGradeMapper cusGradeMapper;


    /*
     *@param: [cusGrade]
     *@name: addCusGrade
     *@description: 新增一个跟进
     *@retrun: int
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @Override
    public int addCusGrade(CusGrade cusGrade) {
        return  cusGradeMapper.insert(cusGrade);
    }

    /*
     *@param: [integer]
     *@name: deleteCusGrade
     *@description: 删除跟进
     *@retrun: int
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @Override
    public int deleteCusGrade(Integer integer) {
        return cusGradeMapper.deleteByPrimaryKey(integer);
    }

    /*
     *@param: [follow]
     *@name: updateCusGrade
     *@description: 跟新跟进
     *@retrun: int
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @Override
    public int updateCusGrade(CusGrade cusGrade) {
        return cusGradeMapper.updateByPrimaryKey(cusGrade);
    }

    /*
     *@param: []
     *@name: selectAllCusGrade
     *@description: 查询所有的跟进
     *@retrun: java.util.List<com.sxdx.basic.bean.CusGrade>
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @Override
    public List<CusGrade> selectAllCusGrade() {

        CusGradeExample example = new CusGradeExample();
        CusGradeExample.Criteria criteria = example.createCriteria().andIdIsNotNull();
        List<CusGrade> cusGrades = cusGradeMapper.selectByExample(example);

        return cusGrades;
    }

    /*
     *@param: [integer]
     *@name: selectCusGradeById
     *@description: 跟进id查询跟进
     *@retrun: com.sxdx.basic.bean.CusGrade
     *@date: 2020/2/14
     *@author: 毕必成
     */
    @Override
    public CusGrade selectCusGradeById(Integer integer) {
        CusGrade cusGrade = cusGradeMapper.selectByPrimaryKey(integer);
        return cusGrade;
    }

}
