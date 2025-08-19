package com.app.account.service.model.mapper;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.app.account.service.model.dto.AccountDto;
import com.app.account.service.model.entity.Account;

public class AccountMapper extends BaseMapper<Account, AccountDto> {

	@Override
	public Account convertToEntity(AccountDto dto, Object... args) {
		Account account = new Account();
		if (!Objects.isNull(dto)) {
			BeanUtils.copyProperties(dto, account);
		}
		return account;
	}

	@Override
	public AccountDto convertToDto(Account entity, Object... args) {

		AccountDto accountDto = new AccountDto();
		if (!Objects.isNull(entity)) {
			BeanUtils.copyProperties(entity, accountDto);
		}
		return accountDto;
	}
}
