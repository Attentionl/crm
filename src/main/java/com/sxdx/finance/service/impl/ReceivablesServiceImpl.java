package com.sxdx.finance.service.impl;

import com.sxdx.basic.bean.Constract;
import com.sxdx.basic.bean.Receivadles;
import com.sxdx.basic.bean.ReceivadlesExample;
import com.sxdx.basic.exception.CustomerException;
import com.sxdx.basic.mapper.ReceivadlesMapper;
import com.sxdx.finance.service.ReceivablesService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author yawen
 * @version 1.0
 * @className IReceivablesServiceImpl
 * @description 应收账款业务实现类
 * @createdTime 2020/2/16 10:38
 */
@Service
public class ReceivablesServiceImpl implements ReceivablesService {

    @Resource
    private ReceivadlesMapper receivadlesMapper;

    @Resource
    private Constract constract;

    @Override
    public void saveOrUpdate(Receivadles receivadles) throws CustomerException {
        if (receivadles.getReceivablesid() != null) {
            receivadlesMapper.updateByPrimaryKey(receivadles);
        } else {
            if (receivadles.getAmountreceivable() > constract.getAmount()) {
                throw new CustomerException("应收款金额不能大于合同金额！");
            }

            /**
             * id 是自增长，不用添加
             * 没写：已收金额，是合同的已收金额；这个需要通过合同的回款信息求和计算
             *
             * 未收金额=合同金额-已收金额
             * 创建时间是当前时间
             * 收款提醒：这个感觉有点麻烦啊
             * 提醒人员
             * 额外提醒
             *
             * 合同编号应该在增加的时候已经获取到了，前端应该传入@RequestBody
             *
             * 应收金额需要自定义
             * 应收时间需要自定义
             * 创建人员需要自定义 F
             * 备注需要自定义
             */

            receivadles.setUncollectedamount(constract.getAmount() - receivadles.getAmountreceived());
            receivadles.setCreatetime(new Date());//改long？
            receivadlesMapper.insert(receivadles);
        }
    }

    @Override
    @Transactional
    public void deleteReceivablesById(Integer id) throws CustomerException {
        Receivadles receivadles = receivadlesMapper.selectByPrimaryKey(id);
        if (receivadles == null) {
            throw new CustomerException("要删除的应收账款不存在");
        }
        receivadlesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void batchDelete(Integer[] ids) throws CustomerException {
        for (Integer id : ids) {
            this.deleteReceivablesById(id);
        }
    }

    @Override
    public List<Receivadles> selectAll() {
        return receivadlesMapper.selectByExample(new ReceivadlesExample());
    }
}
