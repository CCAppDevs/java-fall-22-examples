package main;

public class RubberDuck extends Duck {

	public RubberDuck(String name, double weight) {
		super(name, weight);
	}

	@Override
	public void makeNoise() {
		System.out.println(this.getName() + " makes a squeeking noise.");
	}
}
