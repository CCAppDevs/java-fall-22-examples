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

}
