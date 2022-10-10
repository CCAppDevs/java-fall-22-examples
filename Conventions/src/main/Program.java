package main;

public class Program {

	public static void main(String[] args) {
		int myNumIsGreat; // lower case first letter denotes data, camel case
		
		boolean bIsRunning; // hungarian notation (first letter denotes data type)
		bIsRunning = false;
		
		int tax_calculation_multiplier; // don't be afraid to use long names
		
		Person joe = new Person();
		joe.name = "Joe";
		
		Person jane = new Person();
		jane.name = "Jane";
		
		doStuff(joe);
		doStuff(jane);
		
		Person timTheBreaker; // declare the variable
		
		if (bIsRunning) {
			timTheBreaker = new Person();
			timTheBreaker.name = "Tim The Breaker";
		} else {
			timTheBreaker = new Person();
			timTheBreaker.name = "Tim The Enchanter";
		}

		doStuff(timTheBreaker);
		
		System.out.println("5 + 12 = " + add(5,12));
		System.out.println("6 + 12 = " + add(6,12));
		System.out.println("-5 + 12 = " + add(-5,12));
	}
	
	public static void doStuff(Person person) {
		// myNumIsGreat = 10; - no longer in scope
		System.out.println(person.name);
	}
	
	public static int add(int a, int b) {
		return a + b;
	}

}
