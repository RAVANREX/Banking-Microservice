package com.banking.UserService.Models.entity.baseEnums;

public enum RiskLevel {
    LOW,       // Standard user with low transaction limits
    MEDIUM,    // Higher risk but still approved
    HIGH,      // High-value transactions, requires manual checks
    PROHIBITED // Blocked from making transactions
}

