package main;

public class Program {

	public static void main(String[] args) {
		// TODO make an app that calculates the cost of a coffee based on ingredients
		Coffee myCoffee = new Coffee(1.0, "Venti", "White Chocolate Mocha", 2.0);
		
		// lets add ingredients
		Ingredient whiteChocolate = new Ingredient("White Chocolate", 0.2, 0.5);
		Ingredient whip = new Ingredient("Whip Cream", 0.2, 0.5);
		
		myCoffee.addIngredient(whiteChocolate);
		myCoffee.addIngredient(whip);
		
		System.out.println("Starting loop.");
		
//		for (int i = 0; i < 10; i++) {
//			// do stuff every loop
//			System.out.println("Printing iteration #" + i);
//		}
		
		// while loop
//		boolean isRunning = true;
//		int counter = 0;
//		
//		while (isRunning) {
//			System.out.println("Printing while iteration #" + counter);
//			counter++;
//			
//			if (counter >= 10) {
//				isRunning = false;
//			}
//			
//			if (counter > 5) {
//				System.out.println("Exiting early");
//				isRunning = false;
//			}
//		}
		
		int[] collection = new int[99999999];
		
		// great for accessing an array when you need to know the index
		for (int i = 0; i < collection.length; i++) {
			collection[i] = i;
		}
		
		for (int element : collection) {
			System.out.println("Printing number item " + element);
		}
		
		System.out.println("Ending Loop");
		
		// Lets see what we get
		// System.out.println(myCoffee.getDescription());
	}

}
