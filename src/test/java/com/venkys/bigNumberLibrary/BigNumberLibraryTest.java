package com.venkys.bigNumberLibrary;

import junit.framework.Assert;
import org.junit.Test;
import com.venkys.bigNumberLibrary.BigNumberLibrary;
import com.venkys.bigNumberLibrary.NumberLibrary;

public class BigNumberLibraryTest{

	NumberLibrary numberLibrary = new BigNumberLibrary(); 
	
	@Test
	public void testAdd() throws Exception{
		Assert.assertEquals("333", numberLibrary.add("111", "222"));
		System.out.println("111+222="+ numberLibrary.add("1111", "222"));
		System.out.println("111+222="+ numberLibrary.add("111", "2222"));
		System.out.println("111+222="+ numberLibrary.add("999", "111"));
		System.out.println("111+222="+ numberLibrary.add("99999", "22"));
		System.out.println("111+222="+ numberLibrary.add("aaa", "222"));
	}
	
	@Test
	public void testMultiply() throws Exception{
		Assert.assertEquals("24642", numberLibrary.multiply("111", "222"));
	}
}
