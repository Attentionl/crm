package com.sxdx.zw.service;

import com.sxdx.basic.bean.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangwei
 * @className AccountService
 * @version1.0
 * @description
 * @createdTime 2020/2/15 21:14
 */

public interface AccountService {
    /**
     * 添加
     *
     * @param account
     * @return
     */
    int addAccount(Account account);

    /**
     * 通过id删除
     *
     * @param id
     * @return
     */
    int deleteAccountById(Integer id);

    /**
     * 通过名字删除
     *
     * @param name
     * @return
     */
    int deleteAccountByName(String name);

    /**
     * 通过id更新信息
     *
     * @param account
     * @return
     */
    int updateAccountById(Account account);

    /**
     * 通过id查询
     *
     * @param id
     * @return
     */
    Account selectAccountById(Integer id);

    /**
     * 查询所有
     *
     * @return
     */
    List<Account> selectAllAccount();
}
