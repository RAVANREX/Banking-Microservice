package com.banking.UserService.repository;

import com.banking.UserService.Models.entity.baseEntity.KYCInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KYCRepository extends JpaRepository<KYCInfo, Long> {
    // Additional query methods if needed
}
