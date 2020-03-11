package com.sxdx.finance.controller;

import com.sxdx.basic.bean.Receipt;
import com.sxdx.basic.bean.Refund;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.finance.service.ReceiptService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className ReceiptController
 * @author yawen
 * @version 1.0
 * @description 开票的表现层
 * @createdTime 2020/2/19 12:24
 */
@Validated
@RestController
@RequestMapping("/receipt")
public class ReceiptController {

  @Autowired
  private ReceiptService receiptService;

  /**
   * @name selectAll
   * @param []
   * @return com.sxdx.basic.utils.Message
   * @description 查询所有票据信息
   * @auther yawen
   * @date 2020/2/19 13:10
   */
  @ApiOperation(value = "查询所有票据信息")
  @GetMapping("selectAll")
  public Message selectAll(){
    List<Receipt> receipts = receiptService.selectAll();
    return MessageUtil.success("查询成功","receipts",receipts);
  }


  /**
   * @name deleteById
   * @param [id]
   * @return com.sxdx.basic.utils.Message
   * @description 通过id删除票据信息
   * @auther yawen
   * @date 2020/2/19 13:18
   */
  @ApiOperation(value = "通过id删除票据信息")
  @GetMapping("deleteById")
  public Message deleteById(Integer id){
    receiptService.deleteReceiptById(id);
    return MessageUtil.success("删除成功");
  }

  /**
   * @name batchDelete
   * @param [ids]
   * @return com.sxdx.basic.utils.Message
   * @description 批量删除
   * @auther yawen
   * @date 2020/2/19 13:20
   */
  @ApiOperation("批量删除")
  @PostMapping("batchDelete")
  public Message batchDelete(Integer[] ids){
    receiptService.batchDelete(ids);
    return MessageUtil.success("一键删除成功");
  }


  @ApiOperation(value = "保存或更新")
  @ApiImplicitParams({
      @ApiImplicitParam(name = "receiptType",value="开票类型",paramType = "form",required = true),
      @ApiImplicitParam(name = "receiptDate", value = "开票日期", paramType = "form", required = true),
      @ApiImplicitParam(name = "createrId", value = "创建者id", paramType = "form", required = true),
      @ApiImplicitParam(name = "remark", value = "备注", paramType = "form"),

  })
  @PostMapping("saveOrUpdate")
  public Message saveOrUpdate(
      @RequestBody Refund refund,
      String receiptType,//完了用enum来表示
      Date receiptDate,
      Integer createrId,
      String remark
  ){
    Receipt receipt = new Receipt();
    receipt.setReceipttype(receiptType);
    receipt.setReceiptdate(receiptDate);
    receipt.setCreaterid(createrId);
    receipt.setRemark(remark);
    receiptService.saveOrUpdate(receipt,refund);
    return MessageUtil.success("更新成功");

  }


}
