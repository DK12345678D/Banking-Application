package com.app.account.service.service;

import java.util.List;

import com.app.account.service.model.dto.AccountDto;
import com.app.account.service.model.dto.AccountStatusUpdate;
import com.app.account.service.model.dto.external.TransactionResponse;
import com.app.account.service.model.dto.response.Response;

public interface AccountService {

	
	Response createAccount(AccountDto accountDto);

	
	Response updateStatus(String accountNumber, AccountStatusUpdate accountUpdate);

	
	AccountDto readAccountByAccountNumber(String accountNumber);

	
	Response updateAccount(String accountNumber, AccountDto accountDto);

	
	String getBalance(String accountNumber);

	
	List<TransactionResponse> getTransactionsFromAccountId(String accountId);

	
	Response closeAccount(String accountNumber);

	
	AccountDto readAccountByUserId(Long userId);
}
