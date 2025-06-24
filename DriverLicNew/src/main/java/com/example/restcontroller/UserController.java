package com.example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


import com.example.entity.Policy;
import com.example.entity.PolicyPremium;
import com.example.entity.PolicySchedule;
import com.example.entity.User;
import com.example.service.PolicyPremiumService;
import com.example.service.PolicyScheduleService;
import com.example.service.PolicyService;
import com.example.service.UserService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private PolicyService policyService;

	@Autowired
	private PolicyPremiumService policypremiumService;
	
	@Autowired
	private PolicyScheduleService policyScheduleService;

	@PostMapping("/saveUsers")
	public User saveUsers(@RequestBody User user) {
		User userResponse = userService.saveUser(user);
		return userResponse;
	}

	@PostMapping("/saveUserPolicyPremium")
	@Operation(
	    summary = "Save Employee Data",
	    description = "Rest API used to store employee data"
	)
	@ApiResponses(value = {
	    @ApiResponse(responseCode = "200", description = "Successful operation"),
	    @ApiResponse(responseCode = "400", description = "Invalid input"),
	    @ApiResponse(responseCode = "500", description = "Internal server error")
	})
	public User saveUserPolicy(@RequestBody User user) {
		// save user
		User userResponse = userService.saveUser(user); // for user details 
		Integer userId =	userResponse.getId();
		List<Policy> policies = user.getPolicyList(); // for policy details
		// multiple policy
		for (Policy policy : policies) {
			policy.setUserId(userId);
			policyService.savePolicy(policy);
			
			PolicySchedule policySchedule1	= policy.getPolicySchedule(); // here we fetch the data from policy request body
			policySchedule1.setPolicyId(policy.getPolicyno()); // set the policyId into pSchedule
			policyScheduleService.savePolicy(policySchedule1); // save the end date
		}
		List<PolicyPremium> policypremiums = user.getPolicypremiumList(); // for policy premium details
		for (PolicyPremium policypremium : policypremiums) {
			policypremium.setUserId(userId);
			policypremiumService.savePolicyPremium(policypremium);
		}
		
		
		return userResponse;
	}

}
