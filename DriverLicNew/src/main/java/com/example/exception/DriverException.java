package com.example.exception;

import org.springframework.http.HttpStatus;

public class DriverException {
	
	private final String message; 
	
	private final HttpStatus status;
	
	public DriverException(String message, 
	 HttpStatus status) { 
	this.message = message; 

	this.status = status; 
	} 
	
	public String getMessage() { 
	return message; 
	} 
	

	
	public HttpStatus getStatus() { 
	return status; 
	} 
	
}
