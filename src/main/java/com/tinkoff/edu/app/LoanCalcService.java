package com.tinkoff.edu.app;

public class LoanCalcService {
    /*
     * Loan calculation
     */
    public LoanResponse createRequest(LoanRequest request) {

        LoanCalcRepository calcRepository = new LoanCalcRepository();
        int requestId = calcRepository.save(request);

        LoanResponse loanResponse = new LoanResponse(requestId, ResponseType.APPROVED);
        return loanResponse;
    }

}
