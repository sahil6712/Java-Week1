// This class gives the sum of n natural number

import java.util.Scanner;

public class NaturalNumberSum {

	//Method for sum of n natural numbers
	public int sumOfNaturalNumbers(int number){

		//Variable to store sum
		int sum = 0;

		//loop to calculate sum
		for(int i=1; i <= number; i++){
			sum += i;
		}

		return sum;  //return sum of n natural number method has been called
	}

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);

		//Prompt the user to get the input
		System.out.println("Enter the number: ");
		int number = input.nextInt();

		//Create object of the class
		NaturalNumberSum obj = new NaturalNumberSum();

		//calling the method to get the sum
		int sum = obj.sumOfNaturalNumbers(number);

		//Result
		System.out.print("The sum of Natual numbers is "+sum);

		input.close();
	}
}