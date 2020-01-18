package com.sxdx.basic.mapper;

import com.sxdx.basic.bean.CusGrade;
import com.sxdx.basic.bean.CusGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusGradeMapper {
    long countByExample(CusGradeExample example);

    int deleteByExample(CusGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CusGrade record);

    int insertSelective(CusGrade record);

    List<CusGrade> selectByExample(CusGradeExample example);

    CusGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CusGrade record, @Param("example") CusGradeExample example);

    int updateByExample(@Param("record") CusGrade record, @Param("example") CusGradeExample example);

    int updateByPrimaryKeySelective(CusGrade record);

    int updateByPrimaryKey(CusGrade record);
}