package com.tinkoff.edu.test;

import com.tinkoff.edu.app.LoanCalcController;
import com.tinkoff.edu.app.LoanRequest;
import com.tinkoff.edu.app.LoanResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoanCalcControllerTest {


    @Test
    public void createRequestTest() {
        LoanRequest loanRequest = new LoanRequest(12,2000);

        LoanCalcController loanCalcController = new LoanCalcController();
        LoanResponse loanResponse = loanCalcController.createRequest(loanRequest);

        System.out.println(loanResponse.getRequestId());
        assertEquals(1,loanResponse.getRequestId());

    }
}
