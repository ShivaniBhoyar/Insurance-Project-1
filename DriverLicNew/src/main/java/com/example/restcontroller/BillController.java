package com.example.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Bill;

import com.example.services.BillServices;

@RestController
public class BillController {
	@Autowired(required=true)
	private BillServices billservices;

	
	@PostMapping("/saveBill")
	public Bill saveBill(@RequestBody Bill bill) {
        return billservices.saveBill(bill);
	}
	
	
	@GetMapping("/getBillById/{id}")
	public Bill getBillById(@PathVariable Integer id) { // id contain 1
		Bill bill = billservices.getBillById(id);
		return bill;
	}

	/*
	 * Design restful web service to delete employee data from 
	 * database based on employee id.
	 */
	@DeleteMapping("/deleteBill/{id}")
	public String deleteBill(@PathVariable Integer id) { // id contain 1
		billservices.deleteBill(id);
		return "Employee Data has been deleted successfully.";
	}
}