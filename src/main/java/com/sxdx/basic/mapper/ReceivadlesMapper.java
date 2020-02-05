package com.sxdx.basic.mapper;

import com.sxdx.basic.bean.Receivadles;
import com.sxdx.basic.bean.ReceivadlesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceivadlesMapper {
    long countByExample(ReceivadlesExample example);

    int deleteByExample(ReceivadlesExample example);

    int deleteByPrimaryKey(Integer receivablesid);

    int insert(Receivadles record);

    int insertSelective(Receivadles record);

    List<Receivadles> selectByExample(ReceivadlesExample example);

    Receivadles selectByPrimaryKey(Integer receivablesid);

    int updateByExampleSelective(@Param("record") Receivadles record, @Param("example") ReceivadlesExample example);

    int updateByExample(@Param("record") Receivadles record, @Param("example") ReceivadlesExample example);

    int updateByPrimaryKeySelective(Receivadles record);

    int updateByPrimaryKey(Receivadles record);
}