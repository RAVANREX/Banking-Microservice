package com.banking.UserService.Models.entity.baseEntity;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.CreationTimestamp;

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
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    private String roleName;

    private String roleDescription;

    private String is_default;

    private String roleType;

    private String roleStatus;

    @CreationTimestamp
    private LocalDate creationOn;

    private String status;
    
    private String createdBy;

    private String updatedBy;

}
