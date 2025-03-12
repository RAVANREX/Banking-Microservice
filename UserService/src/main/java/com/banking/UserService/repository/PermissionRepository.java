package com.banking.UserService.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.UserService.Models.entity.baseEntity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
    // Add custom query methods if needed
}
