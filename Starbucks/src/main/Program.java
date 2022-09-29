package main;

public class Program {

	public static void main(String[] args) {
		// TODO make an app that calculates the cost of a coffee based on ingredients
		//Drink myDrink = new Drink(); // 1.50 coffee small
		//Drink myOtherDrink = new Drink(1.0, "large", "latte", 2.0); // 2.0 latte large
		
		// System.out.println("My Drink costs: " + myDrink.getCost());
		// System.out.println(myOtherDrink.getDescription());
		
		Coffee myCoffee = new Coffee();
		System.out.println(myCoffee.getDescription());
		
		System.out.println("\nCustomer adds whip cream for .25\n");
		
		//myCoffee.addIngredient("Whip Cream", 0.25);
		//myCoffee.addIngredient("Coffee Dust", 0.5);
		//myCoffee.addIngredient("Hazlenut Cream", 0.25);
		System.out.println(myCoffee.getDescription());
	}

}
