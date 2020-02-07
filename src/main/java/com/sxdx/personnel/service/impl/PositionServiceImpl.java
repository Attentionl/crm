package com.sxdx.personnel.service.impl;

import com.sxdx.basic.bean.Position;
import com.sxdx.basic.bean.PositionExample;
import com.sxdx.basic.mapper.PositionMapper;
import com.sxdx.personnel.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李今朝
 * @className PositionServiceImpl
 * @version1.0
 * @description 岗位Service实现类
 * @createdTime 2020/2/7 21:53
 */
@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionMapper positionMapper;

    @Override
    public int addPosition(Position position) {
        int i = positionMapper.insert(position);
        return i;
    }

    @Override
    public int deletePositionById(Integer id) {
        int i = positionMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int updatePosition(Position position) {
        int i = positionMapper.updateByPrimaryKeySelective(position);
        return i;
    }

    @Override
    public List<Position> selectAllPosition() {
        PositionExample positionExample = new PositionExample();
        positionExample.createCriteria().andIdIsNotNull();
        List<Position> positions = positionMapper.selectByExample(positionExample);
        return positions;
    }

    @Override
    public Position selectPositionById(Integer id) {
        Position position = positionMapper.selectByPrimaryKey(id);
        return position;
    }
}
