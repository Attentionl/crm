package com.sxdx.basic.mapper;

import com.sxdx.basic.bean.Receipt;
import com.sxdx.basic.bean.ReceiptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceiptMapper {
    long countByExample(ReceiptExample example);

    int deleteByExample(ReceiptExample example);

    int deleteByPrimaryKey(Integer receiptid);

    int insert(Receipt record);

    int insertSelective(Receipt record);

    List<Receipt> selectByExample(ReceiptExample example);

    Receipt selectByPrimaryKey(Integer receiptid);

    int updateByExampleSelective(@Param("record") Receipt record, @Param("example") ReceiptExample example);

    int updateByExample(@Param("record") Receipt record, @Param("example") ReceiptExample example);

    int updateByPrimaryKeySelective(Receipt record);

    int updateByPrimaryKey(Receipt record);
}