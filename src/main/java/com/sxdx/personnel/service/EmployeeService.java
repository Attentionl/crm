package com.sxdx.personnel.service;

import com.sxdx.basic.bean.Employee;

import java.util.List;

/**
 * @author 李今朝
 * @className EmployeeService
 * @version1.0
 * @description
 * @createdTime 2020/2/20 14:27
 */
public interface EmployeeService {
    /**
     * @param employee
     * @name: addEmployee
     * @description: TODO 添加员工信息
     * @return: int
     * @date: 2020/2/20 14:30
     * @auther: 李今朝
     */
    int addEmployee(Employee employee);

    /**
     * @param id
     * @name: deleteEmployeeById
     * @description: TODO  删除员工信息
     * @return: int
     * @date: 2020/2/20 14:30
     * @auther: 李今朝
     */
    int deleteEmployeeById(int id);

    /**
     * @param employee
     * @name: updateEmployee
     * @description: TODO  更新员工信息
     * @return: int
     * @date: 2020/2/20 14:30
     * @auther: 李今朝
     */
    int updateEmployee(Employee employee);

    /**
     * @name: selectAll
     * @description: TODO 查询全部员工信息
     * @return: java.util.List<com.sxdx.basic.bean.Employee>
     * @date: 2020/2/20 14:31
     * @auther: 李今朝
     */
    List<Employee> selectAll();

    /**
     * @param id
     * @name: selectEmployeeById
     * @description: TODO  根据id查询员工信息
     * @return: com.sxdx.basic.bean.Employee
     * @date: 2020/2/20 14:31
     * @auther: 李今朝
     */
    Employee selectEmployeeById(int id);
}
