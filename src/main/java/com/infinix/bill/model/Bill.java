package com.infinix.bill.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Bill {

	@Id
	@GeneratedValue
	private int id;
	
	private int Billnumber;
	private String Billedto;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date billeDate = new Date();
	private int BillPrice;
	private float tax;
	private int TotalPrice;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dueDate = new Date();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBillnumber() {
		return Billnumber;
	}
	public void setBillnumber(int billnumber) {
		Billnumber = billnumber;
	}
	public String getBilledto() {
		return Billedto;
	}
	public void setBilledto(String billedto) {
		Billedto = billedto;
	}
	public Date getBilleDate() {
		return billeDate;
	}
	public void setBilleDate(Date billeDate) {
		this.billeDate = billeDate;
	}
	public int getBillPrice() {
		return BillPrice;
	}
	public void setBillPrice(int billPrice) {
		BillPrice = billPrice;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public int getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		TotalPrice = totalPrice;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	
}
