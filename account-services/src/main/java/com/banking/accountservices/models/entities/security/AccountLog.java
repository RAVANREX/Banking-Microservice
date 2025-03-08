package com.banking.accountservices.models.entities.security;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

import com.banking.accountservices.models.entities.core_account_management.Account;

@Entity
@Table(name = "account_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID logId;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Column(nullable = false, length = 255)
    private String action;

    @Column(nullable = false, updatable = false)
    private java.time.Instant timestamp = java.time.Instant.now();
}
