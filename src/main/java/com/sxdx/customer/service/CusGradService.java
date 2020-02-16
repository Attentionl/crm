package com.sxdx.customer.service;

import com.sxdx.basic.bean.CusGrade;
import com.sxdx.basic.bean.Follow;

import java.util.List;

/**
 * @author 毕必成
 * @description 客户等级
 * @data 2020-02-2020/2/14
 **/
public interface CusGradService {

    /*
     *@param: [follow]
     *@name: addFollower
     *@description: 添加一个客户等级
     *@retrun: int
     *@date: 2020/2/14
     *@author: 毕必成
     */
    int addCusGrade(CusGrade cusGrade);

    /*
     *@param: [integer]
     *@name: deleteFollower
     *@description: 删除一个客户等级
     *@retrun: int
     *@date: 2020/2/14
     *@author: 毕必成
     */
    int deleteCusGrade(Integer integer);

    /*
     *@param: [follow]
     *@name: updateFollower
     *@description: 更新一个客户等级
     *@retrun: int
     *@date: 2020/2/14
     *@author: 毕必成
     */
    int updateCusGrade(CusGrade cusGrade);

    /*
     *@param: []
     *@name: selectAllFoller
     *@description: 查询所有的客户等级
     *@retrun: java.util.List<com.sxdx.basic.bean.Follow>
     *@date: 2020/2/14
     *@author: 毕必成
     */
    List<CusGrade> selectAllCusGrade();

    /*
     *@param: [integer]
     *@name: selectFollowById
     *@description: 根据id查询客户等级
     *@retrun: com.sxdx.basic.bean.Follow
     *@date: 2020/2/14
     *@author: 毕必成
     */
    CusGrade selectCusGradeById(Integer integer);


}
