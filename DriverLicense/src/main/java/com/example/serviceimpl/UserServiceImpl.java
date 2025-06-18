package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUsers(User user) {
		User user1 =	userRepository.save(user);
		return user1;
	}

	@Override
	public User saveUser1(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}

	
}
