package com.venkys.bigNumberLibrary.exception;

/**
 * No such operation exception class
 * @author Venkatesh
 */
public class NoSuchOperationException extends NumberLibraryException {

	private static final long serialVersionUID = 1L;

	static final String message = "No Such Operation: ";

	public NoSuchOperationException(String operationName) {
		super(message+operationName);
	}
}
