package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer>{

	
	public List<Policy> findByUserId(Integer userId );
}
