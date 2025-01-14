// Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
// Hint => 
// Get integer input from the user and store it in the age variable.
// If the person is 18 or older, print "The person can vote." Otherwise, print "The person cannot vote." 
// I/P => age
// O/P => If the person's age is greater or e


import java.util.*;

public class AgeVerification {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Age : ");
		int age = input.nextInt();
		
		// checking if a person can vot or not
		
		if (age < 18) {
			System.out.println("The person cannot vote.");
		}
		else {
			System.out.println("The person can vote.");
		}
		
		input.close();
		
	}
}