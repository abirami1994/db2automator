package com.p3solutions.db2lookExecutor.exception_handler;


import java.util.logging.Logger;

public class AnalyzerException extends Exception {

	private static final long serialVersionUID = 0;


	public AnalyzerException() {

	}

	public AnalyzerException(final String errorMessage) {
		super(errorMessage);
	}

	public static void throwIfFalse(boolean expression, final String message) throws AnalyzerException {
		if (!expression) {
			throw new AnalyzerException(message);
		}
	}

	public static void throwIfTrue(boolean expression, final String message) throws AnalyzerException {
		if (expression) {
			throw new AnalyzerException(message);
		}
	}
}
