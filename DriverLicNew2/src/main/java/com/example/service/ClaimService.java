package com.example.service;

import java.util.List;

import com.example.entity.Claim;

public interface ClaimService {

	public List<Claim> getAllClaimsByPolicyId(Integer policyId);
}
