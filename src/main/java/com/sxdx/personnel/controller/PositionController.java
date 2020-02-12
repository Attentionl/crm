package com.sxdx.personnel.controller;

import com.sxdx.basic.bean.Position;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.personnel.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 李今朝
 * @className PositionController
 * @version1.0
 * @description 岗位控制层
 * @createdTime 2020/2/7 21:59
 */
@RestController
@Transactional(rollbackFor = Exception.class)
@RequestMapping("/position")
public class PositionController {

    @Autowired
    private PositionService positionService;

    /**
     * @param position
     * @name: addPosition
     * @description: TODO 添加岗位
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/7 22:05
     * @auther: 李今朝
     */
    @PostMapping("addPosition")
    public Message addPosition(Position position) {
        int i = positionService.addPosition(position);
        if (i != 0) {
            return MessageUtil.success("添加岗位成功", "status", 1);
        } else {
            return MessageUtil.success("添加岗位失败", "status", 0);
        }
    }

    /**
     * @param id
     * @name: deletePosition
     * @description: TODO  删除岗位
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/7 22:06
     * @auther: 李今朝
     */
    @PostMapping("deletePosition")
    public Message deletePosition(Integer id) {
        int i = positionService.deletePositionById(id);
        if (i != 0) {
            return MessageUtil.success("删除岗位成功", "status", 1);
        } else {
            return MessageUtil.success("删除岗位失败", "status", 0);
        }
    }

    /**
     * @param position
     * @name: updatePosition
     * @description: TODO  更新岗位信息
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/7 22:13
     * @auther: 李今朝
     */
    @PostMapping("updatePosition")
    public Message updatePosition(Position position) {
        int i = positionService.updatePosition(position);
        if (i != 0) {
            return MessageUtil.success("更新岗位信息成功", "status", 1);
        } else {
            return MessageUtil.success("更新岗位信息失败", "status", 0);
        }
    }

    /**
     * @name: selectAllPosition
     * @description: TODO  查询全部岗位信息
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/7 22:15
     * @auther: 李今朝
     */
    @GetMapping("selectAllPosition")
    public Message selectAllPosition() {
        List<Position> positions = positionService.selectAllPosition();
        return MessageUtil.success("查询全部岗位信息成功", "positions", positions);
    }

    /**
     * @param id
     * @name: selectPositionById
     * @description: TODO  通过id查询岗位信息
     * @return: com.sxdx.basic.utils.Message
     * @date: 2020/2/7 22:17
     * @auther: 李今朝
     */
    @GetMapping("selectPositionById")
    public Message selectPositionById(Integer id) {
        Position position = positionService.selectPositionById(id);
        return MessageUtil.success("查询全部岗位信息成功", "position", position);
    }
}
