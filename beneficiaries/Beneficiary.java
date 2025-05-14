package com.banking.accountservices.models.entities.beneficiaries;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

import com.banking.accountservices.models.entities.coreAccountManagement.Account;

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
