package com.sxdx.finance.service;

import com.sxdx.basic.bean.Constract;
import com.sxdx.basic.bean.Receivadles;
import com.sxdx.basic.bean.Refund;
import com.sxdx.basic.exception.CustomerException;
import java.util.List;

/**
 * @author yawen
 * @version 1.0
 * @className RefundService
 * @description 回款业务接口
 * @createdTime 2020/2/18 15:44
 */

public interface RefundService {

  /*
    需要写一个通过合同id查询所有回款金额的总和，合同的已收金额需要使用这个方法
   */


  /*
   * @name saveOrUpdate
   * @param [refund, receivadles]
   * @return void
   * @description 添加和保存
   * @auther yawen
   * @date 2020/2/18 15:48
   */
  void saveOrUpdate(Refund refund, Receivadles receivadles) throws CustomerException;

  /*
   * @name deleteRefundById
   * @param [id]
   * @return void
   * @description  通过id删除
   * @auther yawen
   * @date 2020/2/18 15:49
   */
  void deleteRefundById(Integer id) throws CustomerException;


  /*
   * @name batchDelete
   * @param [id]
   * @return void
   * @description 批量删除
   * @auther yawen
   * @date 2020/2/18 15:50
   */
  void batchDelete(Integer[] ids) throws CustomerException;


  /*
   * @name selectAll
   * @param []
   * @return java.util.List<com.sxdx.basic.bean.Refund>
   * @description 查询所有回款信息
   * @auther yawen
   * @date 2020/2/18 15:50
   */
  List<Refund> selectAll();

}
