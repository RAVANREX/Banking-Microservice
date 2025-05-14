package com.banking.accountservices.models.entities.multi_tenancy;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

import com.banking.accountservices.models.entities.coreAccountManagement.Account;
import com.banking.accountservices.models.entities.types.BusinessAccountRole;

@Entity
@Table(name = "account_access")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusinessAccountAccess {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID accessId;

    private Account account;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BusinessAccountRole role;

    @Column(nullable = false)
    private Boolean isActive = true;
}
