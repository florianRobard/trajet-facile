
package com.poe.trajetfacile.api;

import com.poe.trajetfacile.domain.Account;
import com.poe.trajetfacile.repository.AccountRepository;
import com.poe.trajetfacile.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @Autowired
    AccountRepository accountRepository;

    @GetMapping("{id}")
    public Account find(@PathVariable("id") Long accountId) {
        return accountRepository.findOne(accountId);
    }

    @GetMapping
    public Iterable<Account> findAll() {
        return accountRepository.findAll();
    }

    @PostMapping
    public void signup(@RequestBody Account account) {
        System.out.println("signup | account: " + account);
        accountService.signup(account);
    }
}