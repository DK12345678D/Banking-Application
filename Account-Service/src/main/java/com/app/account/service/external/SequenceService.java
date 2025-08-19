package com.app.account.service.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.account.service.model.dto.external.SequenceDto;

@FeignClient(name = "sequence-generator")
public interface SequenceService {

	
	@PostMapping("/sequence")
	SequenceDto generateAccountNumber();
}
