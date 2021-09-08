package com.tinkoff.edu.app;

public class LoanResponse {
    private int requestId;
    private ResponseType responseType;

    public LoanResponse(int requestId, ResponseType responseType){
        this.requestId = requestId;
        this.responseType = responseType;
    }

    public int getRequestId() {
        return requestId;
    }

    public ResponseType getResponseType() {
        return responseType;
    }
}
