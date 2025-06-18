package com.example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Policy;
import com.example.entity.PolicyPremium;
import com.example.entity.User;
import com.example.service.PolicyPremiumService;
import com.example.service.PolicyService;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private PolicyService policyService;

	@Autowired
	private PolicyPremiumService policypremiumService;

	@PostMapping("/saveUsers")
	public User saveUsers(@RequestBody User user) {
		User userResponse = userService.saveUser(user);
		return userResponse;
	}

	@PostMapping("/saveUserPolicyPremium")
	public User saveUserPolicy(@RequestBody User user) {
		// save user
		User userResponse = userService.saveUser(user); // for user details 
		Integer userId =	userResponse.getId();
		List<Policy> policies = user.getPolicyList(); // for policy details
		// multiple policy
		for (Policy policy : policies) {
			policy.setUserId(userId);
			policyService.savePolicy(policy);
		}

		List<PolicyPremium> policypremiums = user.getPolicypremiumList(); // for policy premium details
		for (PolicyPremium policypremium : policypremiums) {
			policypremium.setUserId(userId);
			policypremiumService.savePolicyPremium(policypremium);
		}
		return userResponse;
	}

}
