package com.cignex.springclient.accountcontroller;

import java.util.List;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cignex.springaccounts.model.Account;
@RestController
@RequestMapping(value="/accounts")
public class AccountController {
	
//	public static final String ACCOUNTS_SERVICE = "http://localhost:2222/accounts";
	
	public static final String ACCOUNTS_SERVICE = "http://CTPLDTP111.cignexdatamatics.com:2222/accounts";
	
	@LoadBalanced
	protected RestTemplate restTemplate = new RestTemplate();
	
	
	@RequestMapping(method=RequestMethod.GET,value="/{number}")
	public  Account getByNumber(@PathVariable String number){
		System.out.println("here is number: "+number);
		Account forObject = restTemplate.getForObject(ACCOUNTS_SERVICE+"/"+number, Account.class);
		System.out.println(forObject);
		return forObject;
	}
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(method=RequestMethod.GET)
	public  List<Account> getAllAccounts(){
		List<Account> forObject = restTemplate.getForObject(ACCOUNTS_SERVICE,List.class,Account.class);
		return forObject;
	}

}
