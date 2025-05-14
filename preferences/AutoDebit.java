package com.banking.accountservices.models.entities.preferences;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

import com.banking.accountservices.models.entities.coreAccountManagement.Account;

@Entity
@Table(name = "auto_debit")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AutoDebit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID autoDebitId;

    private Account account;

    @Column(nullable = false, length = 100)
    private String billerName;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal amount;

    @Column(nullable = false, length = 20)
    private String frequency; // e.g., Monthly, Quarterly, Annually

    @Column(nullable = false)
    private Boolean isActive = true;
}
