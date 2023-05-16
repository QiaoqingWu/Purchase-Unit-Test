/*
 * File name: YourPurchasesTest.java
 * Author: Qiaoqing Wu, 41076817
 * Course: CST8284 - OOP
 * Assignment: Lab 4b
 * Due date: 2023-02-24
 * Lab Professor: Prof. Leanne Seaward
 * Purpose: This test class tests the giveChange() method in YourPurchases.java
 * which will give a correct test result and show a green bar.
 */

package lab4;

import org.junit.Assert;
import org.junit.Test;

/**
 * A test class for YourPurchases class, in this class it will test the giveChange() method
 * in YourPurchases class. 
 */
public class YourPurchasesTest {
   
	/**
	 * Declare EPSILON to determine whether two values are "close enough" to equal
	 * */
	private static final double EPSILON = 1E-12;
   
   	/**
   	 * A test method for calculating change, which should equal to payment minus purchase.
   	 * And giveChange() in YourPurchases class will do the calculation. 
   	 * 
   	 * In the test method, we will assume that we purchased two items that valued 0.75 and 1.5.
   	 * The purchase would be total 2.25 and payment would be 2.5, then assigned 0.25 as correct change to 
   	 * a variable named "expected". And at last compare the expected result with giveChange() method. 
   	 */
   @Test 
   	public void twoPurchases() {
      YourPurchases register = new YourPurchases();
      register.recordPurchase(0.75);
      register.recordPurchase(1.50);//2.25
      register.receivePayment(2, 0, 5, 0, 0);//2.5
      double expected = 0.25;
      Assert.assertEquals(expected, register.giveChange(), EPSILON);
    }
   
// YOUR TASKS ARE STATED HERE: 
   // RUN THE CODE YOU RECEIVED AND DEMO THAT THERE IS NO ERROR in YourPurchasesTest.java 
     
}

