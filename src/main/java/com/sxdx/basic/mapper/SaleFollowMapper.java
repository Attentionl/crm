package com.sxdx.basic.mapper;

import com.sxdx.basic.bean.SaleFollow;
import com.sxdx.basic.bean.SaleFollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleFollowMapper {
    long countByExample(SaleFollowExample example);

    int deleteByExample(SaleFollowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SaleFollow record);

    int insertSelective(SaleFollow record);

    List<SaleFollow> selectByExample(SaleFollowExample example);

    SaleFollow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SaleFollow record, @Param("example") SaleFollowExample example);

    int updateByExample(@Param("record") SaleFollow record, @Param("example") SaleFollowExample example);

    int updateByPrimaryKeySelective(SaleFollow record);

    int updateByPrimaryKey(SaleFollow record);
}