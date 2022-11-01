package main;

public class Tea extends Drink {

	public Tea() {
		// TODO Auto-generated constructor stub
	}

	public Tea(double cost, String size, String name, double retailPrice) {
		super(cost, size, name, retailPrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		return "Your Tea is: " + this.getName() + 
				"\nCost: " + this.getCost() +
				"\nRetail Price: " + this.getRetailPrice();
	}

}
