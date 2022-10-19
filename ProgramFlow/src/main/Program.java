package main;

public class Program {

	public static void main(String[] args) {
		int counter = 10;
		int value = 0;
		boolean isRunning = true;
		
		// for-loop (range based)
		System.out.println("Starting next loop: for (range based)");
		
		// count from 2 - 20 but only even numbers
		for (int j = 2; j <= 20; j += 2) {
			System.out.println(j);
		}
		
		int j = 0;
		j += 2; // j = 2
		j = j + 2; // j = 4
		
		// working with loops and arrays
		int[] myArr = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			//System.out.println("Array at index #" + i + " has a value of " + myArr[i]);
			sum += myArr[i];
		}
		
		System.out.println("The total sum of all elements in the array is: " + sum);
		
		// foreach loop
		
		sum = 0;
		for(int num : myArr) {
			sum += num;
		}
		
		System.out.println("The total sum of all elements in the array is: " + sum);
		
		
		
		
		
		// while loop
		System.out.println("Starting next loop: while");
		
		while (counter > 0) {
			// do a thing
			counter = counter - 1;
			System.out.println(counter);
		}
		
		// do while loop
		// counter is currently 0
		
		System.out.println("Starting next loop: do while");
		
		do {
			// do a thing
			counter++;
			System.out.println(counter);
		} while (counter < 10);
		
	}

}
