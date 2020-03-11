package com.sxdx.productInformation.service.impl;

import com.sxdx.basic.bean.Product;
import com.sxdx.basic.bean.ProductExample;
import com.sxdx.basic.exception.CustomerException;
import com.sxdx.basic.mapper.ProductMapper;
import com.sxdx.productInformation.service.ProductService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description:
 * @author: Likyeong
 * @date: 2020/3/4 15:29
 **/
public class ProductServiceImpl implements ProductService {
    @Resource
    ProductMapper productMapper;
    @Override
    public List<Product> selectAllProduct() {
        ProductExample productExample=new ProductExample();
        //查询出所有非空的产品
        productExample.createCriteria().andIdIsNotNull();
        List<Product> products = productMapper.selectByExample(productExample);
        if (products.isEmpty()) {
            throw new CustomerException("没有产品，请进行生产");
        }
        return products;
    }

    @Override
    public List<Product> selectProductByCategory(String category) {
        ProductExample productExample=new ProductExample();
        //查询出满足条件的产品
        productExample.createCriteria().andCategoryEqualTo(category);
        List<Product> products = productMapper.selectByExample(productExample);
        if (products.isEmpty()) {
            throw new CustomerException("没有满足条件的产品，请重新输入条件");
        }
        return products;
    }

    @Override
    public Product selectProductById(Integer id) {
        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andIdEqualTo(id);
        List<Product> products = productMapper.selectByExample(productExample);
        if (products.isEmpty()) {
            return products.get(0);
        }
        throw new CustomerException("产品不存在，请重新输入");
    }
}
