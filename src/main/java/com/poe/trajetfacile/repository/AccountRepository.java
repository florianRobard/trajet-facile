package com.poe.trajetfacile.repository;

import com.poe.trajetfacile.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    public List<Account> findAllByFirstName(String firstName);
}
