package com.sxdx.basic.mapper;

import com.sxdx.basic.bean.ccount;
import com.sxdx.basic.bean.ccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ccountMapper {
    long countByExample(ccountExample example);

    int deleteByExample(ccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ccount record);

    int insertSelective(ccount record);

    List<ccount> selectByExample(ccountExample example);

    ccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ccount record, @Param("example") ccountExample example);

    int updateByExample(@Param("record") ccount record, @Param("example") ccountExample example);

    int updateByPrimaryKeySelective(ccount record);

    int updateByPrimaryKey(ccount record);
}