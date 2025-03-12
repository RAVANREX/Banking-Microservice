package com.banking.UserService.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.UserService.Models.entity.baseEntity.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    // Add custom query methods if needed
}
