package com.digital.crud.saladereuniao.saladereuniao.exception;

import  java.util.Date;

public class ErrorDetais {

    private Date timestamp;
    private String message;
    private  String details;

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }



    public ErrorDetais(Date timestamp, String message, String details) {
       super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
