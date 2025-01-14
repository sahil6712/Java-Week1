//UntilZero is a class used for storing values until zero is not pressed

import java.util.Scanner;

public class UntilZero {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Size of array
		int size = 10;
		
		// Array of size 10
		double nums[] = new double[size];
		
		int index = 0;
		// infinite loop to get user input
		while(true) {
			System.out.print("Enter a number: ");
			double userInput = input.nextDouble();
			
			// break if input is less or equal to 0 or out of space
			if (userInput <= 0 || index >= 10) {
				break;
			}
			nums[index] = userInput;
			index++;
		}
		// getting sum of all the userInput
		double sum = 0;
		for (int i = 0; i < index; i++) {
			sum += nums[i];
		}
		// output
		System.out.println("Sum of numbers entered is :"+ sum);

		
		
		input.close();
	}
}