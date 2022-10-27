package main;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Tracker scoreTracker = new Tracker("score.txt"); // instantiate a tracker
		
		scoreTracker.FinalScore("105");
	}
}