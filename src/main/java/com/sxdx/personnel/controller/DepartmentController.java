package com.sxdx.personnel.controller;

import com.sxdx.basic.bean.Department;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.personnel.service.DepartmentService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    /**
     * @param department
     * @name: addDepartment
     * @description: TODO 新增部门
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/7 20:58
     * @auther: 李今朝
     */
    @ApiOperation(value = "添加部门信息")
    @PostMapping("addDepartment")
    public Message addDepartment(@ApiParam("部门对象") Department department) {
        int i = departmentService.addDepartment(department);
        if (i != 0) {
            //1代表成功
            return MessageUtil.success("部门添加成功", "status", 1);
        } else {
            //0代表失败
            return MessageUtil.success("部门添加失败", "status", 0);
        }

    }

    /**
     * @param id
     * @name: deleteDepartment
     * @description: TODO  删除部门
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/7 21:02
     * @auther: 李今朝
     */
    @PostMapping("deleteDepartment")
    public Message deleteDepartment(Integer id) {
        int i = departmentService.deleteDepartmentById(id);
        if (i != 0) {
            //1代表成功
            return MessageUtil.success("部门删除成功", "status", 1);
        } else {
            //0代表失败
            return MessageUtil.success("部门删除失败", "status", 0);
        }
    }

    /**
     * @param department
     * @name: updateDepartment
     * @description: TODO  更新部门信息
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/7 21:04
     * @auther: 李今朝
     */
    @PostMapping("updateDepartment")
    public Message updateDepartment(Department department) {
        int i = departmentService.updateDepartmentById(department);
        if (i != 0) {
            //1代表成功
            return MessageUtil.success("部门信息更新成功", "status", 1);
        } else {
            //0代表失败
            return MessageUtil.success("部门更新失败失败", "status", 0);
        }
    }

    /**
     * @name: selectAllDepartment
     * @description: TODO  查找全部的部门信息
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/7 21:15
     * @auther: 李今朝
     */
    @GetMapping("selectAllDepartment")
    public Message selectAllDepartment() {
        List<Department> departments = departmentService.selectAllDepartment();
        return MessageUtil.success("查找部门全部信息成功", "departments", departments);
    }

}
