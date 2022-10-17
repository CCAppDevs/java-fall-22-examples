package main;

public class Program {

	public static void main(String[] args) {
		int number = 9;
		
		// if-else
		if (number == 9) { // is the number nine, if so, do a thing
			System.out.println("The number equals 9");
		}
		
		if (number >= 5) {
			System.out.println("The number is greater than 4.");
		}
		
		if (number < 5) {
			System.out.println("The number is less than 5.");
		} else if (number == 5) {
			System.out.println("The number is exactly 5.");
		} 
		
		if (number >= 5) {
			System.out.println("The number is 5 or greater.");
		}
		
		
		// how to check if a number falls between a range (between 5-10)
		// if (number >= 5 && number <= 10) 
		// if (true && number <= 10)
		// if (true && true) 
		// if (true) do the stuff
		if (number >= 5 && number <= 10) { // if >= 5 and <= 10
			System.out.println("Number falls between 5-10");
		}
		
		// if the number is greater than 10 OR number is exactly 9
		// if (number >= 10 || number == 9)
		// if (false || number == 9)
		// if (false || true)
		// if (true)
		if (number >= 10 || number == 9) {
			System.out.println("The number is either exactly 9 or >= 10");
		}
		
		// if the number does not equal 9
		if (number != 9) {
			System.out.println("The number is not 9");
		}
		
		boolean isTrue = false;
		
		if (isTrue) {
			System.out.println("The boolean is true.");
		}
		
		if (!isTrue) {
			System.out.println("The boolean is NOT true.");
		}
		
		// switch case
	}

}
