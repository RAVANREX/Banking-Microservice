package com.banking.accountservices.models.entities.interests;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

import com.banking.accountservices.models.entities.types.AccountType;

@Entity
@Table(name = "interest_rates")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InterestRate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID rateId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountType accountType;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal rate; // Interest rate in percentage

    @Column(nullable = false, length = 20)
    private String rateType; // e.g., Fixed, Floating
}
