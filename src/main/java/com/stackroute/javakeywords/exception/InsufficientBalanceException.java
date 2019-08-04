package com.stackroute.javakeywords.exception;

public class InsufficientBalanceException {
//declaring the custom exception
    static class LowBalanceException extends Exception {
        LowBalanceException(String s) {
            super(s);
        }
    }
}

