package com.banking.accountservices.models.entities.core_account_management;

import org.hibernate.internal.build.AllowPrintStacktrace;

import com.banking.accountservices.models.entities.types.ApplicationType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "applications")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String applicationId;

    @Column(nullable = false, updatable = false)
    private String userId;

    @Enumerated
    @Column(nullable = false)
    private ApplicationType applicationType;
    
}
