package com.example.serviceimpl;

import java.util.Optional;

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
	public User getUser(Integer userId) {
    Optional<User> user = userRepository.findById(userId);
    User userResponse = null;
    if(user.isPresent())
    {
    	 userResponse = user.get();
    }
	return userResponse;
		
	}

}
