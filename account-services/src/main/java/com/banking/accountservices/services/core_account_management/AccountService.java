package com.banking.accountservices.services.core_account_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.accountservices.models.entities.core_account_management.Account;
import com.banking.accountservices.repositories.core_account_management.AccountRepository;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account getAccount(Long accountId){
        return accountRepository.findById(accountId).orElse(null);
    }

    public void deleteAccount(Long accountId){
        accountRepository.deleteById(accountId);
    }

    public Account updateAccount(Account account){
        return accountRepository.save(account);
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public void deleteAllAccounts() {
        accountRepository.deleteAll();
    }
}
