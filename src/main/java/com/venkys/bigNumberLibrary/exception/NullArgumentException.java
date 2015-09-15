package com.venkys.bigNumberLibrary.exception;

/**
 * Null argument exception class
 * @author Venkatesh
 */
public class NullArgumentException extends NumberLibraryException {

	private static final long serialVersionUID = 1L;

	static final String message = "Argument is null.";
	
	public NullArgumentException(){
		super(message);
	}
}
