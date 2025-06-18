package com.example.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String mobileNo;
	private String address;
	

	@OneToMany(mappedBy = "userId")
	private List<Policy> policyList;
	@OneToMany(mappedBy = "userId")
	private List<PolicyPremium> policypremiumList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Policy> getPolicyList() {
		return policyList;
	}

	public void setPolicyList(List<Policy> policyList) {
		this.policyList = policyList;
	}

	public List<PolicyPremium> getPolicypremiumList() {
		return policypremiumList;
	}

	public void setPolicypremiumList(List<PolicyPremium> policypremiumList) {
		this.policypremiumList = policypremiumList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", mobileNo=" + mobileNo + ", address=" + address + ", policyList=" + policyList
				+ ", policypremiumList=" + policypremiumList + "]";
	}
	
	


}
