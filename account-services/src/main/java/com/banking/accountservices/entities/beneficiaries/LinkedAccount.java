package com.banking.accountservices.entities.beneficiaries;



    

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

import com.banking.accountservices.entities.core_account_management.Account;

@Entity
@Table(name = "linked_accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LinkedAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID linkedAccountId;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Column(nullable = false, length = 100)
    private String externalBankName;

    @Column(nullable = false, length = 20, unique = true)
    private String externalAccountNumber;

    @Column(nullable = false, length = 20)
    private String externalIfscCode;

    @Column(nullable = false)
    private Boolean isActive = true;
}
