package com.example.restservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.restservice.entity.Transaction;

public interface UserRepository extends CrudRepository<Transaction, Long>{

	public List<Transaction> findAllByOrderByDateDesc();
}
