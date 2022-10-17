package main;

public class Program {

	enum dayType {
		day,
		night
	}
	
	private static double dayRate = 0.1;
	private static double nightRate = 0.25;
	private static double dayHours = 2.0;
	private static double nightHours = 2.0;
	private static IODevice console = new IODevice();
	
	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the electricity calculator.");
		
		// variables
		boolean isRunning = true;
		
		// main loop
		while (isRunning) {
			// do stuff
			int choice = 0;
			
			System.out.println("Main Menu");
			System.out.println("1. Set day rate");
			System.out.println("2. Set night rate");
			System.out.println("3. Set day hours");
			System.out.println("4. Set night hours");
			System.out.println("5. Calculate our cost");
			System.out.println("9. Exit");
			
			choice = console.promptInt("What choice would you like to make? ");
			
			switch (choice) {
			case 1:
				setRate(dayType.day);
				break;
			case 2:
				setRate(dayType.night);
				break;
			case 3:
				setHours("Day");
				break;
			case 4:
				setHours("night");
				break;
			case 5:
				System.out.println("You chose to set calculate");
				System.out.println("Day Cost: " + calculate(dayRate, dayHours));
				System.out.println("Night Cost: " + calculate(nightRate, nightHours));
				break;
			case 9:
				isRunning = false;
				System.out.println("Thank you for using the calculator!");
				break;
			default:
				System.out.println("Invalid choice, please try again.");
			}
		}
		
		
		// close our input
		console.close();
	}

	public static double calculate(double rate, double hours) {
		return rate * hours;
	}
	
	public static void setRate(dayType type) {
		//System.out.println("You chose to set the " + typeOfRate + " rate.");
		double newRate = console.promptDouble("What is the new rate? ");
		
		if (type == dayType.day) {
			// do day stuff
			dayRate = newRate;
		} else if (type == dayType.night) {
			// do night stuff
			nightRate = newRate;
		} else {
			// show the user an error and do nothing
			System.out.println("Something went wrong. Please try again.");
		}
		
		System.out.println("The value of the new rate is: " + newRate);
	}
	
	public static void setHours(String typeOfHours) {
		System.out.println("You chose to set the " + typeOfHours + " hours.");
		double newHours = console.promptDouble("How many hours were used? ");
		
		if (typeOfHours == "day") {
			dayHours = newHours;
		} else if (typeOfHours == "night") {
			nightHours = newHours;
		} else {
			System.out.println("Something went wrong. Please try again.");
		}
		
		System.out.println("The new value of the hours is: " + newHours);
	}
}
