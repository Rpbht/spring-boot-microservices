package com.cignex.springaccounts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cignex.springaccounts.model.Account;
import com.cignex.springaccounts.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	
	public Account findAccountByNumber(Long number){
		return accountRepository.findAccountByNumber(number);
		
	}
	
	public List<Account> getAllAccounts(){
		return accountRepository.findAll();
	}
	
}
