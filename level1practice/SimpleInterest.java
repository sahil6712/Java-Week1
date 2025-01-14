//This class is used to get simple interest

import java.util.Scanner;

public class SimpleInterest {

	// Method to get the Simple Interest
	public int calculateSimpleInterest(int principal, float rate, float time){
		
		// Formula of simple interest = (P*R*T)/100
		int interest = (int)(principal * rate * time)/100;
		
		return interest; // This will return value to the point where it is called
	}

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		// Prompt user to get the values
		System.out.print("Enter Principal: ");
		int principal = input.nextInt();
		
		System.out.print("Enter Rate: ");
		float rate = input.nextFloat();
		
		System.out.print("Enter time(in Years): ");
		float time = input.nextFloat();  
		
		//Creating the object of the class
		SimpleInterest obj = new SimpleInterest();
		
		int sInterest = obj.calculateSimpleInterest(principal, rate, time); //calling method to calculate simple interest
		
		//Result
		System.out.print("The Simple Interest is "+sInterest+" for Principal "+principal+", Rate of Interest "+rate+", and Time "+time);
		
		input.close();
	}
}