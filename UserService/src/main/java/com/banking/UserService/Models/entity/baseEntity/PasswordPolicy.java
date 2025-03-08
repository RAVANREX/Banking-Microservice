package com.banking.UserService.Models.entity.baseEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Where;
import jakarta.persistence.Index;
import org.hibernate.annotations.SQLDelete;
import jakarta.persistence.Table;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@SQLDelete(sql = "UPDATE PasswordPolicy SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
public class PasswordPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer minLength;

    @Column(nullable = false)
    private Integer maxLength;

    @Column(nullable = false)
    private Boolean requiresUppercase;

    @Column(nullable = false)
    private Boolean requiresLowercase;

    @Column(nullable = false)
    private Boolean requiresNumber;

    @Column(nullable = false)
    private Boolean requiresSpecialCharacter;

    @Column(nullable = false)
    private Integer maxFailedAttempts;

    @Column(nullable = false)
    private Integer passwordExpiryDays;

    @Column(nullable = false)
    private Integer passwordHistoryCount;

    private Boolean allowPasswordReuseAfterExpiry;

    @CreationTimestamp
    private LocalDateTime createdOn;

    @UpdateTimestamp
    private LocalDateTime updatedOn;

    @Column(nullable = false)
    private Boolean deleted = false;

    private String createdBy;
    private String updatedBy;
}

