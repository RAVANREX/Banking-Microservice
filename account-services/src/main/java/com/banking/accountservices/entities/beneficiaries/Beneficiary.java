package com.banking.accountservices.entities.beneficiaries;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

import com.banking.accountservices.entities.core_account_management.Account;

@Entity
@Table(name = "beneficiaries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beneficiary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID beneficiaryId;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Column(nullable = false, length = 100)
    private String beneficiaryName;

    @Column(nullable = false, length = 20, unique = true)
    private String beneficiaryAccountNumber;

    @Column(nullable = false, length = 50)
    private String bankName;

    @Column(nullable = false, length = 20)
    private String ifscCode;

    @Column(nullable = false)
    private Boolean isTrusted = false;
}
