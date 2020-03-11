package com.sxdx.productInformation.service.impl;

import com.sxdx.basic.bean.Product;
import com.sxdx.basic.bean.ProductExample;
import com.sxdx.basic.bean.PurchaseOrder;
import com.sxdx.basic.exception.CustomerException;
import com.sxdx.basic.mapper.ProductMapper;
import com.sxdx.basic.mapper.PurchaseOrderMapper;
import com.sxdx.productInformation.service.PurchaseService;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description:
 * @author: Likyeong
 * @date: 2020/3/4 15:31
 **/
public class PurchaseServiceImpl implements PurchaseService {
    @Resource
    ProductMapper productMapper;
    @Resource
    PurchaseOrderMapper purchaseOrderMapper;
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void purchaseById(Integer id) {
        ProductExample productExample=new ProductExample();
        productExample.createCriteria().andIdEqualTo(id);
        List<Product> products = productMapper.selectByExample(productExample);
        if(products.isEmpty()){
            throw new CustomerException("产品不存在，请重新输入");
        }
        Product product = products.get(0);
        PurchaseOrder purchaseOrder=new PurchaseOrder();
        purchaseOrder.setId(UUID.randomUUID().toString().replaceAll(" ","-"));
        purchaseOrder.setAmount(product.getSellingprice());
        purchaseOrder.setCreateTime(new Date());
        purchaseOrder.setProductId(id);
        purchaseOrderMapper.insert(purchaseOrder);

    }


}
