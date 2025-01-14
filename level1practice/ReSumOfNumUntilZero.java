// Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
// Hint => 
// Use infinite while loop as in while (true)
// Take the user entry and check if the user entered 0 or a negative number to break the loop using break;



import java.util.*;

public class ReSumOfNumUntilZero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.print("Enter a Number : ");
		double number = input.nextInt();
		
		double sum = 0;
		
		// using infinie while loop
		
		while(true) {
			// break statement to get outside of loop
			if (number <= 0) {
				break;
			}
			sum += number;
			System.out.print("Enter another Number or enter 0 to exit : ");
			number = input.nextInt();
		}
		
		// printing the sum
		System.out.println("Sum is :"+ sum);
		
		input.close();
		
	}
}