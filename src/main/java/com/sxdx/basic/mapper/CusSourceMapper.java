package com.sxdx.basic.mapper;

import com.sxdx.basic.bean.CusSource;
import com.sxdx.basic.bean.CusSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusSourceMapper {
    long countByExample(CusSourceExample example);

    int deleteByExample(CusSourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CusSource record);

    int insertSelective(CusSource record);

    List<CusSource> selectByExample(CusSourceExample example);

    CusSource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CusSource record, @Param("example") CusSourceExample example);

    int updateByExample(@Param("record") CusSource record, @Param("example") CusSourceExample example);

    int updateByPrimaryKeySelective(CusSource record);

    int updateByPrimaryKey(CusSource record);
}