package com.sxdx.personnel.service.impl;

import com.sxdx.basic.bean.Duty;
import com.sxdx.basic.bean.DutyExample;
import com.sxdx.basic.mapper.DutyMapper;
import com.sxdx.personnel.service.DutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李今朝
 * @className DutyServiceImpl
 * @version1.0
 * @description
 * @createdTime 2020/2/16 16:49
 */
@Service
public class DutyServiceImpl implements DutyService {

    @Autowired
    private DutyMapper dutyMapper;

    @Override
    public int addDuty(Duty duty) {
        return dutyMapper.insert(duty);
    }

    @Override
    public int deleteDutyById(Integer id) {
        return dutyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateDuty(Duty duty) {
        return dutyMapper.updateByPrimaryKeySelective(duty);
    }

    @Override
    public List<Duty> selectAllDuty() {
        DutyExample example = new DutyExample();
        example.createCriteria().andIdIsNotNull();
        List<Duty> duties = dutyMapper.selectByExample(example);
        return duties;
    }

    @Override
    public Duty selectDutyById(Integer id) {
        return dutyMapper.selectByPrimaryKey(id);
    }
}
