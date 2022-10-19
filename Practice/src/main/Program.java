package main;

public class Program {

	public static void main(String[] args) {
		System.out.println("Welcome to the calculator.");
		
		int a = 3;
		int b = 5;
		
		Calculator myCalc = new Calculator();
		
		myCalc.Results('+', a, b);
		myCalc.Results('-', a, b);
		myCalc.Results('*', a, b);
		myCalc.Results('/', a, b);
	}

}
