package main;

public class Program {

	public static void main(String[] args) {
		// this will not work: Animal myAnimal = new Animal("generic animal", 0.0);

		// what about an inherited class?
		Duck myDuck = new Duck("Mallard", 10.5);
		
		Dog myDog = new Dog("Fido", 25.0);
		
		RubberDuck myRubberDucky = new RubberDuck("Rubber Ducky", 1.0);
		
		myDuck.makeNoise();
		myDuck.move();
		myDuck.makeNoise();
		myDuck.goCrazy();
		
		
		myDog.move();
		myDog.makeNoise();
		
		myRubberDucky.makeNoise();
		myRubberDucky.goCrazy();
		
	}

}
