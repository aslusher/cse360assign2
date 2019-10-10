/*
 * Author: Alexis Slusher
 * Date:10/9/12
 * Class ID:
 * Assignment # 2
 * */


package cse360assign2;

/*
 * Public class AddingManchine has a total of 6 methods and two instance variable.
 * */

public class AddingMachine {

	private int total;
	private String result;

	//constructor of the AddingMachine class
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		result = "0";
	}

	//get total returns a current total and is a public method. No parameters are taken in.
	public int getTotal () {
		
		return total;
	}

	//add method has no return and is a public method. It takes in an int as a parameter.
	//adds the int parameter to the total instance variable.Adds to the result variable to use in toString method.
	public void add (int value) {
		
		total = total + value;
		result = result + " + " + value;
	}

	//subtract method has no return and is a public method. It takes in an int as a parameter
	//subtracts the int parameter to the total instance variable.Adds to the result variable to use in toString method.
	public void subtract (int value) {
		
		total = total - value; 
		result = result + " - " + value;
	}

	//toString method is a public method with no parameters and returns string result.
	public String toString () {
		return result;
	}

	//clear method has no return and is a public method.No parameters are taken in.
	public void clear() {

	}
}
