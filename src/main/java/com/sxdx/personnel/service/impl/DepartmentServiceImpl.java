package com.sxdx.personnel.service.impl;

import com.sxdx.basic.bean.Department;
import com.sxdx.basic.bean.DepartmentExample;
import com.sxdx.basic.mapper.DepartmentMapper;
import com.sxdx.personnel.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李今朝
 * @version1.0 2020/2/6
 * @description 部门服务层的实现类
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public int addDepartment(Department department) {
        int i = departmentMapper.insert(department);
        return i;
    }

    @Override
    public int deleteDepartmentById(Integer id) {
        int i = departmentMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int deleteDepartmentByName(String name) {
        DepartmentExample departmentExample = new DepartmentExample();
        departmentExample.createCriteria().andNameEqualTo(name);
        int i = departmentMapper.deleteByExample(departmentExample);
        return i;
    }

    @Override
    public int updateDepartmentById(Department department) {
        int i = departmentMapper.updateByPrimaryKeySelective(department);
        return i;
    }

    @Override
    public Department selectDepartmentById(Integer id) {
        Department department = departmentMapper.selectByPrimaryKey(id);
        return department;
    }

    @Override
    public List<Department> selectAllDepartment() {
        DepartmentExample example = new DepartmentExample();
        example.createCriteria().andIdIsNotNull();
        List<Department> list = departmentMapper.selectByExample(example);
        return list;
    }
}
