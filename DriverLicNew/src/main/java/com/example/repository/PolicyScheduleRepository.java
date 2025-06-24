package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.PolicySchedule;

@Repository
public interface PolicyScheduleRepository extends JpaRepository<PolicySchedule, Integer>{

	

}
