package main;

public class Drink {
	// private properties/members
	private double cost;
	private String size;
	private String name;
	private double retailPrice;
	
	public Drink() {
		super();
		this.cost = 1.0;
		this.size = "small";
		this.name = "coffee";
		this.retailPrice = 1.50;
	}
	
	public Drink(double cost, String size, String name, double retailPrice) {
		super(); // this calls the parent's constructor
		this.cost = cost;
		this.size = size;
		this.name = name;
		this.retailPrice = retailPrice;
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
