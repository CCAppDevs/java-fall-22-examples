package main;

import java.util.Scanner;

public class IODevice {
	private Scanner scanner;

	// constructor - sets up the class for first use
	public IODevice() {
		super();
		this.scanner = new Scanner(System.in);
	}
	
	public String prompt(String prompt) {
		System.out.println(prompt);
		return this.scanner.nextLine();
	}
	
	public int promptInt(String prompt) {
		System.out.println(prompt);
		return this.scanner.nextInt();
	}
	
	public void close() {
		this.scanner.close();
	}

	public double promptDouble(String prompt) {
		System.out.println(prompt);
		return this.scanner.nextDouble();
	}
}
