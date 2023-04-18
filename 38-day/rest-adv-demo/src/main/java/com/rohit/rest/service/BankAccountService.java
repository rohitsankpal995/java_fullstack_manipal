package com.rohit.rest.service;

import com.rohit.rest.dto.BankAccountDto;

import java.util.Collection;

public interface BankAccountService {

    Integer createNewAccount(BankAccountDto account);

    Collection<BankAccountDto> listAllAccounts();

    Integer updateAccount(BankAccountDto account);
}
