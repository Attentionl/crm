package com.sxdx.customer.service;

import com.sxdx.basic.bean.CusSource;
import com.sxdx.basic.bean.CusState;

import java.util.List;

/**
 * @author 毕必成
 * @description 客户来源
 * @data 2020-02-2020/2/16
 **/
public interface CusSourceService {

    /*
     *@param: [cusSource]
     *@name: addCusSource
     *@description: 添加一个客户状态
     *@retrun: int
     *@date: 2020/2/16
     *@author: 毕必成
     */
    int addCusSource(CusSource cusSource);

    /*
     *@param: [integer]
     *@name: deleteCusSource
     *@description: 删除一个客户状态
     *@retrun: int
     *@date: 2020/2/16
     *@author: 毕必成
     */
    int deleteCusSource(Integer integer);

    /*
     *@param: [cusSource]
     *@name: updateCusSource
     *@description: 更新一个客户状态
     *@retrun: int
     *@date: 2020/2/16
     *@author: 毕必成
     */
    int updateCusSource(CusSource cusSource);

    /*
     *@param: []
     *@name: selectAllCusSource
     *@description: 查询所有的客户状态
     *@retrun: java.util.List<com.sxdx.basic.bean.CusSource>
     *@date: 2020/2/16
     *@author: 毕必成
     */
    List<CusSource> selectAllCusSource();

    /*
     *@param: [integer]
     *@name: selectCusSourceById
     *@description: 根据id查询客户状态
     *@retrun: com.sxdx.basic.bean.CusSource
     *@date: 2020/2/16
     *@author: 毕必成
     */
    CusSource selectCusSourceById(Integer integer);

}
