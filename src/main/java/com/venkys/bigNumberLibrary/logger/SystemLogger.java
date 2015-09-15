package com.venkys.bigNumberLibrary.logger;

import com.venkys.bigNumberLibrary.logger.Logger;
import com.venkys.bigNumberLibrary.logger.LoggerLevels;

/**
 * Concrete logger implementation for console
 * @author Venkatesh
 */
public class SystemLogger implements Logger{

	static final String COLON = ":";
	static Logger logger = null;
	
	private SystemLogger(){
	}
	
	public static Logger getSystemLogger(){
		if(null == logger){
			logger = new SystemLogger();
			logger.log(LoggerLevels.INFO, "SystemLogger initiated");
		}
		return logger;
	}
	
	@Override
	public void log(LoggerLevels level, String message) {
		System.out.println(level +COLON+ message);
	}

	public static void main(String[] args) {
		Logger systemLogger = new SystemLogger();
		systemLogger.log(LoggerLevels.ERROR, "aaa");
	}
	
}
