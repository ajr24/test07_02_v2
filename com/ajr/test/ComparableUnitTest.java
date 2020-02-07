package com.ajr.test;

import org.junit.Assert;
import org.junit.Test;

import com.ajr.ComparableTest;

public class ComparableUnitTest {

	ComparableTest test = new ComparableTest();
	
	@Test
	public void testSquare(){
		int input = 2;
		double sqrt = Math.pow(input,2);
		double squareExpected = test.square(input);
		System.out.println("sqrt"+ sqrt);
		System.out.println("sqrtExpected"+ squareExpected);
		Assert.assertEquals(String.valueOf(sqrt), String.valueOf(squareExpected)); 
	}
}
