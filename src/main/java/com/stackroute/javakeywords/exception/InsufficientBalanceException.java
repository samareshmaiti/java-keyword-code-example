package com.stackroute.javakeywords.exception;

public class InsufficientBalanceException {

    static class LowBalanceException extends Exception {
        LowBalanceException(String s) {
            super(s);
        }
    }
}

