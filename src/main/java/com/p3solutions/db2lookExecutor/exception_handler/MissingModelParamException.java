package com.p3solutions.db2lookExecutor.exception_handler;


public class MissingModelParamException extends Exception {

    private static final long serialVersionUID = 0;


    public MissingModelParamException() {

    }

    public MissingModelParamException(final String errorMessage) {
        super(errorMessage);
    }

    public static void throwIfFalse(boolean expression, final String message) throws MissingModelParamException {
        if (!expression) {
            throw new MissingModelParamException(message);
        }
    }

    public static void throwIfTrue(boolean expression, final String message) throws MissingModelParamException {
        if (expression) {
            throw new MissingModelParamException(message);
        }
    }
}

