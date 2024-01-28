package com.sipis.flyfinds.expetion;


public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}
