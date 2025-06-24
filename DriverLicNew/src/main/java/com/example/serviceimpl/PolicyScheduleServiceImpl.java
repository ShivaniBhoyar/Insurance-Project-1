package com.example.serviceimpl;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.PolicySchedule;
import com.example.repository.PolicyScheduleRepository;
import com.example.service.PolicyScheduleService;

@Service
public class PolicyScheduleServiceImpl implements PolicyScheduleService {

	@Autowired
	private PolicyScheduleRepository policyScheduleRepository;

	@Override
	public PolicySchedule savePolicy(PolicySchedule policySchedule) { // contain end date
		
        if (policySchedule.getEndDate() != null) {
            Period period = Period.between(LocalDate.now(), policySchedule.getEndDate());
            String duration = period.getYears() + " years, " +
                              period.getMonths() + " months, " +
                              period.getDays() + " days";
            policySchedule.setDuration(duration);
        } else {
            policySchedule.setDuration("N/A");
        }
		return policyScheduleRepository.save(policySchedule);
	}

	@Override
	public List<PolicySchedule> getAllPolicies() {
		return policyScheduleRepository.findAll();
		
	}

	

	

}
