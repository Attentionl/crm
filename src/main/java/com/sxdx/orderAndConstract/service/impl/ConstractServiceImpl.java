package com.sxdx.orderAndConstract.service.impl;

import com.sxdx.basic.bean.Constract;
import com.sxdx.basic.bean.ConstractExample;
import com.sxdx.basic.mapper.ConstractMapper;
import com.sxdx.orderAndConstract.service.ConstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangwei
 * @className ConstractServiceImpl
 * @version1.0
 * @description 合同信息的实现层
 * @createdTime 2020/2/16 0:48
 */
@Service
public class ConstractServiceImpl implements ConstractService {

    @Resource
    private ConstractMapper constractMapper;

    @Override
    public int addConstract(Constract constract) {
        int i = constractMapper.insert(constract);
        return i;
    }

    @Override
    public int deleteConstractById(Integer id) {
        int i = constractMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int deleteConstractByName(String name) {
        ConstractExample ConstractExample = new ConstractExample();
        ConstractExample.createCriteria().andNameEqualTo(name);
        int i = constractMapper.deleteByExample(ConstractExample);
        return i;
    }

    @Override
    public int updateConstractById(Constract constract) {
        int i = constractMapper.updateByPrimaryKeySelective(constract);
        return i;
    }

    @Override
    public Constract selectConstractById(Integer id) {
        Constract constract = constractMapper.selectByPrimaryKey(id);
        return constract;
    }

    @Override
    public List<Constract> selectAllConstract() {
        ConstractExample example = new ConstractExample();
        example.createCriteria().andIdIsNotNull();
        List<Constract> list = constractMapper.selectByExample(example);
        return list;
    }
}
