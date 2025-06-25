package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="claim")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Claim {

	@Id
	private int claimId;
	private String claimType ;
	private String claimCause;
	private long claimAmount;
	private int policyId;
	
	public int getClaimId() {
		return claimId;
	}
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	public String getClaimType() {
		return claimType;
	}
	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}
	public String getClaimCause() {
		return claimCause;
	}
	public void setClaimCause(String claimCause) {
		this.claimCause = claimCause;
	}
	public long getClaimAmount() {
		return claimAmount;
	}
	public void setClaimAmount(long claimAmount) {
		this.claimAmount = claimAmount;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	@Override
	public String toString() {
		return "Claim [claimId=" + claimId + ", claimType=" + claimType + ", claimCause=" + claimCause
				+ ", claimAmount=" + claimAmount + ", policyId=" + policyId + "]";
	}
	
	
	
}
