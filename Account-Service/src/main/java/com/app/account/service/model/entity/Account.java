package com.app.account.service.model.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import com.app.account.service.model.AccountStatus;
import com.app.account.service.model.AccountType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountId;

	private String accountNumber;

	@Enumerated(EnumType.STRING)
	private AccountType accountType;

	@Enumerated(EnumType.STRING)
	private AccountStatus accountStatus;

	@CreationTimestamp
	private LocalDate openingDate;

	private BigDecimal availableBalance;

	private Long userId;
}
