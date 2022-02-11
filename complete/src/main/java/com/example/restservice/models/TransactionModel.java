package com.example.restservice.models;

public class TransactionModel {

	private long id;
	private String transactionType;
	private long userAccountNumber;
	private String sendAccountName;
	private long sendAccountNumber;
	private String receiveAccountName;
	private long receiveAccountNumber;
	private double amount;
	private String status;
	private String date;
	private String userDate;
	
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getUserDate() {
		return userDate;
	}
	public void setUserDate(String userDate) {
		this.userDate = userDate;
	}
	
	
}
