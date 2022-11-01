package main;

public class Coffee extends Drink {

	// abstraction, polymorphism, inheritance, encapsulation
	
	public Coffee() {
		super();
		this.setName("Coffee");
	}

	public Coffee(double cost, String size, String name, double retailPrice) {
		super(cost, size, name, retailPrice);
	}

	@Override
	public String getDescription() {
		return "Your Coffee is: " + this.getName() + 
				"\nCost: " + this.getCost() +
				"\nRetail Price: " + this.getRetailPrice();
	}

}
