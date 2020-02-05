package com.sxdx.basic.mapper;

import com.sxdx.basic.bean.Orderform;
import com.sxdx.basic.bean.OrderformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderformMapper {
    long countByExample(OrderformExample example);

    int deleteByExample(OrderformExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Orderform record);

    int insertSelective(Orderform record);

    List<Orderform> selectByExample(OrderformExample example);

    Orderform selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Orderform record, @Param("example") OrderformExample example);

    int updateByExample(@Param("record") Orderform record, @Param("example") OrderformExample example);

    int updateByPrimaryKeySelective(Orderform record);

    int updateByPrimaryKey(Orderform record);
}