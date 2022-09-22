package main;

public class Person {
	String firstName;
	String lastName;
	byte age;
	
	public Person() {
		firstName = "";
		lastName = "";
		age = 0;
	}
	
	public void SayHello() {
		System.out.println(firstName + " says hello");
	}
}