package com.banking.accountservices.services.coreAccoutManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.accountservices.models.entities.coreAccountManagement.Account;
import com.banking.accountservices.repositories.coreAccountManagement.AccountRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    // public Optional<Account> getAccount(Long accountId){
    //     return new Optional<Account>(accountRepository.findById(accountId).orElse(null));
    // }

    
    // public void deleteAccount(Long accountId){
    //     accountRepository.deleteById(accountId);
    // }

  
    // public Account updateAccount(Account account){
    //     return accountRepository.save(account);
    // }

    public Optional<List<Account>> getAllAccounts() {
        return Optional.of(accountRepository.findAll());
    }

    public Optional<Account> getAccountByAccountNumber(String accountNumber) {
        return Optional.of(accountRepository.findByAccountNumber(accountNumber));
        
    }

    public Optional<Account> updateAccountById(Long accountId, Account account) {
        Account existingAccount = accountRepository.findById(accountId)
            .orElseThrow(() -> new RuntimeException("Account not found with ID: " + accountId));

            existingAccount.setAccountNumber(account.getAccountNumber());
            existingAccount.setAccountType(account.getAccountType());
            existingAccount.setAccountStatus(account.getAccountStatus());
            existingAccount.setUserId(account.getUserId());
            existingAccount.setBranchCode(account.getBranchCode());
            existingAccount.setBalance(account.getBalance());
        
        return Optional.of(accountRepository.save(existingAccount));

    }

    public Boolean deleteAccountById(Long accountId) {
        if(accountRepository.existsById(accountId)){
            accountRepository.deleteById(accountId);
            return true;
        }
        return false;
    }



    
    // public void deleteAllAccounts() {
    //     accountRepository.deleteAll();
    // }
}
