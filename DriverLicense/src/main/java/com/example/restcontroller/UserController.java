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
	 
	 @PostMapping("/saveUserPolicyPremium")
		public User saveUserPolicy(@RequestBody User user) {
			// save user
			User user1 = userService.saveUser1(user);
			List<Policy> policies = user.getPolicyList();
			// multiple policy
			for (Policy policy : policies) {
				policy.setUserId(user1.getId()); 
				policyService.savePolicy(policy);
			}

			List<PolicyPremium> policypremiums= user.getPolicypremiumList();
			for (PolicyPremium policypremium : policypremiums) {
				policypremium.setUserId(user1.getId());
				policypremiumService.savePolicyPremium(policypremium);
			}
			return user1;
		}
	 

}
