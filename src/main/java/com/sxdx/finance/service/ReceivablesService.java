package com.sxdx.finance.service;

import com.sxdx.basic.bean.Receivadles;
import com.sxdx.basic.exception.CustomerException;

import java.util.List;

/**
 * @author yawen
 * @version 1.0
 * @className IReceivablesService
 * @description 应收账款业务接口类
 * @createdTime 2020/2/15 18:39
 */

public interface ReceivablesService {

  /*

  通过id删除
  一键删除

  通过id保存并修改

  按照不同条件查询
  级联查询
   */

    /*
     * @name saveOrUpdate
     * @param [receivadles]
     * @return void
     * @description 添加和保存
     * @auther yawen
     * @date 2020/2/16 9:15
     */
    void saveOrUpdate(Receivadles receivadles) throws CustomerException;

    /*
     * @name deleteReceivablesById
     * @param [id]
     * @return void
     * @description 通过id删除
     * @auther yawen
     * @date 2020/2/16 9:15
     */
    void deleteReceivablesById(Integer id) throws CustomerException;

    /*
     * @name batchDelete
     * @param [id]
     * @return void
     * @description 批量删除
     * @auther yawen
     * @date 2020/2/16 9:19
     */
    void batchDelete(Integer[] id) throws CustomerException;

    /*
     * @name selectAll
     * @param []
     * @return java.util.List<com.sxdx.basic.bean.Receivadles>
     * @description 查询所有应收账款
     * @auther yawen
     * @date 2020/2/16 10:30
     */
    List<Receivadles> selectAll();

}
