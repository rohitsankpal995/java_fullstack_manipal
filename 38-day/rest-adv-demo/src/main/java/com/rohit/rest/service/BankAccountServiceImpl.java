package com.rohit.rest.service;

import com.rohit.rest.dto.BankAccountDto;
import com.rohit.rest.repository.BankAccountRepository;
import com.rohit.rest.util.DmDtConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@AllArgsConstructor // to enable constructor injection
@Service
public class BankAccountServiceImpl implements BankAccountService{

    private final BankAccountRepository repository;
    private final DmDtConverter converter;

    @Override
    public Integer createNewAccount(BankAccountDto dto) {
        repository.save(converter.toDomain(dto));
        return 1;
    }

    @Override
    public Collection<BankAccountDto> listAllAccounts() {

        return repository.findAll()
                .stream()
                // .map(account -> converter.toDto(account))
                .map(converter::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public Integer updateAccount(BankAccountDto dto) {
        repository.save(converter.toDomain(dto));
        return 1;
    }
}
