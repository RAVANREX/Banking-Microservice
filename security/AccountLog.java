package com.banking.accountservices.models.entities.security;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

import com.banking.accountservices.models.entities.coreAccountManagement.Account;

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

    private Account account;

    @Column(nullable = false, length = 255)
    private String action;

    @Column(nullable = false, updatable = false)
    private java.time.Instant timestamp = java.time.Instant.now();
}
