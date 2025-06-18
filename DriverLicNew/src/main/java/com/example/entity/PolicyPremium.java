package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PolicyPremium")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class PolicyPremium {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private Float amount;
	private String premiumtype;
	private Integer userId;

	

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getPremiumtype() {
		return premiumtype;
	}

	public void setPremiumtype(String premiumtype) {
		this.premiumtype = premiumtype;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "PolicyPremium [amount=" + amount + ", premiumtype=" + premiumtype
				+ ", userId=" + userId + "]";
	}

}
