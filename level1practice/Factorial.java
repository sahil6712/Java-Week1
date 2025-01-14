// Write a Program to find the factorial of an integer entered by the user.
// Hint => 
// For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
// Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
// Using a while loop, compute the factorial.
// Print the factorial at the end.


import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int product = 1;
		while(num >= 1) {
			product *= num;
			num--;
		}
		
		// printing the output
		System.out.println("The factorial is "+ product);
		
		input.close();
		
	}
}