// Write a program to check if the first is the smallest of the 3 numbers.
// I/P => number1, number2, number3
// O/P => Is the first number the smallest? ____


import java.util.*;

public class SmallestOfThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// checking if num1 is smaller than num2 and num3 
		if (number1 < number2 && number1 < number3) {
			System.out.println("Is the first number the smallest? Yes");
		}
		else {
			System.out.println("Is the first number the smallest? No");
		}
		
		input.close();
		
	}
}