// Write a program to check for the natural number and write the sum of n natural numbers 
// Hint => 
// A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
// A sum of n natural numbers is n * (n+1) / 2 
// I/P => number
// O/P => If the number is a positive integer then the output is
// The sum of ___ natural numbers is ___
// Otherwise 
// The number ___ is not a natural number


import java.util.*;

public class SumOfNatural {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if (num < 1) {
			System.out.println("The number " +num+ " is not a natural number");
			System.exit(1);
		}
		
		// A sum of n natural numbers is n * (n+1) / 2 
		int sum = num * (num+1) / 2;
		
		// printing the output
		System.out.println("The sum of "+num+" natural numbers is "+ sum);
		
		input.close();
		
	}
}