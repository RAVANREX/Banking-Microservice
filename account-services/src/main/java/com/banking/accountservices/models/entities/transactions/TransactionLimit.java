package com.banking.accountservices.models.entities.transactions;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

import com.banking.accountservices.models.entities.core_account_management.Account;

@Entity
@Table(name = "transaction_limits")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionLimit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID limitId;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal dailyLimit;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal monthlyLimit;
}
