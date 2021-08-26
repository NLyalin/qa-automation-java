package com.tinkoff.edu.test;

import com.tinkoff.edu.app.LoanCalcController;
import com.tinkoff.edu.app.LoanCalcRepository;

public class LoanCalcTest  {
    public static void main(String... args) {

        System.out.println(LoanCalcRepository.requestId + " must be 0");
        System.out.println("Doing some street magic");
        int requestId = LoanCalcController.createRequest();
        System.out.println("Now requestId must be 1 and it`s:" + requestId);
    }
}
