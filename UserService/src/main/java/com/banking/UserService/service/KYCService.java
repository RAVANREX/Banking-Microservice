package com.banking.UserService.service;

import com.banking.UserService.Models.entity.baseEntity.KYCInfo;


public interface KYCService {
    void submitKYC(KYCInfo request);
    KYCInfo getKYCStatus(Long userId);
}
