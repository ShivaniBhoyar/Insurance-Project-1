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
		Driver driver1=	driverRepository.save(driver);
		return driver1;
	}

	@Override
	public Driver updateDriver(Driver driver) {
		Driver driver1=	driverRepository.save(driver);
		return driver1;
	}

	@Override
	public Optional<Driver> getDriver(Integer id) {
		Optional<Driver> driver1 =	driverRepository.findById(id);
		 if (driver1.isEmpty()) {
		        throw new DriverNotFoundException("Driver Id " + id + " is not found in the database");
		    }
		return driver1;
			
	}

	@Override
	public void deleteDriver(Integer id) {
		driverRepository.deleteById(id);
		
	}

	
	

}
