package com.example.restcontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Driver;
import com.example.service.DriverService;

@RestController
public class DriverRestController {
	
	@Autowired
	private DriverService  driverService;
	
	@PostMapping("/saveDriverInfo")
	public Driver saveDriver(@RequestBody Driver driver) {
		Driver driver2=	driverService.saveDriver(driver);
		return driver2;
	}
	
	@PutMapping("/updateDriver")
	public Driver updateDriver(@RequestBody Driver driver) {
		Driver driver2=	driverService.saveDriver(driver);
		return driver2;
	}

	@GetMapping("/getDriver/{id}")
	public Optional<Driver> getDriver( @PathVariable("id") Integer id){
		Optional<Driver> driver2 = driverService.getDriver(id);
		return driver2;
	}
	
	@DeleteMapping("/deleteDriver/{id}")
	public String deleteDriver(@PathVariable("id") Integer id) {
		if(driverService.getDriver(id)==null)
		{
			return "Data is not avilable into database";	
		}
		
		driverService.deleteDriver(id);
		return "Data deleted successfully";	
	}
	
}
