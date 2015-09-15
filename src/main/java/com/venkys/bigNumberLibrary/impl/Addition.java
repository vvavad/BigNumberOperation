package com.venkys.bigNumberLibrary.impl;

import java.util.Stack;
import com.venkys.bigNumberLibrary.AbstractAddition;
import com.venkys.bigNumberLibrary.Operation;
import com.venkys.bigNumberLibrary.exception.NullArgumentException;
import com.venkys.bigNumberLibrary.exception.NumberLibraryException;
import com.venkys.bigNumberLibrary.logger.Logger;
import com.venkys.bigNumberLibrary.logger.LoggerLevels;


/**
 * concrete implementation of addition. 
 * @author Venkatesh
 */
public class Addition extends AbstractAddition implements Operation {
	
	public Addition(){
	}
	
	public Addition(Logger LOGGER){
		super(LOGGER);
	}
	
	/**
	 * Concrete implementation of addition
	 */
	@Override
	public String compute(String operand1, String operand2) throws NumberLibraryException {
		LOGGER.log(LoggerLevels.INFO, "Addition Operation ");
		LOGGER.log(LoggerLevels.DEBUG, "Addition : "+operand1 +" + "+operand2);
		if(null == operand1 || null == operand2){
			throw new NullArgumentException();
		}
		Stack<Integer> outputStack = new Stack<Integer>();
		Stack<Integer> stack1 = stringToStack(operand1);
		Stack<Integer> stack2 = stringToStack(operand2);
		computeAddition(outputStack, stack1, stack2);
		return stackToString(outputStack);
	}


	
	public static void main(String[] args) throws Exception {
		Operation operation = new Addition();
		String str1 = "111", str2 = "";
		System.out.println("bnl.add("+str1+","+str2+") = "+ operation.compute(str1, str2));
	}
}
