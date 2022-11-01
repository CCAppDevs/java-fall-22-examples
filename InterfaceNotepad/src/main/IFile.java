package main;

public interface IFile {
	// open a file
	public void openFile(String filename);
	
	// write a line
	public void writeLine(String line);
	
	// read the file
	public void readFile();
}
