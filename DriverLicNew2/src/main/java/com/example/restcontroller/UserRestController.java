package com.example.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;

@RestController
public class UserRestController {
	
	@GetMapping("/getUserWithMultiplePolicyWithMultipleClaim")
	public  User getUser(@PathVariable Integer userId) {
		return null;
		
	}

}
