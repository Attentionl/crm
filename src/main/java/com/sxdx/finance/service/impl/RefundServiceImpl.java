package com.sxdx.finance.service.impl;

import com.sxdx.basic.bean.Receivadles;
import com.sxdx.basic.bean.Refund;
import com.sxdx.basic.bean.RefundExample;
import com.sxdx.basic.exception.CustomerException;
import com.sxdx.basic.mapper.RefundMapper;
import com.sxdx.finance.service.RefundService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yawen
 * @version 1.0
 * @className RefundServiceImpl
 * @description 回款业务实现类
 * @createdTime 2020/2/18 15:53
 */
@Service
public class RefundServiceImpl implements RefundService {

  @Autowired
  private RefundMapper refundMapper;

  @Override
  public void saveOrUpdate(Refund refund, Receivadles receivadles) throws CustomerException {

  /*
    id是自增长，不用添加
    应收款编号：需要前端将对应的应收款对象传过来
    合同编号：通过应收款对象中获得
    回款金额：等于应收款金额（回款和应收款是1对1的关系，合同和应收款是1对多；要不太麻烦了）
    创建时间：当前时间

    controller中写：
    回款时间：需要自定义
    创建人员：需要自定义
    是否开票：需要自定义
    备注：自定义
   */

    refund.setReceivablesid(receivadles.getReceivablesid());
    refund.setContractid(receivadles.getContractid());
    refund.setRefundamount(receivadles.getAmountreceivable());
    refund.setCreatetime(new Date());
    refundMapper.insert(refund);
  }

  @Override
  @Transactional
  public void deleteRefundById(Integer id) throws CustomerException {
    Refund refund = refundMapper.selectByPrimaryKey(id);
    if (refund == null) {
      throw new CustomerException("要删除的回款信息不存在");
    }
    refundMapper.deleteByPrimaryKey(id);
  }

  @Override
  public void batchDelete(Integer[] ids) throws CustomerException {
    for (Integer id : ids) {
      this.deleteRefundById(id);
    }
  }

  @Override
  public List<Refund> selectAll() {
    return refundMapper.selectByExample(new RefundExample());
  }
}
