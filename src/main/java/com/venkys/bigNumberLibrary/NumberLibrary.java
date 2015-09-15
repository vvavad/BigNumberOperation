package com.venkys.bigNumberLibrary;

import com.venkys.bigNumberLibrary.exception.NumberLibraryException;

/**
 * Number library interface 
 * @author Venkatesh
 */
public interface NumberLibrary {
	
	/**
	 * Addition operation
	 * @param operand1
	 * @param operand2
	 * @return addition of operand1 and operand2
	 * @throws NumberLibraryException
	 */
	String add(String operand1, String operand2) throws NumberLibraryException;

	/**
	 * Multiplication operation
	 * @param operand1
	 * @param operand2
	 * @return multiplication of operand1 and operand2
	 * @throws NumberLibraryException
	 */
	String multiply(String operand1, String operand2) throws NumberLibraryException;
	
}
