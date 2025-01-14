// Create a program to print odd and even numbers between 1 to the number entered by the user.
// Hint => 
// Get an integer input from the user, assign to a variable number and check for Natural Number
// Using a for loop, iterate from 1 to the number
// In each iteration of the loop, print the number is odd or even number



import java.util.*;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		
		//even odd print
		for(int i = 1 ; i <= num; i++) {
			// printing the output
			if (i % 2 == 0) {
				System.out.println(i+ " is Even");
			}else {
				System.out.println(i+ " is Odd");
			}
			
		}
		input.close();
		
	}
}