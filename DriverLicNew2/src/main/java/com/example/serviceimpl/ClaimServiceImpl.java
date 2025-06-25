package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Claim;
import com.example.repository.ClaimRepository;
import com.example.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService {
	
	@Autowired
	private ClaimRepository claimRepository;

	@Override
	public List<Claim> getAllClaimsByPolicyId(Integer policyId) {
		return	claimRepository.findByPolicyId(policyId);
		
	}

	

	
	

}
