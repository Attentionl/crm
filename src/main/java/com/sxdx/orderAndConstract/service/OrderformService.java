package com.sxdx.orderAndConstract.service;

import com.sxdx.basic.bean.Orderform;

import java.util.List;
/**
 * @author 张伟
 * @className OrderformServiceImpl
 * @version1.0 2020/2/15
 * @description 账户信息服务层的实现类
 * @createdTime 2020/2/15 22:36
 */
public interface OrderformService {
    /**
     * 添加
     *
     * @param orderform
     * @return
     */
    int addOrderform(Orderform orderform);

    /**
     * 通过id删除
     *
     * @param id
     * @return
     */
    int deleteOrderformById(Integer id);



    /**
     * 通过id更新信息
     *
     * @param orderform
     * @return
     */
    int updateOrderformById(Orderform orderform);

    /**
     * 通过id查询
     *
     * @param id
     * @return
     */
    Orderform selectOrderformById(Integer id);

    /**
     * 查询所有
     *
     * @return
     */
    List<Orderform> selectAllOrderform();
}
