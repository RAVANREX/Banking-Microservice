package com.banking.accountservices.entities.core_account_management;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "account_history")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID historyId;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Column(nullable = false, length = 50)
    private String changeType;

    @Column(columnDefinition = "TEXT")
    private String previousValue;

    @Column(columnDefinition = "TEXT")
    private String newValue;

    @Column(nullable = false, updatable = false)
    private java.time.Instant changedAt = java.time.Instant.now();
}
