package com.sxdx.orderAndConstract.service.impl;

import com.sxdx.basic.bean.Orderform;
import com.sxdx.basic.bean.OrderformExample;
import com.sxdx.basic.mapper.OrderformMapper;
import com.sxdx.orderAndConstract.service.OrderformService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangwei
 * @className OrderformServiceImpl
 * @version1.0
 * @description 订单信息实现层
 * @createdTime 2020/2/16 0:49
 */
@Service
public class OrderformServiceImpl implements OrderformService {
    @Resource
    private OrderformMapper orderformMapper;

    @Override
    public int addOrderform(Orderform orderform) {
        int i = orderformMapper.insert(orderform);
        return i;
    }

    @Override
    public int deleteOrderformById(Integer id) {
        int i = orderformMapper.deleteByPrimaryKey(id);
        return i;
    }


    @Override
    public int updateOrderformById(Orderform orderform) {
        int i = orderformMapper.updateByPrimaryKeySelective(orderform);
        return i;
    }

    @Override
    public Orderform selectOrderformById(Integer id) {
        Orderform orderform = orderformMapper.selectByPrimaryKey(id);
        return orderform;
    }

    @Override
    public List<Orderform> selectAllOrderform() {
        OrderformExample example = new OrderformExample();
        example.createCriteria().andIdIsNotNull();
        List<Orderform> list = orderformMapper.selectByExample(example);
        return list;
    }
}
