package com.venkys.bigNumberLibrary.test;

import org.junit.Test;
import com.venkys.bigNumberLibrary.OperationFactory;

public class OperationFactoryTest {

	@Test
	public void testAdd() throws Exception{
		System.out.println("111+222="+OperationFactory.getOperation(OperationFactory.ADD).compute("111", "222"));
	}
	
	@Test
	public void testMultiply() throws Exception{
		System.out.println("111*222="+OperationFactory.getOperation(OperationFactory.MULTIPLY).compute("111", "222"));
	}
	
}
