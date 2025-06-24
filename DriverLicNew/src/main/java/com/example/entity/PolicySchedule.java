package com.example.entity;

import java.time.LocalDate;
import java.time.Period;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "InsurancePolicySchedule")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class PolicySchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createdDate; // start date

	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate updatedDate; // for update the policy date

	private LocalDate endDate; // end date we have to set manually
	private String duration; // calculate duration using start date and end date

	private Integer policyId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getPolicyId() {
		return policyId;
	}
	
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	@Override
	public String toString() {
		return "PolicySchedule [id=" + id + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ ", endDate=" + endDate + ", duration=" + duration + ", policyId=" + policyId + "]";
	}
	

}