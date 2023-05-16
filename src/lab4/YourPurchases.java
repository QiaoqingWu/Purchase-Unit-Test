/*
 * File name: YourPurchases.java
 * Author: Qiaoqing Wu, 41076817
 * Course: CST8284 - OOP
 * Assignment: Lab 4b
 * Due date: 2023-02-24
 * Lab Professor: Prof. Leanne Seaward
 * Purpose: This class creates fields for YourPurchases and has worker methods
 * for calculating changes.
 */

package lab4;

/**
   You were at Walmart near your home to make some purchases last weekend. 
   You had so much coins including nickels, dimes, etc and wanted to just use them all for your purchases. 
   A cash register sums up the sales and then computes the change due to you.
*/
public class YourPurchases
{
	/** Declare a final double value for a quarter is 0.25 */
   public static final double QUARTER_VALUE = 0.25;
   
   /** Declare a final double value for a dime is 0.1 */
   public static final double DIME_VALUE = 0.1;
   
   /** Declare a final double value for a nickel is 0.05 */
   public static final double NICKEL_VALUE = 0.05;
   
   /** Declare a final double value for a penny is 0.01 */
   public static final double PENNY_VALUE = 0.01;

   /** purchase, total value for YourPurchase */
   private double purchase;
   
   /** payment, the value that pay for the purchase */
   private double payment;

   /**
      Constructs a cash register - your purchases- with no money in it.
   */
   public YourPurchases()
   {
      purchase = 0;
      payment = 0;
   }

   
   /**
   Returns the amount of purchases.
   @return amount of purchases
	*/
	public double getPurchase()
	{
	   return purchase;
	  
	}

	
	/**
	Returns the amount of payment.
	@return amount of payments
	*/
	public double getPayment()
	{
	return payment;
	
	}

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
     
   }
   
   /**
      Enters the payment received from the customer.
      @param dollars the number of dollars in the payment
      @param quarters the number of quarters in the payment
      @param dimes the number of dimes in the payment
      @param nickels the number of nickels in the payment
      @param pennies the number of pennies in the payment
   */
   public void receivePayment(int dollars, int quarters, 
         int dimes, int nickels, int pennies)
   {
      payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
            + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
   }
   
   /**
      Computes and returns the change due. This is done with some error in the calculations
      @return the change due to the customer
   */
   public double CalculateChange()
   {
      double change = payment + purchase;
      
      return change;
   }

/**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }
}

