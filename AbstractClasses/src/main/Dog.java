package main;

public class Dog extends Animal {

	public Dog(String name, double weight) {
		super(name, weight);
	}

	@Override
	public void makeNoise() {
		System.out.println(this.getName() + " barks!");
	}

	@Override
	public void move() {
		System.out.println(this.getName() + " moves straight forward.");
	}

}
