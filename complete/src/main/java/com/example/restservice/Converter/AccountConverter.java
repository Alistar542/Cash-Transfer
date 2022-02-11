package com.example.restservice.Converter;

import com.example.restservice.entity.Account;
import com.example.restservice.models.AccountModel;

public class AccountConverter {

	public static AccountModel mapToAccountModel(Account account) {
		
		return null;
	}
	
	public static Account mapToAccount(AccountModel accountModel) {
		Account account = new Account();
		account.setAccountName(accountModel.getAccountName());
		account.setAccountNumber(accountModel.getAccountNumber());
		account.setAmount(accountModel.getAmount());
		return account;
	}
}
