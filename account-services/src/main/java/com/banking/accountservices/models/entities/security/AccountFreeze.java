package com.banking.accountservices.models.entities.security;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

import com.banking.accountservices.models.entities.core_account_management.Account;

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

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Column(nullable = false)
    private Boolean isFrozen = true;

    @Column(nullable = false, updatable = false)
    private java.time.Instant frozenAt = java.time.Instant.now();

    @Column(length = 255)
    private String reason;
}
