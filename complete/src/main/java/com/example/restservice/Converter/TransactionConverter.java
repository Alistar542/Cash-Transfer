package com.example.restservice.Converter;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.restservice.entity.Transaction;
import com.example.restservice.models.TransactionModel;

public class TransactionConverter {

	public static TransactionModel mapToTransactionModel(Transaction transaction) {
		TransactionModel transactionModel = new TransactionModel();
		transactionModel.setAmount(transaction.getAmount());
		transactionModel.setId(transaction.getId());
		transactionModel.setReceiveAccountName(transaction.getReceiveAccountName());
		transactionModel.setReceiveAccountNumber(transaction.getReceiveAccountNumber());
		transactionModel.setSendAccountName(transaction.getSendAccountName());
		transactionModel.setSendAccountNumber(transaction.getSendAccountNumber());
		transactionModel.setStatus(transaction.getStatus());
		transactionModel.setTransactionType(transaction.getTransactionType());
		transactionModel.setUserAccountNumber(transaction.getUserAccountNumber());
		transactionModel.setDate(transaction.getDate().toString());
		return transactionModel;
	}
	
	public static Transaction mapToTransaction(TransactionModel transactionModel) {
		Transaction transaction = new Transaction();
		transaction.setAmount(transactionModel.getAmount());
		transaction.setId(transactionModel.getId());
		transaction.setReceiveAccountName(transactionModel.getReceiveAccountName());
		transaction.setReceiveAccountNumber(transactionModel.getReceiveAccountNumber());
		transaction.setSendAccountName(transactionModel.getSendAccountName());
		transaction.setSendAccountNumber(transactionModel.getSendAccountNumber());
		transaction.setStatus(transactionModel.getStatus());
		transaction.setTransactionType(transactionModel.getTransactionType());
		transaction.setUserAccountNumber(transactionModel.getUserAccountNumber());
		Date currDate = null;
		try {
			currDate = new SimpleDateFormat("dd-MM-yyyy").parse(transactionModel.getDate());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		transaction.setDate(currDate);
		return transaction;
	}
}
