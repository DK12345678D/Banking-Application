package com.app.account.service.external;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.account.service.configuration.FeignConfiguration;
import com.app.account.service.model.dto.external.TransactionResponse;

@FeignClient(name = "transaction-service", configuration = FeignConfiguration.class)
public interface TransactionService {

	/**
	 * Retrieves a list of transactions from the specified account ID.
	 *
	 * @param accountId the ID of the account
	 * @return a list of transaction responses
	 */
	@GetMapping("/transactions")
	List<TransactionResponse> getTransactionsFromAccountId(@RequestParam String accountId);
}
