package com.sxdx.finance.controller;

import com.sxdx.basic.bean.Receivadles;
import com.sxdx.basic.bean.Refund;
import com.sxdx.basic.utils.Message;
import com.sxdx.basic.utils.MessageUtil;
import com.sxdx.finance.service.RefundService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author yawen
 * @version 1.0
 * @className RefundController
 * @description 回款表现层
 * @createdTime 2020/2/18 16:29
 */

@Validated
@RestController
@RequestMapping("/refund")
public class RefundController {

    @Autowired
    private RefundService refundService;

    /**
     * @return com.sxdx.basic.utils.Message
     * @name selectAll
     * @description 查询所有回款信息
     * @auther yawen
     * @date 2020/2/18 16:40
     */
    @ApiOperation(value = "查询所有回款信息")
    @GetMapping("selectAll")
    public Message selectAll() {
        List<Refund> refunds = refundService.selectAll();
        return MessageUtil.success("查询成功", "refunds", refunds);
    }

    /**
     * @return com.sxdx.basic.utils.Message
     * @name deleteById
     * @description 通过id删除回款信息
     * @auther yawen
     * @date 2020/2/18 16:46
     */
    @ApiOperation(value = "通过id删除回款信息")
    @GetMapping("deleteById")
    public Message deleteById(Integer id) {
        refundService.deleteRefundById(id);
        return MessageUtil.success("删除成功");
    }

    /**
     * @return com.sxdx.basic.utils.Message
     * @name batchDelete
     * @description 批量删除
     * @auther yawen
     * @date 2020/2/18 16:48
     */
    @ApiOperation("批量删除")
    @PostMapping("batchDelete")
    public Message batchDelete(Integer[] ids) {
        refundService.batchDelete(ids);
        return MessageUtil.success("一键删除成功");
    }

    /**
     * @param [receivadles, refundTime, createrId, ifReceipt, remark]
     * @return com.sxdx.basic.utils.Message
     * @name saveOrUpdate
     * @description 保存或更新；前端需要传输对应的应收款信息
     * @auther yawen
     * @date 2020/2/18 17:06
     */
    @ApiOperation(value = "保存或更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "refundTime", value = "回款时间", paramType = "form", required = true),
            @ApiImplicitParam(name = "createrId", value = "创建者id", paramType = "form", required = true),
            @ApiImplicitParam(name = "ifReceipt", value = "是否开票", paramType = "form", required = true),
            @ApiImplicitParam(name = "remark", value = "备注", paramType = "form"),
    })
    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(
            @RequestBody Receivadles receivadles,//前端传输回来对应的合同，也可以传输id，看前端咋方便吧
            Date refundTime,
            Integer createrId,
            Integer ifReceipt,
//数据库中是string类型的，懒得改了，前端用int吧，保存的时候转换一下，用0，1表示是否开票吧，可以用enum，保存的时候转换一下：1.未开票；2.生成开票信息
            String remark
    ) {
        Refund refund = new Refund();
        refund.setRefundtime(refundTime);
        refund.setCreaterid(createrId);
        refund.setIfreceipt(Integer.toString(ifReceipt));
        refund.setRemark(remark);
        refundService.saveOrUpdate(refund, receivadles);
        return MessageUtil.success("更新成功");
    }

}
