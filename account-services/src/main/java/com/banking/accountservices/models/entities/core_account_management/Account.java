package com.banking.accountservices.models.entities.core_account_management;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

import com.banking.accountservices.models.entities.types.AccountStatus;
import com.banking.accountservices.models.entities.types.AccountType;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long accountId;

    @Column(unique = true, nullable = false, length = 20, name = "account_number")
    private String accountNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "account_type")
    private AccountType accountType;

    @Column(nullable = false, precision = 15, scale = 2, name = "balance")
    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "status")
    private AccountStatus status;

    @Column(nullable = false, updatable = false, name = "created_at")
    private java.time.Instant createdAt = java.time.Instant.now();

    @Column(nullable = false, name = "updated_at")
    private java.time.Instant updatedAt = java.time.Instant.now();
}
