package com.example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Claim;
import com.example.entity.Policy;
import com.example.entity.User;
import com.example.service.ClaimService;
import com.example.service.PolicyService;
import com.example.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService userService;

	@Autowired
	private PolicyService policyService;

	@Autowired
	private ClaimService claimService;

	@GetMapping("/getUser/{userId}")
	public User getUserWithMultiplePolicyWithMultipleClaim(@PathVariable Integer userId) { // 101
	User userResponse =	userService.getUser(userId); //101  userResponse contains all the data of user details
	if(userResponse==null)
	{
		return null;
	}
	List<Policy> policyResponse = policyService.getPoliciesByUserId(userId); // 101 policyResponse contain all policy table data 
	
	 for (Policy policy : policyResponse) {
         List<Claim> claims = claimService.getAllClaimsByPolicyId(policy.getPolicyId()); // 1
         policy.setClaimList(claims); // assumes you have setClaims() in Policy class
     }
	 userResponse.setPolicyList(policyResponse);
	 
		return userResponse ;
		

	}

}
