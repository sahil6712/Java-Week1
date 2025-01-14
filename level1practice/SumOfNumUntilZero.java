// Write a program to find the sum of numbers until the user enters 0
// Hint => 
// Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
// Use the while loop to check if the user entered is 0
// If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
// The loop will continue till the user enters zero and outside the loop display the total value


import java.util.*;

public class SumOfNumUntilZero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.print("Enter a Number : ");
		double number = input.nextInt();
		
		double sum = 0;
		
		// the sum is stored in sum variable
		
		while(number != 0) {
			sum += number;
			System.out.print("Enter another Number or enter 0 to exit : ");
			number = input.nextInt();
		}
		
		// finally printing output
		System.out.println("Sum is :"+ sum);
		
		input.close();
		
	}
}