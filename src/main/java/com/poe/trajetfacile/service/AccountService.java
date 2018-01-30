package com.poe.trajetfacile.service;

import com.poe.trajetfacile.repository.AccountRepository;
import com.poe.trajetfacile.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Business Code about account management.
 */
@Service
public class AccountService {

    @Autowired
    AccountRepository accountDao;

    public void signup(Account account) {
        accountDao.save(account);
    }
}
