package com.app.account.service.external;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.account.service.configuration.FeignConfiguration;
import com.app.account.service.model.dto.external.TransactionResponse;

@FeignClient(name = "transaction-service", configuration = FeignConfiguration.class)
public interface TransactionService {

	
	@GetMapping("/transactions")
	List<TransactionResponse> getTransactionsFromAccountId(@RequestParam String accountId);
}
