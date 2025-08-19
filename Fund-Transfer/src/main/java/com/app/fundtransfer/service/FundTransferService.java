package com.app.fundtransfer.service;

import java.util.List;

import com.app.fundtransfer.model.dto.FundTransferDto;
import com.app.fundtransfer.model.dto.request.FundTransferRequest;
import com.app.fundtransfer.model.dto.response.FundTransferResponse;

public interface FundTransferService {

    
    FundTransferResponse fundTransfer(FundTransferRequest fundTransferRequest);

    
    FundTransferDto getTransferDetailsFromReferenceId(String referenceId);

   
    List<FundTransferDto> getAllTransfersByAccountId(String accountId);
}
