package main;

public class Drink {
	// private properties/members
	private double cost;
	private String size;
	private String name;
	private double retailPrice;
	
	// ingredients code
	private int maxIngredients = 10;
	private Ingredient[] ingredients = new Ingredient[maxIngredients];
	private int currentPos = 0;
	
	
	// basic constructor
	// main.Drink.Drink()
	public Drink() {
		super();
		this.cost = 1.0;
		this.size = "small";
		this.name = "drink";
		this.retailPrice = 1.50;
	}
	
	// constructor with parameters
	// main.Drink.Drink(double, String, String, double)
	public Drink(double cost, String size, String name, double retailPrice) {
		super(); // this calls the parent's constructor
		this.cost = cost;
		this.size = size;
		this.name = name;
		this.retailPrice = retailPrice;
	}

	
	public String getDescription() {
		return "Your Drink is: " + this.name + 
				"\nCost: " + this.cost +
				"\nRetail Price: " + this.retailPrice;
	}
	
	public void addIngredient(Ingredient item) {
		//this.ingredients
	}
	
	
	// getters and setters
	public String getSize() {
		return size;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
	

}
