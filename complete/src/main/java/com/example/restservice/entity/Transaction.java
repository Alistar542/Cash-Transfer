package com.example.restservice.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Transaction {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String transactionType;
	@Column
	private long userAccountNumber;
	@Column
	private String sendAccountName;
	@Column
	private long sendAccountNumber;
	@Column
	private String receiveAccountName;
	@Column
	private long receiveAccountNumber;
	@Column
	private double amount;
	@Column
	private String status;
	
	
	  @Temporal(TemporalType.TIMESTAMP) 
	  private Date date;
	 
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public long getUserAccountNumber() {
		return userAccountNumber;
	}
	public void setUserAccountNumber(long userAccountNumber) {
		this.userAccountNumber = userAccountNumber;
	}
	public String getSendAccountName() {
		return sendAccountName;
	}
	public void setSendAccountName(String sendAccountName) {
		this.sendAccountName = sendAccountName;
	}
	public long getSendAccountNumber() {
		return sendAccountNumber;
	}
	public void setSendAccountNumber(long sendAccountNumber) {
		this.sendAccountNumber = sendAccountNumber;
	}
	public String getReceiveAccountName() {
		return receiveAccountName;
	}
	public void setReceiveAccountName(String receiveAccountName) {
		this.receiveAccountName = receiveAccountName;
	}
	public long getReceiveAccountNumber() {
		return receiveAccountNumber;
	}
	public void setReceiveAccountNumber(long receiveAccountNumber) {
		this.receiveAccountNumber = receiveAccountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	  public Date getDate() { return date; } 
	  public void setDate(Date date) {
	  this.date = date; }
	 
}
