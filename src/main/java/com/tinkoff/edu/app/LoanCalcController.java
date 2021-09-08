package com.tinkoff.edu.app;


public class LoanCalcController {
    private LoanCalcService loanCalcService;

    public LoanCalcController(LoanCalcService loanCalcService) {
        this.loanCalcService = loanCalcService;
    }


    public LoanResponse createRequest(LoanRequest request) {

        LoanResponse loanResponse = loanCalcService.createRequest(request);

        return loanResponse;
    }
}
