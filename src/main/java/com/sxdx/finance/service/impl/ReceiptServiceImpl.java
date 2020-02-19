package com.sxdx.finance.service.impl;

import com.sxdx.basic.bean.Receipt;
import com.sxdx.basic.bean.ReceiptExample;
import com.sxdx.basic.bean.Refund;
import com.sxdx.basic.exception.CustomerException;
import com.sxdx.basic.mapper.ReceiptMapper;
import com.sxdx.finance.service.ReceiptService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yawen
 * @version 1.0
 * @className ReceiptServiceImpl
 * @description 开票的业务实现类
 * @createdTime 2020/2/19 12:24
 */
@Service
public class ReceiptServiceImpl implements ReceiptService {

  @Autowired
  private ReceiptMapper receiptMapper;


  @Override
  public void saveOrUpdate(Receipt receipt, Refund refund) throws CustomerException {

    /*
      id是自增长，不用添加
      回款id：前端将对应的回款对象传过来
      合同编号：通过回款对象获得;;;表里是id，应该是constractid，建表的时候弄错了吧，先就这吧
      开票金额：对应的回款金额
      创建时间：当前时间

      发票类型：自定义，用enum来表示，1.增值税专用发票；2.普通发票
      开票日期：自定义
      创建人员：自定义
      备注：自定义
     */

    receipt.setRefundid(refund.getRefundid());
    receipt.setId(refund.getContractid());
    receipt.setReceiptamount(refund.getRefundamount());
    receipt.setCreatetime(new Date());
    receiptMapper.insert(receipt);

  }

  @Override
  @Transactional
  public void deleteReceiptById(Integer id) throws CustomerException {
    Receipt receipt = receiptMapper.selectByPrimaryKey(id);
    if (receipt == null) {
      throw new CustomerException("要删除的票据信息不存在");
    }
    receiptMapper.deleteByPrimaryKey(id);
  }

  @Override
  public void batchDelete(Integer[] ids) throws CustomerException {
    for (Integer id : ids) {
      this.deleteReceiptById(id);
    }
  }

  @Override
  public List<Receipt> selectAll() {
    return receiptMapper.selectByExample(new ReceiptExample());
  }
}
