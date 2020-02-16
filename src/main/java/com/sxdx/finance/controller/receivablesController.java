package com.sxdx.finance.controller;

import com.sxdx.basic.bean.Receivadles;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.finance.service.IReceivablesService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/receivables")
public class receivablesController {

    @Autowired
    private IReceivablesService iReceivablesService;

    @ApiOperation(value = "查询所有应收账款")
    @GetMapping("SelectAll")
    public Message findAll() {
        List<Receivadles> list = iReceivablesService.selectAll();
        return MessageUtil.success("查询成功", "查询所有应收账款", list);
    }

    @ApiOperation(value = "通过id删除")
    @GetMapping("deleteById")
    public Message deleteById(Integer id) {
        iReceivablesService.deleteReceivablesById(id);
        return MessageUtil.success("删除成功");
    }

    @ApiOperation(value = "批量删除")
    @PostMapping("batchDelete")
    public Message batchDelete(Integer[] ids) {
        iReceivablesService.batchDelete(ids);
        return MessageUtil.success("删除成功");
    }

    @ApiOperation(value = "保存或更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "amountReceivable", value = "应收金额", paramType = "form", required = true),
            @ApiImplicitParam(name = "receivableTime", value = "应收时间", paramType = "form", required = true),
            @ApiImplicitParam(name = "creater", value = "创建人员", paramType = "form", required = true),
            @ApiImplicitParam(name = "remark", value = "备注", paramType = "form"),
    })
    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(
            @NotNull Float amountReceivable,
            Date receivableTime,
            Integer creater,
            String remark
    ) {
        Receivadles receivadles = new Receivadles();
        receivadles.setAmountreceivable(amountReceivable);
        receivadles.setReceivabletime(receivableTime);
        receivadles.setCreaterid(creater);
        receivadles.setRemark(remark);
        return MessageUtil.success("更新成功");
    }

}


