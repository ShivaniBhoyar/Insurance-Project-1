package com.example.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.PolicySchedule;
import com.example.service.PolicyScheduleService;

@RestController
@RequestMapping("/PolicySchedule") // its indicate that, this API request is a PolicyScheduleController
public class PolicyScheduleRestController {

	@Autowired
	private PolicyScheduleService policyScheduleService;

	@PostMapping("/savePolicy")
	public PolicySchedule savePolicy(@RequestBody PolicySchedule policySchedule) {
		PolicySchedule policyResponse = policyScheduleService.savePolicy(policySchedule);
		return policyResponse;
	}

}
