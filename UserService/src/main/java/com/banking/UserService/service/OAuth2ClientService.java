package com.banking.UserService.service;

import com.banking.UserService.Models.entity.baseEntity.OAuth2Client;

public interface OAuth2ClientService {
    OAuth2Client registerClient(OAuth2Client request);
    OAuth2Client getClientById(Long id);
    void deleteClient(Long id);
}
