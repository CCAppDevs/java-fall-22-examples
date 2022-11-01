package main;

public class IcedTea extends Tea {

	public IcedTea() {
		// TODO Auto-generated constructor stub
	}

	public IcedTea(double cost, String size, String name, double retailPrice) {
		super(cost, size, name, retailPrice);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescription() {
		return "Your Iced Tea is: " + this.getName() + 
				"\nCost: " + this.getCost() +
				"\nRetail Price: " + this.getRetailPrice();
	}
	

}
