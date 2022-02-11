package com.example.restservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.restservice.entity.Account;

public interface AccountRepository extends CrudRepository<Account, Integer>{

}
