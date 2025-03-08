package com.banking.accountservices.entities.core_account_management;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID accountId;

    @Column(unique = true, nullable = false, length = 20)
    private String accountNumber;

    @ManyToOne
    @JoinColumn(name = "account_type_id", nullable = false)
    private AccountType accountType;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal balance;

    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private AccountStatus status;

    @Column(nullable = false, updatable = false)
    private java.time.Instant createdAt = java.time.Instant.now();

    @Column(nullable = false)
    private java.time.Instant updatedAt = java.time.Instant.now();
}
