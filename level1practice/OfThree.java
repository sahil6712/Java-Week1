//OfThree is used to find the largest and smallest of three numbers.

import java.util.Scanner;

public class OfThree {

	//Method for largest of three
	public int largestOfThree(int num1, int num2, int num3){
		
		//Checks
		if(num1 > num2){
			if(num1 > num3)
				return num1;
			else
				return num3;
		}
		else{
			if(num2 > num3)
				return num2;
			else
				return num3;
		}
	}
	
	// Method for Smallest of Three
	public int smallestOfThree(int num1, int num2, int num3){
		
		//Checks
		if(num1 < num2){
			if(num1 < num3)
				return num1;
			else
				return num3;
		}
		else{
			if(num2 < num3)
				return num2;
			else
				return num3;
		}
	}
	

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter numbers
		System.out.print("Enter number1: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter number2: ");
		int num2 = input.nextInt();
		
		System.out.println("Enter number3: ");
		int num3 = input.nextInt();
		
		//declare variable for result
		int largest;
		int smallest;
		
		//Creating object of a class
		OfThree obj = new OfThree();
		
		// Calling method largestOfThree to get largest value
		largest = obj.largestOfThree(num1, num2, num3);
		
		//Calling method smallestOfThree to get smallest
		smallest = obj.smallestOfThree(num1, num2, num3);
		
		//Result
		System.out.println("Smallest number is "+smallest+"\n"+"Largest of three is "+largest);
		
		input.close();
	}
}