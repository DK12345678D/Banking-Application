package com.app.transactions.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import com.app.transactions.model.TransactionType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionDto {

    private String accountId;

    private String transactionType;

    private BigDecimal amount;

    private String description;
}
