package com.sxdx.productInformation.service;

import com.sxdx.basic.bean.Product;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description: 产品管理模块
 * @author: Likyeong
 * @date: 2020/2/22 11:39
 **/
public interface ProductService {
     /**
     *@Author: LiKyeong
     *@since: JDK 1.8
     *@Description: 查询所有产品
     *@Return:
     *@Param:
     *@Date: 15:22 2020/3/4
     **/
     List<Product> selectAllProduct();
     /**
     *@Author: LiKyeong
     *@since: JDK 1.8
     *@Description: 分类查询
     *@Return: java.util.List<com.sxdx.basic.bean.Product>
     *@Param: [category]
     *@Date: 15:26 2020/3/4
     **/
     List<Product> selectProductByCategory(String category);
     /**
     *@Author: LiKyeong
     *@since: JDK 1.8
     *@Description: 根据id查询产品
     *@Return: com.sxdx.basic.bean.Product
     *@Param: [id]
     *@Date: 15:38 2020/3/4
     **/
     Product selectProductById(Integer id);
}
