package com.swp.BabyandMom.ExceptionHandler;

public class InvalidToken extends RuntimeException{
    public InvalidToken(String message) {
        super(message);
    }
}
