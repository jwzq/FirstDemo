package com.qinsi.dao.impl;

import com.qinsi.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Override
    public String hello() {
        System.out.println("hello gradle!");
        return null;
    }
}
