package com.example.exception;

public class DriverNotFoundException extends RuntimeException {
	//If DriverNotFoundException is thrown:Spring calls handleDriver(...).

	public DriverNotFoundException(String message) {
		super(message);
		
	}

}
