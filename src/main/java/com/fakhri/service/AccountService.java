package com.fakhri.service;

import com.fakhri.domain.Account;

import java.math.BigDecimal;

public interface AccountService {

    public void transferMoney(Long sourceId, Long destinationId, BigDecimal balance);

    public Account getAccount(Long id);

}
