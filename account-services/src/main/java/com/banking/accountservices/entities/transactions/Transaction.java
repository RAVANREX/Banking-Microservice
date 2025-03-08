package com.banking.accountservices.entities.transactions;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

import com.banking.accountservices.entities.core_account_management.Account;
import com.banking.accountservices.entities.types.TransactionStatus;
import com.banking.accountservices.entities.types.TransactionType;

@Entity
@Table(name = "transactions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID transactionId;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @ManyToOne
    @JoinColumn(name = "transaction_type_id", nullable = false)
    private TransactionType transactionType;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "transaction_status_id", nullable = false)
    private TransactionStatus status;

    @Column(nullable = false, updatable = false)
    private java.time.Instant createdAt = java.time.Instant.now();
}
