package com.example.entity;

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
@Table(name = "policy")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Integer externalPolicyId;
	private String policyname;
	private Integer policyno;
	private String policystatus;
	private Integer userId;
	
	//@OneToOne(targetEntity = PolicySchedule.class, cascade = CascadeType.ALL) 
	private transient PolicySchedule policySchedule; 
	
	
	public Integer getExternalPolicyId() {
		return externalPolicyId;
	}

	public void setExternalPolicyId(Integer externalPolicyId) {
		this.externalPolicyId = externalPolicyId;
	}

	public String getPolicyname() {
		return policyname;
	}

	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}

	public Integer getPolicyno() {
		return policyno;
	}

	public void setPolicyno(Integer policyno) {
		this.policyno = policyno;
	}

	public String getPolicystatus() {
		return policystatus;
	}

	public void setPolicystatus(String policystatus) {
		this.policystatus = policystatus;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public PolicySchedule getPolicySchedule() {
		return policySchedule;
	}
	public void setPolicySchedule(PolicySchedule policySchedule) {
		this.policySchedule = policySchedule;
	}

	@Override
	public String toString() {
		return "Policy [id=" + id + ", externalPolicyId=" + externalPolicyId + ", policyname=" + policyname
				+ ", policyno=" + policyno + ", policystatus=" + policystatus + ", userId=" + userId
				+ ", policySchedule=" + policySchedule + "]";
	}

	

}
