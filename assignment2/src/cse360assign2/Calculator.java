/**
 * @author Yusra Hashmi
 * Class ID: 399
 * Assignment #2
 * Description: This code functions as a calculator which can manipulate user input and return arithmetic results.
 */
package cse360assign2;


/*
 * The Calculator class takes an input of numbers and can add, subtract, multiply, and divide integers.
 */

public class Calculator {

	private int total;
	private String history;
	
	/**
	 * The Calculator() constructor defines an integer to keep track of the total value
	 * and action history. 
	 * The integer and string are initialized to 0. 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0 "; // initial string value 
	}
	
	/**
	 * The getTotal() method returns the total calculated. 
	 * @return int value of the total. 
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * The add(int value) adds a value to the total value. 
	 * @param value to be added 
	 */
	public void add (int value) {
		total = total + value;
		history = history + "+ " + value + " ";
	}
	
	/**
	 * The subtract(int value) method subtracts a value from the total value.
	 * @param value to be subtracted
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + "- " + value + " ";
	}
	
	/**
	 *  The multiply(int value) method multiplies the total by the value.
	 * @param value is the integer to multiply by
	 */
	public void multiply (int value) {
		total = total*value;
		history = history + "* " + value + " ";
	}
	
	/**
	 * The divide(int value) method divides the total by the parameter value.
	 * @param value is the number to divide total by.
	 */
	public void divide (int value) {
		total = total/value;
		history = history + "/ " + value + " ";
	}
	
	/**
	 * The getHistory() method returns the history of all actions. 
	 * @return all previous actions/requests
	 */
	public String getHistory () {
		return history;
	}
}

