package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.PolicyPremium;
@Repository
public interface PolicyPremiumRepository extends JpaRepository<PolicyPremium,Integer>{

}
