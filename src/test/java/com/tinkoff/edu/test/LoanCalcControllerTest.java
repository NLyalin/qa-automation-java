package com.tinkoff.edu.test;

import com.tinkoff.edu.app.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoanCalcControllerTest {


    @Test
    public void createRequestTest() {
        LoanRequest loanRequest = new LoanRequest(LoanType.IP, 12,2000);

        LoanCalcController loanCalcController = new LoanCalcController(new LoanCalcService(new LoanCalcRepository()) );
        LoanResponse loanResponse = loanCalcController.createRequest(loanRequest);

        System.out.println(loanResponse.getRequestId() + " RequestID");
        assertEquals(1,loanResponse.getRequestId());

    }

    @Test
    public void createRequestTest2() {
        LoanRequest loanRequest = new LoanRequest(LoanType.IP, 12,2000);

        LoanCalcController loanCalcController = new LoanCalcController(new LoanCalcService(new LoanCalcRepository(255)) );
        LoanResponse loanResponse = loanCalcController.createRequest(loanRequest);

        System.out.println(loanResponse.getRequestId() + " RequestID");
        assertEquals(256,loanResponse.getRequestId());

    }

}
