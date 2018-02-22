package com.cignex.springaccounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cignex.springaccounts.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	
	 public Account findAccountByNumber(Long number);
}
