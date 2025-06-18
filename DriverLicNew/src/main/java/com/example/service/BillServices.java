package com.example.services;

import org.springframework.stereotype.Service;

import com.example.entity.Bill;
import com.example.entity.Employee;

@Service
public interface BillServices {
public void deleteBill(Integer bill_id); //1
	
	public Bill getBillById(Integer bill_id);

	public Bill saveBill(Bill bill);
}
