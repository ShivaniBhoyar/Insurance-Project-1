package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "policy")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Integer policyid;
	private String policyname;
	private Integer policyno;
	private String policystatus;
	private Integer userId;

	public Integer getPolicyid() {
		return policyid;
	}

	public void setPolicyid(Integer policyid) {
		this.policyid = policyid;
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

	@Override
	public String toString() {
		return "Policy [policyid=" + policyid + ", policyname=" + policyname + ", policyno=" + policyno
				+ ", policystatus=" + policystatus + ", userId=" + userId + "]";
	}

}
