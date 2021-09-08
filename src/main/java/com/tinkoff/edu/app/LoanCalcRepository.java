package com.tinkoff.edu.app;

public class LoanCalcRepository {
    private int requestId = 0;

    public LoanCalcRepository (int requestId){
        this.requestId = requestId;
    }

    public LoanCalcRepository(){

    }


    /*
     * TODO persists request
     *  @return Request Id
     */
//    @Override
    public int save(LoanRequest request) {
        return ++requestId;
    }
}
