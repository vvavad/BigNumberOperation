package com.venkys.bigNumberLibrary;

import com.venkys.bigNumberLibrary.exception.NumberLibraryException;
import com.venkys.bigNumberLibrary.logger.Logger;

/**
 * Big number library, concrete implementation of number library interface
 * @author Venkatesh
 */
public class BigNumberLibrary implements NumberLibrary {

	Logger logger;
	
	public BigNumberLibrary(){
	}
	
	public BigNumberLibrary(Logger logger){
		this.logger = logger;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.test.Pubmatic.s4.NumberLibrary#add(java.lang.String, java.lang.String)
	 */
	@Override
	public String add(String operand1, String operand2) throws NumberLibraryException {
		return OperationFactory.getOperation(OperationFactory.ADD, logger).compute(operand1, operand2);
	}

	/*
	 * (non-Javadoc)
	 * @see com.test.Pubmatic.s4.NumberLibrary#multiply(java.lang.String, java.lang.String)
	 */
	@Override
	public String multiply(String operand1, String operand2) throws NumberLibraryException {
		return OperationFactory.getOperation(OperationFactory.MULTIPLY, logger).compute(operand1, operand2);
	}

}
