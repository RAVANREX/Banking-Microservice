package com.banking.UserService.repository;

import com.banking.UserService.Models.entity.baseEntity.OAuth2Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OAuth2ClientRepository extends JpaRepository<OAuth2Client, Long> {
    // Additional query methods if needed
}
