package com.banking.UserService.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.UserService.Models.entity.baseEntity.MFA;

@Repository
public interface MFARepository extends JpaRepository<MFA, Long> {
    // Additional query methods if needed
}
