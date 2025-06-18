package com.example.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.entity.Bill;
import com.example.entity.Employee;
import com.example.repository.BillRepository;
import com.example.services.BillServices;

@Service
public class EmployeeServicesimpl implements BillServices{
	@Autowired(required=true)
	private BillRepository billrepository;
	
	

	public Bill getBillById(Integer bill_id) { //1
		Optional<Bill> b = billrepository.findById(bill_id); //1
		Bill bill = null;
		if (b.isPresent()) { //return true
			bill = b.get(); //get method is used to return value
		}
		return bill;
	}
	
	public void deleteBill(Integer bill_id) { //1
		billrepository.deleteById(bill_id);
	}

	@Override
	public Bill saveBill(Bill bill) {
		Bill b1=billrepository.save(bill);
		return b1;

	

}
}

