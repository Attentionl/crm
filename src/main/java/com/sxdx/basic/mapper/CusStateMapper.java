package com.sxdx.basic.mapper;

import com.sxdx.basic.bean.CusState;
import com.sxdx.basic.bean.CusStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusStateMapper {
    long countByExample(CusStateExample example);

    int deleteByExample(CusStateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CusState record);

    int insertSelective(CusState record);

    List<CusState> selectByExample(CusStateExample example);

    CusState selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CusState record, @Param("example") CusStateExample example);

    int updateByExample(@Param("record") CusState record, @Param("example") CusStateExample example);

    int updateByPrimaryKeySelective(CusState record);

    int updateByPrimaryKey(CusState record);
}