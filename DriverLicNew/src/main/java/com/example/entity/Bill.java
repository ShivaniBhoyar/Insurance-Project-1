package com.example.entity;
import jakarta.persistence.*;
@Entity
@Table(name="bill")
public class Bill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer bill_id;
	private String ordername; 
	private String gstnumber; 
	 private Integer quantity; 
	 private Double totalamount;
	public Integer getId() {
		return bill_id;
	}
	public void setId(Integer bill_id) {
		this.bill_id = bill_id;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getGstnumber() {
		return gstnumber;
	}
	public void setGstnumber(String gstnumber) {
		this.gstnumber = gstnumber;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(Double totalamount) {
		this.totalamount = totalamount;
	}
	@Override
	public String toString() {
		return "Bill [bill_id=" + bill_id + ", ordername=" + ordername + ", gstnumber=" + gstnumber + ", quantity=" + quantity
				+ ", totalamount=" + totalamount + "]";
	}
	
}
	