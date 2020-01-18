package com.sxdx.basic.mapper;

import com.sxdx.basic.bean.AfterSaleFollow;
import com.sxdx.basic.bean.AfterSaleFollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AfterSaleFollowMapper {
    long countByExample(AfterSaleFollowExample example);

    int deleteByExample(AfterSaleFollowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AfterSaleFollow record);

    int insertSelective(AfterSaleFollow record);

    List<AfterSaleFollow> selectByExample(AfterSaleFollowExample example);

    AfterSaleFollow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AfterSaleFollow record, @Param("example") AfterSaleFollowExample example);

    int updateByExample(@Param("record") AfterSaleFollow record, @Param("example") AfterSaleFollowExample example);

    int updateByPrimaryKeySelective(AfterSaleFollow record);

    int updateByPrimaryKey(AfterSaleFollow record);
}