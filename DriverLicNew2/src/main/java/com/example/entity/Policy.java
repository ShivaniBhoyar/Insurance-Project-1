package com.example.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "policy1")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int policyId;
	private String policyName;
	private Integer policyno;
	private String policyStatus;
	private Integer userId;
	
	@OneToMany(mappedBy = "policyId")
	private List<Claim> claimList;

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public Integer getPolicyno() {
		return policyno;
	}

	public void setPolicyno(Integer policyno) {
		this.policyno = policyno;
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<Claim> getClaimList() {
		return claimList;
	}

	public void setClaimList(List<Claim> claimList) {
		this.claimList = claimList;
	}

	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyno=" + policyno
				+ ", policyStatus=" + policyStatus + ", userId=" + userId + ", claimList=" + claimList + "]";
	}
	
	
}
