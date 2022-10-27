package main;

public abstract class Animal {
	// properties
	private String name;
	private double weight;
	
	// constructor
	public Animal(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// abstract methods (methods without behavior/code)
	public abstract void makeNoise();
	
	public abstract void move();
}
