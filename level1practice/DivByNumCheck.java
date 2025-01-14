// Write a program to check if a number is divisible by 5
// I/P => number
// O/P => Is the number ___ divisible by 5? ___


import java.util.*;

public class DivByNumCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		// checking if it's divisible by 5 or not
		if (number % 5 == 0) {
			System.out.println("Is the number "+ number +" divisible by 5? Yes");
		}
		else {
			System.out.println("Is the number "+ number +" divisible by 5? No");
		}
		input.close();
		
	}
}