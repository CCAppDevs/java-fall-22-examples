package main;

public class ConsoleEightBall extends EightBall {

	public ConsoleEightBall() {	}

	@Override
	public String askQuestion(String prompt) {
		System.out.println(prompt);
		return getRandomAnswer();
	}

}
