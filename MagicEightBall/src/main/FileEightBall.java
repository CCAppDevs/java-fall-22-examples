package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileEightBall extends EightBall {
	
	private File handle;
	private FileWriter writer;

	public FileEightBall(String file) {
		super();
		this.handle = new File(file);
	}
	
	private void writeLine(String line) {
		try {
			// open the file for writing
			this.writer = new FileWriter(this.handle, true);
			// write a line
			this.writer.write(line + "\n");
			// close the file
			this.writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String askQuestion(String prompt) {
		String answer = getRandomAnswer();
		
		String line = prompt + ": " + answer;
		writeLine(line);
		
		return answer;
	}

}
