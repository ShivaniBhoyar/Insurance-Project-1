package com.example.service;

import java.util.List;

import com.example.entity.PolicySchedule;

public interface PolicyScheduleService {
	
	public PolicySchedule savePolicy(PolicySchedule policySchedule);

	public List<PolicySchedule> getAllPolicies();
}
