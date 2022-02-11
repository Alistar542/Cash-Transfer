package com.example.restservice.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.models.AccountModel;
import com.example.restservice.models.TransactionModel;
import com.example.restservice.service.UserService;



@RestController
public class MainController {


	@Autowired
	UserService userService;
	
	@PostMapping("/transfer")
	public void transfer(@RequestBody TransactionModel transactionModel) {
		userService.saveTransaction(transactionModel);
	}
	
	@PostMapping("/saveAccount")
	public void saveAccount(@RequestBody AccountModel accountModel) {
		userService.saveAccount(accountModel);
	}
	
	@PostMapping("/getAllTransactionsOrderedByDate")
	public Collection<TransactionModel> getAllTransactionsOrderedByDate(@RequestBody TransactionModel transactionModel) {
		return userService.getAllTransactionsByDate(transactionModel);
	}
	
	@PostMapping("/getAllTransactionsInADate")
	public Collection<TransactionModel> getAllTransactionsInADate(@RequestBody TransactionModel transactionModel) {
		return userService.getAllTransactionsInDate(transactionModel);
	}
	
	@PostMapping("/findBalance")
	public double findBalance(@RequestBody AccountModel accountModel) {
		return userService.getBalance(accountModel);
	}
}
