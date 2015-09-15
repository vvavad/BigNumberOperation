package com.venkys.bigNumberLibrary;

import com.venkys.bigNumberLibrary.logger.Logger;
import com.venkys.bigNumberLibrary.logger.SystemLogger;

/**
 * Abstract operation class. 
 * Holds logger instance and default logger instantiation if logger is not specified
 * @author Venkatesh
 */
public class AbstractOperation{

	protected Logger LOGGER;

	protected AbstractOperation(){
		this.LOGGER = SystemLogger.getSystemLogger();
	}
	
	protected AbstractOperation(Logger LOGGER){
		this.LOGGER = LOGGER;
	}
}