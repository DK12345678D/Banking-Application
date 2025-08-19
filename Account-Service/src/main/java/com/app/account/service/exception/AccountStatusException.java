package com.app.account.service.exception;

public class AccountStatusException extends GlobalException {
	public AccountStatusException(String errorMessage) {
		super(errorMessage, GlobalErrorCode.BAD_REQUEST);
	}
}
