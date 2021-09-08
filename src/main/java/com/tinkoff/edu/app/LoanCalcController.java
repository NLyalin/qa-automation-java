package com.tinkoff.edu.app;



public class LoanCalcController {
    /*
    Validates and logs requests
    */
    public LoanResponse createRequest (LoanRequest request) {

        LoanCalcService loanCalcService = new LoanCalcService();
        LoanResponse loanResponse = loanCalcService.createRequest(request);

        return loanResponse;
    }
}
