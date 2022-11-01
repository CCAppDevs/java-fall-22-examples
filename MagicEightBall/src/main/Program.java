package main;

public class Program {

	public static void main(String[] args) {
		System.out.println("Welcome to the magic 8-ball.");
		
		ConsoleEightBall myEightBall = new ConsoleEightBall();
		String answer = myEightBall.askQuestion("Will this work all the time?");
		System.out.println(answer);
		
		FileEightBall fileBall = new FileEightBall("answers.txt");
		String fileAnswer = fileBall.askQuestion("Does this print to a file?");
		System.out.println(fileAnswer);
	}

}
