package com.banking.UserService.Models.entity.baseEnums;

public enum KYCStatus {
    PENDING,          // Document submitted but not verified
    VERIFIED,         // Successfully verified
    REJECTED,         // KYC rejected due to incorrect details
    REQUIRES_REVIEW,  // Requires manual verification
    BLACKLISTED       // User flagged for fraudulent activity
}

