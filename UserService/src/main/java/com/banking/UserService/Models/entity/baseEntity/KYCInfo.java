package com.banking.UserService.Models.entity.baseEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;
import jakarta.persistence.Index;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.hibernate.annotations.UpdateTimestamp;

import com.banking.UserService.Models.entity.baseEnums.DocumentType;
import com.banking.UserService.Models.entity.baseEnums.GrantType;
import com.banking.UserService.Models.entity.baseEnums.KYCStatus;
import com.banking.UserService.Models.entity.baseEnums.RiskLevel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@SQLDelete(sql = "UPDATE KYCInfo SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
@Table(indexes = {
    @Index(name = "idx_kyc_userId", columnList = "userId"),
    @Index(name = "idx_kyc_status", columnList = "kycStatus"),
    @Index(name = "idx_kyc_riskLevel", columnList = "riskLevel")
})
public class KYCInfo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long userId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private KYCStatus kycStatus;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RiskLevel riskLevel;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DocumentType documentType;

    @Column(nullable = false, unique = true)
    private String documentNumber;

    @Column(nullable = false)
    private Boolean isVerified = false;

    private String verificationRemarks;

    @Column(nullable = false)
    private Boolean isFraudulent = false;

    @Column(nullable = false)
    private Boolean requiresManualReview = false;

    private String verifiedBy;

    @Column(nullable = false)
    private String issuingCountry;

    @Column(nullable = false)
    private LocalDate issueDate;

    @Column(nullable = false)
    private LocalDate expiryDate;

    @CreationTimestamp
    private LocalDateTime submittedOn;

    @UpdateTimestamp
    private LocalDateTime updatedOn;

    @Column(nullable = false)
    private Boolean deleted = false;
}

