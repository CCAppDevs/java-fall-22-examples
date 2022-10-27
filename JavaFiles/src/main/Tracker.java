package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Tracker for tracking scores to a file
 * 
 * What does this know:
 * The name of the file
 * The total score
 * 
 * 
 * Actions:
 * Open new tracker
 * write to file
 * read from file
 */
public class Tracker {

	private File handle;
	private FileWriter writer;
	
	public Tracker(String filePath) {
		this.handle = new File(filePath);
	}
	
	public void AppendToFile(String line) {
		// create the writer with append flag
		try {
			this.writer = new FileWriter(this.handle, true);
			// write the line to the file
			this.writer.write(line + "\n");
			// close the writer
			this.writer.close();
		} catch (IOException e) {
			System.out.println("There was an error opening the file: ");
			e.printStackTrace();
		}

	}
	
	public void AddScore(String score) {
		AppendToFile("[Score] " + score);
	}
	
	public void FinalScore(String finalScore) {
		AppendToFile("[FINAL] " + finalScore);
	}
}
