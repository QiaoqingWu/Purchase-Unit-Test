/*
 * File name: YourPurchases4Test.java
 * Author: Qiaoqing Wu, 41076817
 * Course: CST8284 - OOP
 * Assignment: Lab 4a
 * Due date: 2023-02-16
 * Lab Professor: Prof. Leanne Seaward
 * Purpose: This test class is going to test the ClassifyPurchases() method 
 * in YourPurchases4.java, in this test class it will use testClassifyPurchase() method and 
 * create three test cases in it.
 */

package lab4a;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for YourPurchases4 class, this test class includes one test method.
 * @author Qiaoqing Wu
 * */
public class YourPurchases4Test {
	 
    /**
     * In testClassifyPurchase() method, we will create three objects to call the recordPurchase(amount)
     * to set purchase and call classifyPurchase() to decide different return values: 3 or 2 or 1. And set three
     * expected result and use assertEquals() to compare them separately.
     * */
	@Test	
	public void testClassifyPurchase() {
    		
    		/**Create object p1, when purchase > 100, it should  return 3 */
			YourPurchases4 p1 = new YourPurchases4();
    		// add purchase amount
			p1.recordPurchase(120.3);
    		// give purchase classify
    		int actualResult1= p1.classifyPurchase();    		
    		// give an expect result
    		int expect1 = 3;    		
    		Assert.assertEquals(expect1, actualResult1);
    		
    		/**Create object p2, when 50 < purchase <= 100, it should  return 2 */
    		YourPurchases4 p2 = new YourPurchases4();
    		p2.recordPurchase(100);
    		int actualResult2 = p2.classifyPurchase();
    		int expect2 = 2;
    		Assert.assertEquals(expect2, actualResult2);
    		
    		/**Create object p3, when purchase <= 50, it should  return 1 */
    		YourPurchases4 p3 = new YourPurchases4();
    		p3.recordPurchase(39.0);
    		int actualResult3 = p3.classifyPurchase();
    		int expect3 = 1;
    		Assert.assertEquals(expect3, actualResult3);
    		
    	}
}
