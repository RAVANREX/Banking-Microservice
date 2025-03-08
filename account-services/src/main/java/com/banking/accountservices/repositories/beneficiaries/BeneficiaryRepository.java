package com.banking.accountservices.repositories.beneficiaries;


import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.accountservices.models.entities.beneficiaries.Beneficiary;

public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {

    

}
