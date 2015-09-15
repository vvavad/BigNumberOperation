package com.venkys.bigNumberLibrary;

import com.venkys.bigNumberLibrary.exception.NoSuchOperationException;
import com.venkys.bigNumberLibrary.exception.NumberLibraryException;
import com.venkys.bigNumberLibrary.impl.Addition;
import com.venkys.bigNumberLibrary.impl.Concatenation;
import com.venkys.bigNumberLibrary.impl.Multiplication;
import com.venkys.bigNumberLibrary.logger.Logger;

/**
 * Operation factory. 
 * @author Venkatesh
 */
public class OperationFactory{

	public static final String ADD="add", MULTIPLY="multiply", CONCAT="concat";
	
	/**
	 * @param operationName
	 * @return concrete operation implementation for specified operationName
	 * @throws Exception
	 */
	public static Operation getOperation(String operationName)throws Exception{
		return getOperation(operationName, null);
	}
	
	/**
	 * @param operationName
	 * @param logger
	 * @return concrete operation implementation for specified operationName
	 * @throws NumberLibraryException
	 */
	public static Operation getOperation(String operationName, Logger logger) throws NumberLibraryException{
		Operation operation;
		if(ADD.equals(operationName)){
			operation = null == logger ? new Addition() : new Addition(logger);
		}else if(MULTIPLY.equals(operationName)){
			operation = null == logger ? new Multiplication() : new Multiplication(logger);
		}
		/** Sample implementation to demonstrate adding a new operator to the library */
		else if(CONCAT.equals(operationName)){
			operation = null == logger ? new Concatenation() : new Concatenation(logger);
		}else{
			throw new NoSuchOperationException(operationName);
		}
		return operation;
	}
}
