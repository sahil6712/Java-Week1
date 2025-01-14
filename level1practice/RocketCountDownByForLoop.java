// Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
// Hint => 
// Create a variable counter to take user inputted value for the countdown.
// Use the for loop


import java.util.*;

public class RocketCountDownByForLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int number = input.nextInt();
		
		
		// now we are using for loop for countdown
		for(int i = number; i > 0; i--) {
			System.out.println(i);
		}
		
		input.close();
		
	}
}