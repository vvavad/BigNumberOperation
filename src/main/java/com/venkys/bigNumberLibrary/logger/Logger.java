package com.venkys.bigNumberLibrary.logger;

import com.venkys.bigNumberLibrary.logger.LoggerLevels;

/**
 * Logger interface. 
 * The library uses logger with this interface.  
 * @author Megha
 */
public interface Logger{
	
	void log(LoggerLevels level, String message);
	
}
