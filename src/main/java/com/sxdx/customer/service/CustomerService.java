package com.sxdx.customer.service;

import com.sxdx.basic.bean.Customer;

import java.util.List;

/**
 * @description 客户 service类
 * @author 毕必成
 * @data 2020-02-2020/2/14
 **/

public interface CustomerService {

   /*
   *@param: [customer]
   *@name: addCustomer
   *@description: 添加客户service
   *@retrun: int
   *@date: 2020/2/14
   *@author: 毕必成
   */
    int addCustomer(Customer customer);
    
    /*
    *@param: [integer]
    *@name: deleteCustomer
    *@description: 通过id 删除客户
    *@retrun: int
    *@date: 2020/2/14 
    *@author: 毕必成
    */
    int deleteCustomer(Integer integer);
    
    /*
    *@param: [customer]
    *@name: updateCustomer
    *@description: 更新客户信息
    *@retrun: void
    *@date: 2020/2/14 
    *@author: 毕必成
    */
    int updateCustomer(Customer customer);
    
    /*
    *@param: []
    *@name: selectAllCustomer
    *@description: 查询所有的客户
    *@retrun: java.util.List<com.sxdx.basic.bean.Customer>
    *@date: 2020/2/14 
    *@author: 毕必成
    */
    List<Customer> selectAllCustomer();
    
    /*
    *@param: [integer]
    *@name: selcteByCusId
    *@description: 通过id查询客户信息
    *@retrun: com.sxdx.basic.bean.Customer
    *@date: 2020/2/14 
    *@author: 毕必成
    */
    Customer selcteByCusId(Integer integer);
    
    /*
    *@param: [username]
    *@name: selectByCusName
    *@description: 通过username查询客户
    *@retrun: com.sxdx.basic.bean.Customer
    *@date: 2020/2/18 
    *@author: 毕必成
    */
    List<Customer> selectByCusName(String username);

}
