package com.sxdx.personnel.service.impl;

import com.sxdx.basic.bean.Employee;
import com.sxdx.basic.bean.EmployeeExample;
import com.sxdx.basic.mapper.EmployeeMapper;
import com.sxdx.personnel.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李今朝
 * @className EmployeeServiceImpl
 * @version1.0
 * @description
 * @createdTime 2020/2/20 14:32
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public int addEmployee(Employee employee) {
        return employeeMapper.insert(employee);
    }

    @Override
    public int deleteEmployeeById(int id) {
        return employeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeMapper.updateByPrimaryKeySelective(employee);
    }

    @Override
    public List<Employee> selectAll() {
        EmployeeExample employeeExample = new EmployeeExample();
        employeeExample.createCriteria().andIdIsNotNull();
        return employeeMapper.selectByExample(employeeExample);
    }

    @Override
    public Employee selectEmployeeById(int id) {
        return employeeMapper.selectByPrimaryKey(id);
    }
}
