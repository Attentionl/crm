package com.sxdx.basic.mapper;

import com.sxdx.basic.bean.ProduceFollow;
import com.sxdx.basic.bean.ProduceFollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProduceFollowMapper {
    long countByExample(ProduceFollowExample example);

    int deleteByExample(ProduceFollowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProduceFollow record);

    int insertSelective(ProduceFollow record);

    List<ProduceFollow> selectByExample(ProduceFollowExample example);

    ProduceFollow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProduceFollow record, @Param("example") ProduceFollowExample example);

    int updateByExample(@Param("record") ProduceFollow record, @Param("example") ProduceFollowExample example);

    int updateByPrimaryKeySelective(ProduceFollow record);

    int updateByPrimaryKey(ProduceFollow record);
}