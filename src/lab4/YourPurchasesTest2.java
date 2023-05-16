/*
 * File name: YourPurchasesTest2.java
 * Author: Qiaoqing Wu, 41076817
 * Course: CST8284 - OOP
 * Assignment: Lab 4b
 * Due date: 2023-02-24
 * Lab Professor: Prof. Leanne Seaward
 * Purpose: This test class tests the CalculateChange() method in YourPurchases.java
 * which will give an error and show a red bar. And it will test systematically to find where
 * the actual error is.
 * 
 */

package lab4;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

/**
 * A test class for YourPurchases class, in this class it will test the CalculateChange() method
 * in YourPurchases class. The test for CalculateChange() would fail so it will do tests
 *  systematically to find where the error is.
 *  @author Qiaoqing Wu
 */
public class YourPurchasesTest2 {
		
	/**
	 * Declare EPSILON to determine whether two values are "close enough" to equal
	 * */
	private static final double EPSILON = 1E-12;
	
	//THIS TEST WOULD FAIL. 
	// TODO: RUN THIS AND SHOW THE FAILED TEST 
	/**
   	 * A test method for calculating change, which should equal to payment minus purchase.
   	 * And CalculateChange() in YourPurchases class will do the calculation. And the test would 
   	 * fail.
   	 */
	//@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50;
	    Assert.assertEquals(expected, changeResult, EPSILON);
		assertTrue(true);
	}
	
	 // YOUR TASKS ARE STATED HERE: 
	   // RUN THE TEST CASE IN YourPurchasesTest2.java, TO SHOW AN EXAMPLE OF AN UNSUCCESSFUL EXECUTION
	   // IMPROVE THIS CODE BY SYSTEMATICALLY ADDING MORE TEST CASES (NOT ALREADY STATED IN THIS CODE)
	   // TO LOCATE THE METHOD THAT IS CAUSING THE TEST FAILURE
	 /**
	  * To locate the method that is causing the test failure, this class will systematically add more 
	  * test cases to test those methods: recordPurchase(), receivePayment(), CalculateChange()
	  * */
	/** Test for recordPurchase(), and there would be no error in this method. */
	@Test
	public void testRecordPurchase() {
		YourPurchases p1 = new YourPurchases();
		p1.recordPurchase(1.55);
		double actualPurchase = p1.getPurchase();
		double expectedPurchase = 1.55;
		assertEquals(expectedPurchase, actualPurchase, EPSILON);
	}
	
	/** Test for receivePayment(), and there would be no error in this method. */
	@Test
	public void testReceivePayment() {
		YourPurchases p2 = new YourPurchases();
		p2.receivePayment(5,0,5,0,0);
		double actualPayment = p2.getPayment();
		double expectedPayment = 5.5;
		assertEquals(expectedPayment, actualPayment, EPSILON);
	}
	
	/**
	 * Test again for CalculateChange(), and this method would give an calculation error.
	 * The purchase is set to be 1.55, and payment is 5.5, according to the calculation that 
	 * change = payment - purchase, the change should be 3.95. But CalculateChange() give a 
	 * result 7.05, which failed this test.
	 * */
	@Test
	public void testAgainCalculateChange() {
		YourPurchases p3 = new YourPurchases();
		p3.recordPurchase(1.55);
		p3.receivePayment(5, 0, 5, 0, 0);
		double changeResult = p3.CalculateChange();
		double expectedChange = 3.95;
		assertEquals(expectedChange, changeResult, EPSILON);
	}
}