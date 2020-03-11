package com.sxdx.customer.service.impl;

import com.sxdx.customer.service.CustomerService;
import com.sxdx.basic.bean.Customer;
import com.sxdx.basic.bean.CustomerExample;
import com.sxdx.basic.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 毕必成
 * @description CustomerService的实现类
 * @data 2020-02-2020/2/14
 **/
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired(required = false)
    private CustomerMapper customerMapper;

    /*
    *@param: [customer]
    *@name: addCustomer
    *@description: 添加客户
    *@retrun: int
    *@date: 2020/2/14
    *@author: 毕必成
    */
    @Override
    public int addCustomer(Customer customer) {
        int i = customerMapper.insert(customer);
        return i;
    }
    
    /*
    *@param: [integer]
    *@name: deleteCustomer
    *@description: 通过id删除客户
    *@retrun: int
    *@date: 2020/2/14 
    *@author: 毕必成
    */
    @Override
    public int deleteCustomer(Integer integer) {
        int i = customerMapper.deleteByPrimaryKey(integer);
        return i;
    }
    
    /*
    *@param: [customer]
    *@name: updateCustomer
    *@description: 更新客户信息
    *@retrun: void
    *@date: 2020/2/14 
    *@author: 毕必成
    */
    @Override
    public int updateCustomer(Customer customer) {
        return customerMapper.updateByPrimaryKey(customer);
    }

    /*
    *@param: []
    *@name: selectAllCustomer
    *@description: 查询所有的客户
    *@retrun: java.util.List<com.sxdx.basic.bean.Customer>
    *@date: 2020/2/14
    *@author: 毕必成
    */
    @Override
    public List<Customer> selectAllCustomer() {
        CustomerExample example = new CustomerExample();
        example.createCriteria().andIdIsNotNull();
        List<Customer> customers = customerMapper.selectByExample(example);
        return customers;
    }

    /*
    *@param: [integer]
    *@name: selcteByCusId
    *@description: 通过id来查询客户
    *@retrun: com.sxdx.basic.bean.Customer
    *@date: 2020/2/14
    *@author: 毕必成
    */
    @Override
    public Customer selcteByCusId(Integer integer) {
        return customerMapper.selectByPrimaryKey(integer);
    }

    @Override
    public List<Customer> selectByCusName(String username) {
        CustomerExample example = new CustomerExample();
        example.createCriteria().andNameEqualTo(username);

        return  customerMapper.selectByExample(example);
    }
}
