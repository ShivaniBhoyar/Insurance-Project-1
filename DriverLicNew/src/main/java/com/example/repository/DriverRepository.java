package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer>{
	

}
