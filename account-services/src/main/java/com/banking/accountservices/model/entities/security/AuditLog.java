package com.banking.accountservices.model.entities.security;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "audit_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID logId;

    @Column(nullable = false, length = 255)
    private String event;

    @Column(nullable = false, length = 100)
    private String performedBy;

    @Column(nullable = false, updatable = false)
    private java.time.Instant timestamp = java.time.Instant.now();
}
