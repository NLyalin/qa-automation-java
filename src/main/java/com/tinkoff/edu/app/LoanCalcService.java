package com.tinkoff.edu.app;

public class LoanCalcService  {
    private LoanCalcRepository calcRepository ;

     public LoanCalcService(LoanCalcRepository calcRepository){
         this.calcRepository = calcRepository;
     }

    /*
     * Loan calculation
     */
    public LoanResponse createRequest(LoanRequest request) {


        int requestId = calcRepository.save(request);

        LoanResponse loanResponse = new LoanResponse(requestId, ResponseType.APPROVED);
        return loanResponse;
    }

}
