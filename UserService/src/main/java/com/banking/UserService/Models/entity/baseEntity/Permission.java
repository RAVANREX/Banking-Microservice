package com.banking.UserService.Models.entity.baseEntity;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.CreationTimestamp;

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
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long permissionId;

    @Column(nullable = false, unique = true)
    private String permissionName;

    private String permissionDescription;

    private String is_default;

    private String permissionType;

    private String permissionCategory;

    private String permissionStatus;

    @CreationTimestamp
    private LocalDate creationOn;

    private String status;
    
    private String createdBy;

    private String updatedBy;

}
