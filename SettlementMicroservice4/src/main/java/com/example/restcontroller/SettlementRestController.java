package com.example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Settlement;
import com.example.service.SettelmentService;


@RestController
public class SettlementRestController {

	@Autowired
	private SettelmentService settlementService;

	@PostMapping("/create")
	public Settlement create(@RequestBody Settlement settlement) {
		return settlementService.createSettelment(settlement);
	}

	@GetMapping("/{ClaimId}")
	public Settlement getByClaimId(@PathVariable Long ClaimId) {
		return settlementService.getSettelmentByclaimId(ClaimId);

	}

	@GetMapping("/getAll")
	public List<Settlement> getAll() {
		return settlementService.getAllSettlement();

	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		settlementService.deletSettelment(id);
	}
	
	

}
