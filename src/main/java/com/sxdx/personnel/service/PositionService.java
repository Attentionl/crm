package com.sxdx.personnel.service;

import com.sxdx.basic.bean.Position;

import java.util.List;

/**
 * @author 李今朝
 * @className PositionService
 * @version1.0
 * @description 岗位服务层
 * @createdTime 2020/2/7 21:45
 */
public interface PositionService {

    /**
     * @param position 岗位对象
     * @name: addPosition
     * @description: TODO 添加岗位
     * @return: int 返回操作值
     * @date: 2020/2/7 21:48
     * @auther: 李今朝
     */
    int addPosition(Position position);

    /**
     * @param id
     * @name: deletePositionById
     * @description: TODO  通过id删除岗位信息
     * @return: int
     * @date: 2020/2/7 21:48
     * @auther: 李今朝
     */
    int deletePositionById(Integer id);

    /**
     * @param position
     * @name: updatePosition
     * @description: TODO  更新岗位信息
     * @return: int
     * @date: 2020/2/7 21:49
     * @auther: 李今朝
     */
    int updatePosition(Position position);

    /**
     * @name: selectAllPosition
     * @description: TODO  查询全部的岗位信息
     * @return: java.util.List<com.sxdx.basic.bean.Position>
     * @date: 2020/2/7 21:49
     * @auther: 李今朝
     */
    List<Position> selectAllPosition();

    /**
     * @param id
     * @name: selectPositionById
     * @description: TODO  通过id查询岗位信息
     * @return: com.sxdx.basic.bean.Position
     * @date: 2020/2/7 21:50
     * @auther: 李今朝
     */
    Position selectPositionById(Integer id);
}
