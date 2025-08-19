package com.app.transactions.service;

import java.util.List;

import com.app.transactions.model.dto.TransactionDto;
import com.app.transactions.model.response.Response;
import com.app.transactions.model.response.TransactionRequest;

public interface TransactionService {

    
    Response addTransaction(TransactionDto transactionDto);

   
    Response internalTransaction(List<TransactionDto> transactionDtos, String transactionReference);

   
    List<TransactionRequest> getTransaction(String accountId);

   
    List<TransactionRequest> getTransactionByTransactionReference(String transactionReference);
}
