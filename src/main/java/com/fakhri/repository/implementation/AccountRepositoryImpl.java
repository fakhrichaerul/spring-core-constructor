package com.fakhri.repository.implementation;

import com.fakhri.domain.Account;
import com.fakhri.repository.AccountRepository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class AccountRepositoryImpl implements AccountRepository {

    private Map<Long, Account> accountMap = new HashMap<Long, Account>();
    {
        Account account1 = new Account();
        account1.setId(1L);
        account1.setAccountNumber("001");
        account1.setBalance(new BigDecimal(100000));
        account1.setName("Fakhri");
        Account account2 = new Account();
        account2.setId(2L);
        account2.setAccountNumber("002");
        account2.setBalance(new BigDecimal(200000));
        account2.setName("Budi");

        accountMap.put(account1.getId(), account1);
        accountMap.put(account2.getId(), account2);
    }

    @Override
    public void update(Account account) {
        accountMap.put(account.getId(), account);
    }

    @Override
    public Account find(Long id) {
        accountMap.get(id);
        return accountMap.get(id);
    }
}
