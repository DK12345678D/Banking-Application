package com.app.account.service.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.account.service.model.dto.AccountDto;
import com.app.account.service.model.dto.AccountStatusUpdate;
import com.app.account.service.model.dto.external.TransactionResponse;
import com.app.account.service.model.dto.response.Response;
import com.app.account.service.service.AccountService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/accounts")
public class AccountController {

	private final AccountService accountService;

	
	@PostMapping
	public ResponseEntity<Response> createAccount(@RequestBody AccountDto accountDto) {
		return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
	}

	
	@PatchMapping
	public ResponseEntity<Response> updateAccountStatus(@RequestParam String accountNumber,
			@RequestBody AccountStatusUpdate accountStatusUpdate) {
		return ResponseEntity.ok(accountService.updateStatus(accountNumber, accountStatusUpdate));
	}

	
	@GetMapping
	public ResponseEntity<AccountDto> readByAccountNumber(@RequestParam String accountNumber) {
		return ResponseEntity.ok(accountService.readAccountByAccountNumber(accountNumber));
	}

	
	@PutMapping
	public ResponseEntity<Response> updateAccount(@RequestParam String accountNumber,
			@RequestBody AccountDto accountDto) {
		return ResponseEntity.ok(accountService.updateAccount(accountNumber, accountDto));
	}

	
	@GetMapping("/balance")
	public ResponseEntity<String> accountBalance(@RequestParam String accountNumber) {
		return ResponseEntity.ok(accountService.getBalance(accountNumber));
	}

	
	@GetMapping("/{accountId}/transactions")
	public ResponseEntity<List<TransactionResponse>> getTransactionsFromAccountId(@PathVariable String accountId) {
		return ResponseEntity.ok(accountService.getTransactionsFromAccountId(accountId));
	}

	
	@PutMapping("/closure")
	public ResponseEntity<Response> closeAccount(@RequestParam String accountNumber) {
		return ResponseEntity.ok(accountService.closeAccount(accountNumber));
	}

	
	@GetMapping("/{userId}")
	public ResponseEntity<AccountDto> readAccountByUserId(@PathVariable Long userId) {
		return ResponseEntity.ok(accountService.readAccountByUserId(userId));

	}
}
