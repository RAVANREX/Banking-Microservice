package com.banking.UserService.Models.entity.baseEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Where;

import com.banking.UserService.Models.entity.baseEnums.UserStatus;

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
@SQLDelete(sql = "UPDATE User SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
@Table(indexes = {
    @Index(name = "idx_user_email", columnList = "email"),
    @Index(name = "idx_user_phone", columnList = "phoneNumber")
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String hashedPassword;

    @Column(nullable = false)
    private Boolean isEmailVerified = false;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Column(nullable = false)
    private Boolean isPhoneVerified = false;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserStatus status;

    @CreationTimestamp
    private LocalDateTime createdOn;

    @UpdateTimestamp
    private LocalDateTime updatedOn;

    private String lastLoginIp;
    private LocalDateTime lastLoginTime;

    @Column(nullable = false)
    private Boolean deleted = false;

    private String createdBy;
    private String updatedBy;
}
