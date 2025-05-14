package com.banking.accountservices.models.entities.security;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

import com.banking.accountservices.models.entities.coreAccountManagement.Account;

@Entity
@Table(name = "account_freeze")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountFreeze {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID freezeId;

    private Account account;

    @Column(nullable = false)
    private Boolean isFrozen = true;

    @Column(nullable = false, updatable = false)
    private java.time.Instant frozenAt = java.time.Instant.now();

    @Column(length = 255)
    private String reason;
}
