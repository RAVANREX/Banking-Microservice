package com.banking.accountservices.models.entities.interests;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

import com.banking.accountservices.models.entities.core_account_management.Account;

@Entity
@Table(name = "interest_calculations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InterestCalculation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID calculationId;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal interestEarned;

    @Column(nullable = false)
    private java.time.LocalDate calculationDate;
}
