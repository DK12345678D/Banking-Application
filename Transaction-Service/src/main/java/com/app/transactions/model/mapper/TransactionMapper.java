package com.app.transactions.model.mapper;

import org.springframework.beans.BeanUtils;

import com.app.transactions.model.dto.TransactionDto;
import com.app.transactions.model.entity.Transaction;

import java.util.Objects;

public class TransactionMapper extends BaseMapper<Transaction, TransactionDto> {

    @Override
    public Transaction convertToEntity(TransactionDto dto, Object... args) {

        Transaction transaction = new Transaction();
        if(!Objects.isNull(dto)){
            BeanUtils.copyProperties(dto, transaction);
        }
        return transaction;
    }

    @Override
    public TransactionDto convertToDto(Transaction entity, Object... args) {

        TransactionDto transactionDto = new TransactionDto();
        if(!Objects.isNull(entity)) {
            BeanUtils.copyProperties(entity, transactionDto);
        }
        return transactionDto;    }
}
