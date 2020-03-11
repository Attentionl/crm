package com.sxdx.personnel.controller;

import com.sxdx.basic.bean.Employee;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.personnel.service.EmployeeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李今朝
 * @className EmployeeController
 * @version1.0
 * @description
 * @createdTime 2020/2/20 14:25
 */
@RestController
@RequestMapping("employee")
@Transactional(rollbackFor = Exception.class)
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "添加员工信息")
    @PostMapping("addEmployee")
    public Message addEmployee(Employee employee) {
        int i = employeeService.addEmployee(employee);
        if (i != 0) {
            return MessageUtil.success("添加员工信息成功", "status", 1);
        } else {
            return MessageUtil.success("添加员工信息成功", "status", 0);
        }
    }
}



