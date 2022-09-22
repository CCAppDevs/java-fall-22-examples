package main;

public class Program {

	public static void main(String[] args) {
		// int number = 32; // whole numbers
		// long number = 400000000; // for storing whole large number
		
		float floatnumber = 32.5f; // floating point precision (decimal number)
		double doublenumber = 32.5; // decimal point number
		
		boolean isTrue = true; // boolean values check for truth values
		boolean isFalse = false; 
		
		char myChar = 'a'; // for storing a single character
		String myString = "Hello World"; //  holds an array of characters
		
		Person myEmployee = new Person();
		myEmployee.firstName = "Jesse";
		myEmployee.lastName	= "Harlan";
		
		System.out.println("First name: " + myEmployee.firstName);
		System.out.println("Last name: " + myEmployee.lastName);
		
		myEmployee.firstName = "Bob";
		myEmployee.SayHello();
	}

}
