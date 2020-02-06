package com.sxdx.personnel.service;

import com.sxdx.basic.bean.Department;

import java.util.List;

/**
 * @author 李今朝
 * @version1.0 2020/2/6
 * @description 部门操作的服务层
 */

public interface DepartmentService {
    /**
     * 添加部门
     *
     * @param department
     * @return
     */
    int addDepartment(Department department);

    /**
     * 通过id删除部门
     *
     * @param id
     * @return
     */
    int deleteDepartmentById(Integer id);

    /**
     * 通过名字删除部门
     *
     * @param name
     * @return
     */
    int deleteDepartmentByName(String name);

    /**
     * 通过id更新部门信息
     *
     * @param department
     * @return
     */
    int updateDepartmentById(Department department);

    /**
     * 通过id查询部门
     *
     * @param id
     * @return
     */
    Department selectDepartmentById(Integer id);

    /**
     * 查询所有部门
     *
     * @return
     */
    List<Department> selectAllDepartment();
}
