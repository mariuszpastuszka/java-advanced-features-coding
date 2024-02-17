package com.sda.lambda.calculator;

public class WrongArgumentException extends RuntimeException {

    public WrongArgumentException(String message) {
        super(message);
    }
}
