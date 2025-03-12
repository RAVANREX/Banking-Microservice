package com.banking.UserService.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.UserService.Models.entity.baseEntity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    // Add custom query methods if needed
}
