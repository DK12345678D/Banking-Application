package com.app.transactions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.transactions.model.entity.Transaction;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    
    List<Transaction> findTransactionByAccountId(String accountId);

  
    List<Transaction> findTransactionByReferenceId(String referenceId);
}
