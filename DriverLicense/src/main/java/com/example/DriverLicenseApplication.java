package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // act as a microservice
public class DriverLicenseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriverLicenseApplication.class, args);
	}

}
