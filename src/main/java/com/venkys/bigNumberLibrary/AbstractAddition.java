package com.venkys.bigNumberLibrary;

import java.util.Stack;
import com.venkys.bigNumberLibrary.exception.InvalidArgumentException;
import com.venkys.bigNumberLibrary.logger.Logger;
import com.venkys.bigNumberLibrary.logger.LoggerLevels;


/**
 * Abstract addition class
 * Holds all generic/common methods which will be used in addition and multiplication implementation
 * @author Venkatesh
 */
public class AbstractAddition extends AbstractOperation {

	protected AbstractAddition(){
	}
	
	protected AbstractAddition(Logger LOGGER){
		super(LOGGER);
	}
	
	/**
	 * Converts string to a stack
	 * @param str
	 * @return stack of given string
	 * @throws InvalidArgumentException
	 */
	public final Stack<Integer> stringToStack(String str) throws InvalidArgumentException {
		LOGGER.log(LoggerLevels.INFO, "converting string to Stack: "+str);
		Stack<Integer> stack = new Stack<Integer>();
		char[] charArray = str.toCharArray(); 
		for(char ch : charArray){
			if(Character.isDigit(ch)){
				stack.push(Character.getNumericValue(ch));
			}else{
				LOGGER.log(LoggerLevels.ERROR, "Non numeric character: "+ch+" found in input String: "+str);
				throw new InvalidArgumentException("Non numeric character: "+ch+" found in input String: "+str);
			}
		}
		return stack;
	}

	/** 
	 * Converts given stack to a string
	 * @param outputStack
	 * @return String representation of the stack
	 */
	public final String stackToString(Stack<Integer> outputStack) {
		LOGGER.log(LoggerLevels.INFO, "converting Stack to string: "+outputStack);
		StringBuilder sb = new StringBuilder();
		while(!outputStack.isEmpty()){
			sb.append(outputStack.pop());
		}
		return sb.toString();
	}
	
	/**
	 * Computes addition of operand1Stack1 and operand1Stack2 and stored in output stack
	 * @param outputStack
	 * @param operand1Stack
	 * @param operand2Stack
	 */
	public final void computeAddition(Stack<Integer> outputStack, Stack<Integer> operand1Stack, Stack<Integer> operand2Stack){
		LOGGER.log(LoggerLevels.INFO, "Adding stacks");
		int carry = 0;
		while(!operand1Stack.isEmpty() || !operand2Stack.isEmpty()){
			int val1 = 0; int val2 = 0;
			if(!operand1Stack.isEmpty()){
				val1 = operand1Stack.pop();
			}
			if(!operand2Stack.isEmpty()){
				val2 = operand2Stack.pop();
			}
			int sum = val1 + val2 + carry;
			outputStack.push(sum%10);
			carry = sum/10;
		}
		if(carry > 0){
			outputStack.push(carry);
		}
	}
}
