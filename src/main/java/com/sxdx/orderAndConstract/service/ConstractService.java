package com.sxdx.orderAndConstract.service;

import com.sxdx.basic.bean.Constract;

import java.util.List;
/**
 * @author 张伟
 * @className AccountServiceImpl
 * @version1.0 2020/2/15
 * @description 账户信息服务层的实现类
 * @createdTime 2020/2/15 22:30
 */
public interface ConstractService {
    /**
     * 添加
     *
     * @param constract
     * @return
     */
    int addConstract(Constract constract);

    /**
     * 通过id删除
     *
     * @param id
     * @return
     */
    int deleteConstractById(Integer id);

    /**
     * 通过名字删除
     *
     * @param name
     * @return
     */
    int deleteConstractByName(String name);

    /**
     * 通过id更新信息
     *
     * @param constract
     * @return
     */
    int updateConstractById(Constract constract);

    /**
     * 通过id查询
     *
     * @param id
     * @return
     */
    Constract selectConstractById(Integer id);

    /**
     * 查询所有
     *
     * @return
     */
    List<Constract> selectAllConstract();
}
