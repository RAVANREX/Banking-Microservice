 package com.banking.accountservices.models.entities.coreAccountManagement;

// import jakarta.persistence.*;
// import lombok.*;

// import java.math.BigDecimal;
// import java.sql.Time;
// import java.time.Instant;

// import com.banking.accountservices.models.entities.types.AccountStatus;
// import com.banking.accountservices.models.entities.types.AccountType;

// @Entity
public class Account {

    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "account_id")
    // private Long accountId;

    // @Column(unique = true, nullable = false, length = 20, name = "account_number")
    // private String accountNumber;

    // @Enumerated(EnumType.STRING)
    // @Column(nullable = false, name = "account_type")
    // private AccountType accountType;

    // @Column(nullable = false, precision = 15, scale = 2, name = "balance")
    // private BigDecimal balance;

    // @Enumerated(EnumType.STRING)
    // @Column(nullable = false, name = "status")
    // private AccountStatus status;

    // @Column(nullable = false, updatable = false, name = "created_at")
    // private Time createdAt;

    // @Column(nullable = false, name = "updated_at")
    // private Time updatedAt;

    // public Account(Long accountId, String accountNumber, AccountType accountType, BigDecimal balance,
    //         AccountStatus status, Time createdAt, Time updatedAt) {
    //     this.accountId = accountId;
    //     this.accountNumber = accountNumber;
    //     this.accountType = accountType;
    //     this.balance = balance;
    //     this.status = status;
    //     this.createdAt = createdAt;
    //     this.updatedAt = updatedAt;
    // }

    // public void setAccountId(Long accountId) {
    //     this.accountId = accountId;
    // }

    // public void setAccountNumber(String accountNumber) {
    //     this.accountNumber = accountNumber;
    // }

    // public void setAccountType(AccountType accountType) {
    //     this.accountType = accountType;
    // }

    // public void setBalance(BigDecimal balance) {
    //     this.balance = balance;
    // }

    // public void setStatus(AccountStatus status) {
    //     this.status = status;
    // }

    // public void setCreatedAt(Time createdAt) {
    //     this.createdAt = createdAt;
    // }

    // public void setUpdatedAt(Time updatedAt) {
    //     this.updatedAt = updatedAt;
    // }

    // public Long getAccountId() {
    //     return accountId;
    // }

    // public String getAccountNumber() {
    //     return accountNumber;
    // }

    // public AccountType getAccountType() {
    //     return accountType;
    // }

    // public BigDecimal getBalance() {
    //     return balance;
    // }

    // public AccountStatus getStatus() {
    //     return status;
    // }

    // public Time getCreatedAt() {
    //     return createdAt;
    // }

    // public Time getUpdatedAt() {
    //     return updatedAt;
    // }

    // @PrePersist
    // protected void onCreate() {
    //     this.createdAt = java.time.Instant.now();
    //     this.updatedAt = java.time.Instant.now();
    // }

    // @PreUpdate
    // protected void onUpdate() {
    //     this.updatedAt = java.time.Instant.now();
    // }
}
