package com.app.account.service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.account.service.model.AccountType;
import com.app.account.service.model.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

	
	Optional<Account> findAccountByUserIdAndAccountType(Long userId, AccountType accountType);

	
	Optional<Account> findAccountByAccountNumber(String accountNumber);

	
	Optional<Account> findAccountByUserId(Long userId);
}
