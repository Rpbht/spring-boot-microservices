package com.cignex.springaccounts.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cignex.springaccounts.model.Account;
import com.cignex.springaccounts.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired
	private AccountService service;

	@RequestMapping(value="/{number}",method=RequestMethod.GET)
	public Account fromAccountByNumber(@PathVariable Long number){
		System.out.println("postttt");
		return service.findAccountByNumber(number);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Account> fromAccount(){
		System.out.println("data...");
		return service.getAllAccounts();
	}
	
}
