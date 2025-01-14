// Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using while loop
// Compare the two results and print the result

import java.util.*;

public class SumOfNaturalByWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if (num < 1) {
			System.out.println("The number " +num+ " is not a natural number");
			System.exit(1);
		}
		
		// A sum of n natural numbers is n * (n+1) / 2 
		int sum = num * (num+1) / 2;
		
		int numTemp = num;
		int sum2 = 0;
		while (numTemp  > 0) {
			sum2 += numTemp;
			numTemp--;
		}
		// checking if they are same
		if (sum == sum2) {
			System.out.println("Both are Same");
		}else {
			System.out.println("Both are not Same");
		}
		
		// printing the output
		System.out.println("The sum of "+num+" natural numbers is "+ sum);
		
		input.close();
		
	}
}