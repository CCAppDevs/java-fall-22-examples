package main;

public class Calculator {
	
	public int Add(int a, int b) {
		return a+b;
	}
	
	public int Sub(int a, int b) {
		return a-b;
	}
	
	public int Multiply(int a, int b) {
		return a*b;
	}
	
	public int Divide(int a, int b) {
		return a/b;
	}
	
	public void Results(char operator, int a, int b) {
		if (operator == '-') {
			System.out.println(a + " - " + b + " = " + Sub(a, b));
		} else if (operator == '*') {
			System.out.println(a + " * " + b + " = " + Multiply(a, b));
		} else if (operator == '/') {
			System.out.println(a + " / " + b + " = " + Divide(a, b));
		} else {
			System.out.println(a + " + " + b + " = " + Add(a, b));
		}
		
	}
}
