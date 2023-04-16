package com.example.hakatonsber_2023_backend.dto.response;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MessageResponse {

    private String message;

    private int statusCode;


    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
