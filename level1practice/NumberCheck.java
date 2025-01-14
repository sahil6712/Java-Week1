// Write a program to check whether a number is positive, negative, or zero.
// Hint => 
// Get integer input from the user and store it in the number variable.
// If the number is positive, print positive.
// If the number is negative, print negative.
// If the number is zero, print zero. 

import java.util.*;

public class NumberCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Num : ");
		int num = input.nextInt();
		
		// checking if the num is positive or not by using if else ladder
		
		if (num > 0) {
			System.out.println("the number is positive");
		}
		else if (num < 0){
			System.out.println("the number is negative");
		}
		else {
			System.out.println("the number is zero");
		}
		
		input.close();
		
	}
}
