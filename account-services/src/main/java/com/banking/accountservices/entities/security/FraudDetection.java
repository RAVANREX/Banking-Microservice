package com.banking.accountservices.entities.security;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

import com.banking.accountservices.entities.transactions.Transaction;

@Entity
@Table(name = "fraud_detection")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder 
public class FraudDetection {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID fraudId;

    @ManyToOne
    @JoinColumn(name = "transaction_id", nullable = false)
    private Transaction transaction;

    @Column(nullable = false)
    private Boolean isFlagged = false;

    @Column(length = 255)
    private String reason;

    @Column(nullable = false, updatable = false)
    private java.time.Instant flaggedAt = java.time.Instant.now();
}
