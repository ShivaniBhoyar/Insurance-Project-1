package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice // denotes this class is used to handle all global exception
public class DriverHandlerException {

	@ExceptionHandler(value = { DriverNotFoundException.class }) // match
	public ResponseEntity<Object> handleDriver(DriverNotFoundException driverNotFoundException) {
		DriverException driverException = new DriverException(driverNotFoundException.getMessage(),
				HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(driverException, HttpStatus.NOT_FOUND);
		/*
		 * ResponseEntity<Object> allows custom responses.
		 * It includes:
		 * Response body (any object)
		 * HTTP status (like 200 OK, 404 NOT FOUND, etc.)
		 * driverException contain : message and status and its a hole body
		 * 
		 */
	}

}
