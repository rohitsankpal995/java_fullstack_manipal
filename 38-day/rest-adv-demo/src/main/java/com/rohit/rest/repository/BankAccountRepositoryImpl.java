package com.rohit.rest.repository;

import com.rohit.rest.domain.BankAccount;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class BankAccountRepositoryImpl implements BankAccountRepository{
    private final HashMap<Long, BankAccount> accounts = new HashMap<>();

    @Override
    public BankAccount save(BankAccount account) {
        accounts.put(account.getId(), account);
        return accounts.get(account.getId());
    }

    @Override
    public Collection<BankAccount> findAll() {
        return accounts.values();
    }
}
