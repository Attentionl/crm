package com.sxdx.finance.service;

import com.sxdx.basic.bean.Receipt;
import com.sxdx.basic.bean.Refund;
import com.sxdx.basic.exception.CustomerException;
import java.util.List;

/**
 * @author yawen
 * @version 1.0
 * @className ReceiptService
 * @description 开票的业务接口
 * @createdTime 2020/2/19 12:23
 */

public interface ReceiptService {

  /**
   * @param [receipt, refund]
   * @return void
   * @name saveOrUpdate
   * @description 添加和保存
   * @auther yawen
   * @date 2020/2/19 12:34
   */
  void saveOrUpdate(Receipt receipt, Refund refund) throws CustomerException;


  /**
   * @return void
   * @name deleteReceiptById
   * @description 通过id删除
   * @auther yawen
   * @date 2020/2/19 12:34
   */
  void deleteReceiptById(Integer id) throws CustomerException;

  /**
   * @return void
   * @name batchDelete
   * @description 批量删除
   * @auther yawen
   * @date 2020/2/19 12:34
   */
  void batchDelete(Integer[] ids) throws CustomerException;

  /**
   * @return java.util.List<com.sxdx.basic.bean.Receipt>
   * @name selectAll
   * @description 查询所有开票信息
   * @auther yawen
   * @date 2020/2/19 12:35
   */
  List<Receipt> selectAll();

}
