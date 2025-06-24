package com.example.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Policy;
import com.example.repository.PolicyRepository;
import com.example.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {

	private PolicyRepository policyRepository;
	
	@Override
	public List<Policy> getAllPolicies() {
		return policyRepository.findAll();
	}

}
