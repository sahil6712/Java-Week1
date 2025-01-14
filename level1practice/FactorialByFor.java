// Rewrite program 14 using for loop
// Hint => 
// Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 


import java.util.*;

public class FactorialByFor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int product = 1;
		for(int i = num ; i >= 1; i--) {
			product *= i;
		}
		
		// printing the output
		System.out.println("The factorial is "+ product);
		
		input.close();
		
	}
}