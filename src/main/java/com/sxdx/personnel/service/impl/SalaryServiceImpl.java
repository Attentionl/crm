package com.sxdx.personnel.service.impl;

import com.sxdx.basic.bean.Salary;
import com.sxdx.basic.bean.SalaryExample;
import com.sxdx.basic.mapper.SalaryMapper;
import com.sxdx.personnel.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李今朝
 * @className SalaryServiceImpl
 * @version1.0
 * @description
 * @createdTime 2020/2/20 13:44
 */
@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryMapper salaryMapper;

    @Override
    public int addSalary(Salary salary) {
        return salaryMapper.insertSelective(salary);
    }

    @Override
    public int deleteSalaryById(int id) {
        return salaryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateSalary(Salary salary) {
        return salaryMapper.updateByPrimaryKeySelective(salary);
    }

    @Override
    public List<Salary> selectAll() {
        SalaryExample salaryExample = new SalaryExample();
        salaryExample.createCriteria().andIdIsNotNull();
        return salaryMapper.selectByExample(salaryExample);
    }

    @Override
    public List<Salary> selectSalaryByEmployeeId(int id) {
        SalaryExample salaryExample = new SalaryExample();
        //salaryExample.createCriteria().andEmployeeIdEqualTo(id);
        return salaryMapper.selectByExample(salaryExample);
    }
}
