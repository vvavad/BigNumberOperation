package com.venkys.bigNumberLibrary.impl;

import java.util.Collections;
import java.util.Stack;
import com.venkys.bigNumberLibrary.AbstractAddition;
import com.venkys.bigNumberLibrary.Operation;
import com.venkys.bigNumberLibrary.exception.NullArgumentException;
import com.venkys.bigNumberLibrary.exception.NumberLibraryException;
import com.venkys.bigNumberLibrary.logger.Logger;
import com.venkys.bigNumberLibrary.logger.LoggerLevels;


/**
 * Concrete Multiplication implementation of operation interface
 * @author Venkatesh
 */
public class Multiplication extends AbstractAddition implements Operation {
	
	public Multiplication(){
	}
	
	public Multiplication(Logger LOGGER){
		super(LOGGER);
	}

	/**
	 * Concrete implementation of multiplication 
	 */
	@Override
	@SuppressWarnings("unchecked")
	public String compute(String operand1, String operand2) throws NumberLibraryException{
		LOGGER.log(LoggerLevels.INFO, "Multiplication Operation ");
		LOGGER.log(LoggerLevels.DEBUG, "Multiplication : "+operand1 +" * "+operand2);
		if(null == operand1 || null == operand2){
			throw new NullArgumentException();
		}
		Stack<Integer> stack1 = stringToStack(operand1);
		Stack<Integer> stack2 = stringToStack(operand2);
		
		Stack<Integer> outputStack = new Stack<Integer>();
		Stack<Integer> intermediateStack1 = new Stack<Integer>();
		Stack<Integer> intermediateStack2 = new Stack<Integer>();
		String intermediateResult = "";
		int carry = 0;
		int tensPlaceCounter = 0;

		while(!stack2.isEmpty()){
			int multiplier2 = stack2.pop();
			for(int i = 0; i< tensPlaceCounter; i++){
				intermediateStack1.push(0);
			}
			tensPlaceCounter++;
			Stack<Integer> stack1Clone = (Stack<Integer>)stack1.clone();
			while(!stack1Clone.isEmpty()){
				int multiplier1 = stack1Clone.pop();
				int result = multiplier1 * multiplier2 + carry;
				intermediateStack1.push(result%10);
				carry = result/10;
			}
			if(carry > 0){
				intermediateStack1.push(carry);
			}
			carry = 0;
			Collections.reverse(intermediateStack1);
			computeAddition(outputStack, intermediateStack1, intermediateStack2);
			intermediateStack1.clear();
			intermediateStack2.clear();
			intermediateResult = stackToString(outputStack);
			intermediateStack2 = stringToStack(intermediateResult);
		}
		return intermediateResult;
	}
	
	public static void main(String[] args) throws Exception{
		Operation o = new Multiplication();
		System.out.println(o.compute("12345", "6789"));
		
		
	/*
		Stack<Integer> stack1 = stringToStack("1111");
		Stack<Integer> stack2 = stringToStack("2222");
		int carry = 0;

		Stack<Integer> tempStack1 = (Stack<Integer>)stack1.clone();
		while(!tempStack1.isEmpty()){
			System.out.println(tempStack1.pop());
		}
		System.out.println(tempStack1.size());
		System.out.println(stack1.size());*/
		
		
		/*int tensPlaceCounter = 2;
		String str = "";
		for(int i = 0; i< tensPlaceCounter; i++){
			str+=0;
		}	
		System.out.println("str : "+str);
		*/
		
		/*Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(1);
		
		while(!queue.isEmpty()){
			System.out.println(queue.poll());
		}*/
		
		/*Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(1);
		//while(!stack.isEmpty()){
		//	System.out.println(stack.pop());
		//}
		Collections.reverse(stack);
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}*/

		
		
		
	}
}
