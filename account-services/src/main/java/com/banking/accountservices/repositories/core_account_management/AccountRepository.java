package com.banking.accountservices.repositories.core_account_management;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.accountservices.models.entities.core_account_management.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    // JpaRepository already provides methods like save, deleteById, and findById
}