package com.tinkoff.edu.app;

public class LoanCalcRepository {
    public static int requestId;

    /*
     * TODO persists request
     *  @return Request Id
     */
    public static int save() {
        return ++requestId;
    }
}
