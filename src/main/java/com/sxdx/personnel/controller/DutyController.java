package com.sxdx.personnel.controller;

import com.sxdx.basic.bean.Duty;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.personnel.service.DutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 李今朝
 * @className DutyController
 * @version1.0
 * @description 岗位的控制层
 * @createdTime 2020/2/16 16:47
 */

@RestController
@RequestMapping("/duty")
public class DutyController {

    @Autowired
    private DutyService dutyService;

    /**
     * @param duty
     * @name: addDuty
     * @description: TODO 添加岗位
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/16 17:17
     * @auther: 李今朝
     */
    @PostMapping("addDuty")
    public Message addDuty(@RequestBody Duty duty) {
        int i = dutyService.addDuty(duty);
        if (i != 0) {
            return MessageUtil.success("添加岗位成功", "status", 1);
        } else {
            return MessageUtil.success("添加岗位失败", "status", 0);
        }
    }

    /**
     * @param id
     * @name: deleteDutyById
     * @description: TODO  删除岗位
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/16 17:17
     * @auther: 李今朝
     */
    @PostMapping("deleteDutyById")
    public Message deleteDutyById(@RequestBody int id) {
        int i = dutyService.deleteDutyById(id);
        if (i != 0) {
            return MessageUtil.success("删除岗位成功", "status", 1);
        } else {
            return MessageUtil.success("删除岗位失败", "status", 0);
        }
    }

    /**
     * @param duty
     * @name: updateDuty
     * @description: TODO 更新岗位信息
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/16 17:17
     * @auther: 李今朝
     */
    @PostMapping("updateDuty")
    public Message updateDuty(@RequestBody Duty duty) {
        int i = dutyService.updateDuty(duty);
        if (i != 0) {
            return MessageUtil.success("更新岗位成功", "status", 1);
        } else {
            return MessageUtil.success("更新岗位失败", "status", 0);
        }
    }

    /**
     * @name: selectAllDuty
     * @description: TODO  查询全部岗位信息
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/16 17:18
     * @auther: 李今朝
     */
    @PostMapping("selectAllDuty")
    public Message selectAllDuty() {
        List<Duty> duties = dutyService.selectAllDuty();
        if (duties.size() != 0) {
            return MessageUtil.success("查询全部岗位成功", "duties", duties);
        } else {
            return MessageUtil.success("岗位信息为空！");
        }
    }

    /**
     * @param id
     * @name: selectDutyById
     * @description: TODO  通过id查询岗位信息
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/16 17:20
     * @auther: 李今朝
     */
    @PostMapping("selectDutyById")
    public Message selectDutyById(@RequestBody Integer id) {
        Duty duty = dutyService.selectDutyById(id);
        if (duty != null) {
            return MessageUtil.success("查询岗位成功", "duty", duty);
        } else {
            return MessageUtil.success("岗位信息为空！");
        }
    }
}
