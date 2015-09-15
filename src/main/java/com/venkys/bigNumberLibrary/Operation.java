package com.venkys.bigNumberLibrary;

import com.venkys.bigNumberLibrary.exception.NumberLibraryException;
/**
 * Interface Operation
 * @author Venkatesh
 */
public interface Operation {

	/**
	 * @param operand1
	 * @param operand2
	 * @return result depending on the concrete implementation
	 * @throws NumberLibraryException
	 */
	String compute(String operand1, String operand2) throws NumberLibraryException;
	
}
