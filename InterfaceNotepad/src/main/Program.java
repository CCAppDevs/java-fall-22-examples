package main;

public class Program {

	public Program() {
		// TODO Auto-generated constructor stub
		
		IFile myFile = new ConsoleFileWriter();
		
		myFile.openFile("toast.txt");
		
		myFile = new LogFileWriter();
		
		LogFileWriter logFile = new LogFileWriter();
		
		logFile.sayLog("toast");
		logFile.openFile("toast.txt");
		
		IFile[] writers = { new ConsoleFileWriter(), new LogFileWriter() };
		
		writers[1].openFile("open");
		writers[1].sayLog("toast");
	}

}
