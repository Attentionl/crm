package com.sxdx.personnel.controller;

import com.sxdx.basic.bean.Department;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.personnel.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李今朝
 * @version1.0 2020/2/6
 * @description 用来管理部门的Contorller
 */
@RestController
@Transactional(rollbackFor = Exception.class)
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("addDepartment")
    public Message addDepartment(Department department) {
        int i = departmentService.addDepartment(department);
        if (i != 0) {
            //1代表成功
            return MessageUtil.success("部门添加成功", "status", 1);
        } else {
            //0代表失败
            return MessageUtil.success("部门添加成功", "status", 0);
        }

    }

}
