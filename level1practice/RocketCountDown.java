// Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
// Hint => 
// Create a variable counter to take user inputted value for the countdown.
// Use the while loop to check if the counter is 1
// Inside a while loop, print the value of the counter and decrement the counter.

import java.util.*;

public class RocketCountDown {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int number = input.nextInt();
		
		
		// using while for countdown
		while(number > 0) {
			System.out.println(number);
			number--;
		}
		
		input.close();
		
	}
}