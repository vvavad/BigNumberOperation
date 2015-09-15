package com.venkys.bigNumberLibrary.impl;

import com.venkys.bigNumberLibrary.exception.NumberLibraryException;
import com.venkys.bigNumberLibrary.logger.Logger;
import com.venkys.bigNumberLibrary.AbstractOperation;
import com.venkys.bigNumberLibrary.Operation;

/**
 * 
 * Concatenation operation
 * sample implementation to demonstrate the extensibility of the design
 * @author Venkatesh
 */
public class Concatenation extends AbstractOperation implements Operation{

	public Concatenation(){
	}
	
	public Concatenation(Logger LOGGER){
		super(LOGGER);
	}
	
	/**
	 * concrete implementation of concatenation 
	 */
	@Override
	public String compute(String str1, String str2) throws NumberLibraryException {
		return str1 + str2;
	}
}
