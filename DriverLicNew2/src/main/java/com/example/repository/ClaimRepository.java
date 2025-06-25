package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Claim;
import com.example.entity.Policy;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer>{

	public List<Claim> findByPolicyId(Integer policyId);
}
