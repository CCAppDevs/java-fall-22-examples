package main;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<Integer> numberlist = new ArrayList<Integer>(52);
		
		for (int i = 1; i <= 52; i++) {
			numberlist.add(i);
		}
		
		for (int n : numberlist) {
			System.out.println(n);
		}
		
		System.out.println("Shuffling");
		Collections.shuffle(numberlist);
		
		for (int n : numberlist) {
			System.out.println(n);
		}
	}

}
