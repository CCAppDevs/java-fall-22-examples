package main;

public abstract class EightBall {

	private String[] answers = {
			"Not Likely",
			"For Sure",
			"Please try again",
			"Answer Unlikely",
			"Outlook is good",
			"Not in a million years."
	};
	
	public EightBall() {
		
	}
	
	// ask a question
	public abstract String askQuestion(String prompt);
	
	
	// get answer
	public String getAnswer(int index) {
		return answers[index];
	}
	
	public String getRandomAnswer() {
		// (int) ((Math.random() * (max - min)) + min);
		int randomNumber = (int) (Math.random() * answers.length);		
		
		return answers[randomNumber];
	}
}
