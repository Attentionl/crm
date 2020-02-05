package com.sxdx.basic.mapper;

import com.sxdx.basic.bean.Refund;
import com.sxdx.basic.bean.RefundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundMapper {
    long countByExample(RefundExample example);

    int deleteByExample(RefundExample example);

    int deleteByPrimaryKey(Integer refundid);

    int insert(Refund record);

    int insertSelective(Refund record);

    List<Refund> selectByExample(RefundExample example);

    Refund selectByPrimaryKey(Integer refundid);

    int updateByExampleSelective(@Param("record") Refund record, @Param("example") RefundExample example);

    int updateByExample(@Param("record") Refund record, @Param("example") RefundExample example);

    int updateByPrimaryKeySelective(Refund record);

    int updateByPrimaryKey(Refund record);
}