//QuotientRemainder class helps to get quotient and remainder operation

import java.util.Scanner;

public class QuotientRemainder {

	// Methods for Quotient 
	 public static int[] findRemainderAndQuotient(int number, int divisor){
		 
			//Array to store remainder and quotient
			int array[] = new int[2];
		
			//Calculate Remainder
			array[0] = number % divisor;
			
			//Calculate Quotient
			array[1] = number / divisor;
			
			return array;
	}

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter input
		System.out.print("Enter Number: ");
		int number = input.nextInt();
		
		System.out.print("Enter Divisor: ");
		int divisor = input.nextInt();
		
		//array to store result
		int[] array = QuotientRemainder.findRemainderAndQuotient(number, divisor);
		
		//Result
		System.out.println("Remainder is "+array[0]);
		System.out.print("Quotient is "+array[1]);
	
		input.close();
	}
}