package com.banking.UserService.Models.entity.baseEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userProfileId;

    private Long userId;

    private String firstName;

    private String lastName;

    private String middleName;

    private Long phoneNumber01;

    private Long phoneNumber02;

    private Long mobileNumber01;

    private Long mobileNumber02;

    private Long profileStatus;

    private String gender;

    private LocalDate dateOfBirth;

    private String nationality;

    private String profilePictureUrl;

    @CreationTimestamp
    private LocalDateTime createdOn;

    @UpdateTimestamp
    private LocalDateTime updatedOn;

    
}
