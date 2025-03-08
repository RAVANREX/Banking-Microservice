package com.banking.accountservices.entities.multi_tenancy;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "business_accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusinessAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID businessAccountId;

    @Column(nullable = false, length = 100)
    private String businessName;

    @ManyToOne
    @JoinColumn(name = "business_type_id", nullable = false)
    private BusinessType businessType;

    @Column(nullable = false, length = 15, unique = true)
    private String taxId;

    @Column(nullable = false)
    private Boolean isActive = true;
}
