//CheckNumber is a class that classifies number as positive, negative, and zero.

import java.util.Scanner;

public class CheckNumber {
	
	// Class for identifying numbers as positive(1) negative(-1) and zero(0)
	
	public void checkInteger(int number){
		
		//Check the number
		if(number > 0) {
			System.out.print("The entered number is positive "+1);
		}
		else if(number == 0) {
			System.out.print("The entered number is zero: "+0);
		}
		else {
			System.out.print("The enterd number in negative: "+(-1));
		}
	}
	
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a number
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		
		//Create Object of the clss
		CheckNumber obj = new CheckNumber();
		
		//Calling the method to get the result
		obj.checkInteger(number);
	
		input.close();
	}
}