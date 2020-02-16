package com.sxdx.personnel.service;

import com.sxdx.basic.bean.Duty;

import java.util.List;

/**
 * @author 李今朝
 * @className DutyService
 * @version1.0
 * @description duty服务层
 * @createdTime 2020/2/16 16:48
 */
public interface DutyService {

    /**
     * @param duty
     * @name: addDuty
     * @description: TODO 添加岗位
     * @return: int
     * @date: 2020/2/16 16:51
     * @auther: 李今朝
     */
    int addDuty(Duty duty);

    /**
     * @param id
     * @name: deleteDutyById
     * @description: TODO  通过id查询岗位
     * @return: int
     * @date: 2020/2/16 16:51
     * @auther: 李今朝
     */
    int deleteDutyById(Integer id);

    /**
     * @param duty
     * @name: updateDuty
     * @description: TODO  更新岗位信息
     * @return: int
     * @date: 2020/2/16 16:52
     * @auther: 李今朝
     */
    int updateDuty(Duty duty);

    /**
     * @name: selectAllDuty
     * @description: TODO  查询全部岗位信息
     * @return: java.util.List<com.sxdx.basic.bean.Duty>
     * @date: 2020/2/16 16:54
     * @auther: 李今朝
     */
    List<Duty> selectAllDuty();

    /**
     * @param id
     * @name: selectDutyById
     * @description: TODO  通过id查询岗位信息
     * @return: com.sxdx.basic.bean.Duty
     * @date: 2020/2/16 16:55
     * @auther: 李今朝
     */
    Duty selectDutyById(Integer id);
}
