package com.venkys.bigNumberLibrary.exception;
/**
 * Invalid argument exception class
 * @author Venkatesh
 */
public class InvalidArgumentException extends NumberLibraryException {

	private static final long serialVersionUID = 1L;

	public InvalidArgumentException(String message){
		super(message);
	}
}
