package com.example.service;

import java.util.List;

import com.example.entity.Policy;

public interface PolicyService {
	
	public List<Policy> getPoliciesByUserId(Integer userId);

}
