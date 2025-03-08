package com.banking.UserService.Models.entity.baseEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Where;

import com.banking.UserService.Models.entity.baseEnums.MFAMethod;

import jakarta.persistence.Index;
import org.hibernate.annotations.SQLDelete;
import jakarta.persistence.Table;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MFA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false, length = 6)
    private String otpCode;

    @Column(nullable = false)
    private LocalDateTime expirationTime;

    @Column(nullable = false)
    private Boolean isVerified = false;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MFAMethod method; // Enum (SMS, EMAIL, AUTH_APP)

    @Column(nullable = false)
    private Integer failedAttempts = 0;

    @Column(nullable = false)
    private Boolean isBackupCode = false;

    private String deviceInfo;

    private String ipAddress;

    @CreationTimestamp
    private LocalDateTime createdOn;

    @UpdateTimestamp
    private LocalDateTime updatedOn;
}

    

