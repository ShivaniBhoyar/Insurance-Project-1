package com.example.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Driver;
import com.example.exception.DriverNotFoundException;
import com.example.repository.DriverRepository;
import com.example.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverRepository driverRepository;
	
	@Override
	public Driver saveDriver(Driver driver) {
		Driver driverResponse=	driverRepository.save(driver);
		return driverResponse;
	}

	@Override
	public Driver updateDriver(Driver driver) {
		Driver driverResponse=	driverRepository.save(driver);
		return driverResponse;
	}

	@Override
	public Optional<Driver> getDriver(Integer id) {
		Optional<Driver> driverResponse =	driverRepository.findById(id);
		 if (driverResponse.isEmpty()) {
		        throw new DriverNotFoundException("Driver Id " + id + " is not found in the database");
		    }
		return driverResponse;
			
	}

	@Override
	public void deleteDriver(Integer id) {
		driverRepository.deleteById(id);
		
	}

	
	

}
