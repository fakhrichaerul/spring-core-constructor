package com.fakhri.repository;

import com.fakhri.domain.Account;

public interface AccountRepository {

    public void update(Account account);

    public Account find(Long id);
}
