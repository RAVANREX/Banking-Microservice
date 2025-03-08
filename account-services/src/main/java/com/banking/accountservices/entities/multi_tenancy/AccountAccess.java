package com.banking.accountservices.entities.multi_tenancy;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

import com.banking.accountservices.entities.core_account_management.Account;
import com.banking.accountservices.entities.types.AccountRole;

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

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private AccountRole role;

    @Column(nullable = false)
    private Boolean isActive = true;
}
