package com.fakhri;

import com.fakhri.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = appContext.getBean("accountService", AccountService.class);

        System.out.println(accountService.getAccount(1L).getName());
        System.out.println("Account service before money transfer");
        System.out.println("Account 1 balance : " + accountService.getAccount(1L).getBalance());
        System.out.println("Account 2 balance : " + accountService.getAccount(2L).getBalance());
        //Logic bisnis ada di AccountServiceImplementation
        accountService.transferMoney(1L, 2L,new BigDecimal(1000));
        System.out.println("Account service after money transfer");
        System.out.println("Account 1 balance : " + accountService.getAccount(1L).getBalance());
        System.out.println("Account 2 balance : " + accountService.getAccount(2L).getBalance());
    }
}
