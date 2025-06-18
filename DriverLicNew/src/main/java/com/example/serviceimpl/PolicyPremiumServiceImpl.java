package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.PolicyPremium;
import com.example.repository.PolicyPremiumRepository;
import com.example.service.PolicyPremiumService;
@Service
public class PolicyPremiumServiceImpl implements PolicyPremiumService {

	@Autowired
	private PolicyPremiumRepository policyPremiumRepository;

	@Override
	public PolicyPremium savePolicyPremium(PolicyPremium policypremium) {
		PolicyPremium policy1 = policyPremiumRepository.save(policypremium);
		return policy1;
	}

}
