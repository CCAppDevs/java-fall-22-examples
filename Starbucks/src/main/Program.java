package main;

public class Program {

	public static void main(String[] args) {
		// TODO make an app that calculates the cost of a coffee based on ingredients
		IcedTea myTea = new IcedTea(1.0, "Venti", "Earl Grey", 2.0);
		
		// lets add ingredients
		Ingredient whiteChocolate = new Ingredient("White Chocolate", 0.2, 0.5);
		Ingredient whip = new Ingredient("Whip Cream", 0.2, 0.5);
		
		myTea.addIngredient(whiteChocolate);
		myTea.addIngredient(whip);
		
		System.out.println(myTea.getDescription());
	}

}
