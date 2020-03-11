package com.sxdx.personnel.service;

import com.sxdx.basic.bean.Salary;

import java.util.List;

/**
 * @author 李今朝
 * @className SalaryService
 * @version1.0
 * @description 工资服务层
 * @createdTime 2020/2/20 13:34
 */
public interface SalaryService {
    /**
     * @param salary
     * @name: addSalary
     * @description: TODO 添加员工信息
     * @return: int
     * @date: 2020/2/20 13:44
     * @auther: 李今朝
     */
    int addSalary(Salary salary);

    /**
     * @param id
     * @name: deleteSalaryById
     * @description: TODO  通过id删除工资信息
     * @return: int
     * @date: 2020/2/20 13:43
     * @auther: 李今朝
     */
    int deleteSalaryById(int id);

    /**
     * @param salary
     * @name: updateSalary
     * @description: TODO 更新工资信息
     * @return: int
     * @date: 2020/2/20 13:43
     * @auther: 李今朝
     */
    int updateSalary(Salary salary);

    /**
     * @name: selectAll
     * @description: TODO 查询全部的工资列表
     * @return: java.util.List<com.sxdx.basic.bean.Salary>
     * @date: 2020/2/20 13:41
     * @auther: 李今朝
     */
    List<Salary> selectAll();

    /**
     * @param id
     * @name: selectSalaryByEmployeeId
     * @description: TODO 根据员工ID查询对应员工的工资
     * @return: com.sxdx.basic.bean.Salary
     * @date: 2020/2/20 13:40
     * @auther: 李今朝
     */
    List<Salary> selectSalaryByEmployeeId(int id);

}
