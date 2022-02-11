package com.example.restservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Account {

	@Id
	@Column(name="account_number")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountNumber;
	@Column
	private String accountName;
	@Column
	private double amount;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public Account(){
		
	}
	
	public Account(Account account) {
		this.amount = account.amount;
		this.accountNumber = account.getAccountNumber();
		this.accountName = account.getAccountName();
	}
	
	public Account update(Account account,double amount) {
		this.amount = amount;
		this.accountNumber = account.getAccountNumber();
		this.accountName = account.getAccountName();
		return this;
	}
	
}
