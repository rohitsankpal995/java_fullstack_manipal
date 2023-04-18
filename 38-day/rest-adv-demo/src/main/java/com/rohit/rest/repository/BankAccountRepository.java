package com.rohit.rest.repository;

import com.rohit.rest.domain.BankAccount;

import java.util.Collection;

public interface BankAccountRepository {

    BankAccount save(BankAccount account);

    Collection<BankAccount> findAll();
}
