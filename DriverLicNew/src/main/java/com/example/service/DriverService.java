package com.example.service;

import java.util.Optional;

import com.example.entity.Driver;

public interface DriverService {

	public Driver saveDriver(Driver driver);
	
	public Driver updateDriver(Driver driver);
	
	public Optional<Driver> getDriver(Integer id);
	
	public void deleteDriver(Integer id);
}
