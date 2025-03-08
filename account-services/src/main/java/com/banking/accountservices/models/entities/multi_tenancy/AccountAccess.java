package com.banking.accountservices.models.entities.multi_tenancy;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

import com.banking.accountservices.models.entities.core_account_management.Account;
import com.banking.accountservices.models.entities.types.BusinessAccountRole;

@Entity
@Table(name = "account_access")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountAccess {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID accessId;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private long userId; // Assuming UserService handles user details

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BusinessAccountRole role;

    @Column(nullable = false)
    private Boolean isActive = true;
}
