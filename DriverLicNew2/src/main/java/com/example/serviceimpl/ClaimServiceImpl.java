package com.example.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Claim;
import com.example.repository.ClaimRepository;
import com.example.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService {
	
	private ClaimRepository claimRepository;

	@Override
	public List<Claim> getAllClaims() {
		return claimRepository.findAll() ;
	}

}
