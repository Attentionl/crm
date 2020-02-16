package com.sxdx.system.service.impl;

import com.sxdx.basic.bean.Account;
import com.sxdx.basic.bean.AccountExample;
import com.sxdx.basic.mapper.AccountMapper;
import com.sxdx.system.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 张伟
 * @className AccountServiceImpl
 * @version1.0 2020/2/15
 * @description 账户信息服务层的实现类
 * @createdTime 2020/2/15 20:48
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public int addAccount(Account account) {
        int i = accountMapper.insert(account);
        return i;
    }

    @Override
    public int deleteAccountById(Integer id) {
        int i = accountMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int deleteAccountByName(String name) {
        AccountExample AccountExample = new AccountExample();
        AccountExample.createCriteria().andNameEqualTo(name);
        int i = accountMapper.deleteByExample(AccountExample);
        return i;
    }

    @Override
    public int updateAccountById(Account account) {
        int i = accountMapper.updateByPrimaryKeySelective(account);
        return i;
    }

    @Override
    public Account selectAccountById(Integer id) {
        Account account = accountMapper.selectByPrimaryKey(id);
        return account;
    }

    @Override
    public List<Account> selectAllAccount() {
        AccountExample example = new AccountExample();
        example.createCriteria().andIdIsNotNull();
        List<Account> list = accountMapper.selectByExample(example);
        return list;
    }
}
