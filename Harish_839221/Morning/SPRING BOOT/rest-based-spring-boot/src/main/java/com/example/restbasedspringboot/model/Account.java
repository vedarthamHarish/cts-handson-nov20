package com.example.restbasedspringboot.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {
	private long accno;
	private double amount;
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
