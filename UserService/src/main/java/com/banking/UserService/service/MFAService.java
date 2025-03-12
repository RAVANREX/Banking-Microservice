package com.banking.UserService.service;

import com.banking.UserService.Models.entity.baseEntity.MFA;

public interface MFAService {
    void enableMFA(MFA request);
    void verifyMFA(MFA request);
}
