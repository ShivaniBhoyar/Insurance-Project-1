package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "driverInfo")
public class Driver {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String phoneNo;
	private  String  numberlicenseId;
	private String  licenseType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getNumberlicenseId() {
		return numberlicenseId;
	}
	public void setNumberlicenseId(String numberlicenseId) {
		this.numberlicenseId = numberlicenseId;
	}
	public String getLicenseType() {
		return licenseType;
	}
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", numberlicenseId=" + numberlicenseId
				+ ", licenseType=" + licenseType + "]";
	}
	
	

}
