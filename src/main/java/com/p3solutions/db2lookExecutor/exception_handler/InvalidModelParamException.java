package com.p3solutions.db2lookExecutor.exception_handler;


public class InvalidModelParamException extends Exception {

    private static final long serialVersionUID = 0;


    public InvalidModelParamException() {

    }

    public InvalidModelParamException(final String errorMessage) {
        super(errorMessage);
    }

    public static void throwIfFalse(boolean expression, final String message) throws InvalidModelParamException {
        if (!expression) {
            throw new InvalidModelParamException(message);
        }
    }

    public static void throwIfTrue(boolean expression, final String message) throws InvalidModelParamException {
        if (expression) {
            throw new InvalidModelParamException(message);
        }
    }
}


