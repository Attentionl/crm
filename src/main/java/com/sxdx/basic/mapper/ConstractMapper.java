package com.sxdx.basic.mapper;

import com.sxdx.basic.bean.Constract;
import com.sxdx.basic.bean.ConstractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConstractMapper {
    long countByExample(ConstractExample example);

    int deleteByExample(ConstractExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Constract record);

    int insertSelective(Constract record);

    List<Constract> selectByExample(ConstractExample example);

    Constract selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Constract record, @Param("example") ConstractExample example);

    int updateByExample(@Param("record") Constract record, @Param("example") ConstractExample example);

    int updateByPrimaryKeySelective(Constract record);

    int updateByPrimaryKey(Constract record);
}