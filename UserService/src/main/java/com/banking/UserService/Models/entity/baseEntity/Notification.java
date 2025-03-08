package com.banking.UserService.Models.entity.baseEntity;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.CreationTimestamp;

import com.banking.UserService.Models.entity.baseEnums.NotificationType;

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
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private NotificationType type; // Enum (EMAIL, SMS, PUSH)

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private Boolean isRead = false;

    private String subject;

    private String recipient;

    @Column(nullable = false)
    private LocalDateTime sentAt;

    @CreationTimestamp
    private LocalDateTime createdOn;
}

