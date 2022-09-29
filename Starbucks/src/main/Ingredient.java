package main;

public class Ingredient {
	private String name;
	private double cost;
	private double retailCost;
	
	public Ingredient(String name, double cost, double retailCost) {
		super();
		this.name = name;
		this.cost = cost;
		this.retailCost = retailCost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getRetailCost() {
		return retailCost;
	}

	public void setRetailCost(double retailCost) {
		this.retailCost = retailCost;
	}
	
	
}
