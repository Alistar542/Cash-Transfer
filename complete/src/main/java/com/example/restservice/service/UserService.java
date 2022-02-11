package com.example.restservice.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.Converter.AccountConverter;
import com.example.restservice.Converter.TransactionConverter;
import com.example.restservice.entity.Account;
import com.example.restservice.entity.Transaction;
import com.example.restservice.models.AccountModel;
import com.example.restservice.models.TransactionModel;
import com.example.restservice.repository.AccountRepository;
import com.example.restservice.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AccountRepository accountRepository;
	
	public void saveTransaction(TransactionModel transactionModel) {
		Optional<Account> receivedOptional = accountRepository.findById((int) transactionModel.getReceiveAccountNumber());
		if(receivedOptional.isPresent()) {
			Account recAccount = new Account(receivedOptional.get());
			Optional<Account> sendOptional = accountRepository.findById((int) transactionModel.getSendAccountNumber());
			if(sendOptional.isPresent()) {
				Account sendAccount = new Account(sendOptional.get());
				if(sendAccount.getAmount() > transactionModel.getAmount()) {
					double sentAmount = sendAccount.getAmount() - transactionModel.getAmount();
					double recAmount = recAccount.getAmount() + transactionModel.getAmount();
					recAccount.setAmount(recAmount);
					sendAccount.setAmount(sentAmount);
					
					accountRepository.save(sendAccount);
					accountRepository.save(recAccount);
					
					Transaction transaction = TransactionConverter.mapToTransaction(transactionModel);
					userRepository.save(transaction);
				}
			}
			
		}
		
	}
	
	public Collection<TransactionModel> getAllTransactionsByDate(TransactionModel transactionModel) {
		Iterable<Transaction> allTransactions = userRepository.findAllByOrderByDateDesc();
		Collection<TransactionModel> transactionModels = new ArrayList<>();
		if(allTransactions !=null) {
			allTransactions.forEach( t -> transactionModels.add(TransactionConverter.mapToTransactionModel(t)));
			return transactionModels;
		}
		return null;
	}
	
	public Collection<TransactionModel> getAllTransactionsInDate(TransactionModel transactionModel) {
		Iterable<Transaction> allTransactions = userRepository.findAll();
		List<Transaction> transactions = new ArrayList<>();
		if(allTransactions != null) {
			allTransactions.forEach(transactions::add);
			SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
			Collection<Transaction> transInDate = transactions.stream().filter(k -> 
			sdformat.format(k.getDate()).compareTo(sdformat.format(transactionModel.getUserDate())) == 0).collect(Collectors.toList());
			Collection<TransactionModel> transactionModels = new ArrayList<>();
			if(transInDate !=null) {
				transInDate.forEach( t -> transactionModels.add(TransactionConverter.mapToTransactionModel(t)));
				return transactionModels;
			}
		}
		return null;
	}
	
	public void saveAccount(AccountModel accountModel) {
		Account account = AccountConverter.mapToAccount(accountModel);
		accountRepository.save(account);
	}
	
	public double getBalance(AccountModel accountModel) {
		Optional<Account> account = accountRepository.findById(accountModel.getAccountNumber());
		if(account.isPresent()) {
			return account.get().getAmount();
		}
		return 0;
	}
	
	
	
}
