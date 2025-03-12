package com.banking.UserService.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.UserService.Models.entity.baseEntity.PasswordPolicy;

@Repository
public interface PasswordPolicyRepository extends JpaRepository<PasswordPolicy, Long> {
    // Add custom query methods if needed
}
