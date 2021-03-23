package com.fakhri.service.implementation;

import com.fakhri.domain.Account;
import com.fakhri.repository.AccountRepository;
import com.fakhri.service.AccountService;

import java.math.BigDecimal;

public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        super();
        this.accountRepository = accountRepository;
    }

    @Override
    public void transferMoney(Long sourceId, Long destinationId, BigDecimal balance) {
        Account sourceAccount = accountRepository.find(sourceId);
        Account destinationAccount = accountRepository.find(destinationId);
        sourceAccount.setBalance(sourceAccount.getBalance().subtract(balance));
        destinationAccount.setBalance(destinationAccount.getBalance().add(balance));

        accountRepository.update(sourceAccount);
        accountRepository.update(destinationAccount);
    }

    @Override
    public Account getAccount(Long id) {

        return accountRepository.find(id);
    }


}
