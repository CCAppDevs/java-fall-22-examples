package main;

public class Calculator<T> {
	
	public T Add(T a, T b) {
		return a+b;
	}
	
	public T Sub(T a, T b) {
		return a-b;
	}
	
	public T Multiply(T a, T b) {
		return a*b;
	}
	
	public T Divide(T a, T b) {
		return a/b;
	}
	
	public void Results(char operator, T a, T b) {
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
