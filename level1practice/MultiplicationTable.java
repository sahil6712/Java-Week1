// Create a program to find the multiplication table of a number entered by the user from 6 to 9.
// Hint => 
// Take integer input and store it in the variable number
// Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___ 


import java.util.*;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if (num > 9 || num < 6) {
			System.out.println("Not a valid Number");
			System.exit(1);
		}
		
		// calcuation for table
		for (int i = 1; i <= 10; i++) {
			System.out.println(num +" * "+ i +" = " + i*num );
		}
		
		input.close();
		
	}
}