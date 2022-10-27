package main;

public class Duck extends Animal {

	public Duck(String name, double weight) {
		super(name, weight);
	}

	@Override
	public void move() {
		System.out.println(this.getName() + " goes in a random direction.");
	}
	
	public void goCrazy() {
		System.out.println(this.getName() + " goes crazy!");
		move();
		makeNoise();
		move();
		makeNoise();
		move();
	}

	@Override
	public void makeNoise() {
		System.out.println(this.getName() + " makes a quack.");
	}

}
