//This class used find chocolate distributed per child and remaining 

import java.util.Scanner;

public class DistributeChocolate {

	//Calculate chocolate per person and remaining chocolate
	public static int[] calculateChocolateDistribution(int numberOfChocolates, int numberOfChild){
			
		//Calculate chocolate per child 
		int chocolatePerChild = numberOfChocolates / numberOfChild;
				
		//Calculate remaining chocolate
		int remaining = numberOfChocolates % (chocolatePerChild * numberOfChild);
				
		//using array to return multiple values
		int[] result = new int[2];
		result[0] = chocolatePerChild;
		result[1] = remaining;
				
		return result; //return an array where it is called
		}

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt user for the input
		System.out.print("Enter number of chocolates: ");
		int numberOfChocolates = input.nextInt();
		
		System.out.println("Enter number of children: ");
		int numberOfChildren = input.nextInt();
		
		//calling the function to get the result
		int result[] = DistributeChocolate.calculateChocolateDistribution(numberOfChocolates, numberOfChildren);
		
		//Result
		System.out.println("Chocolate Per child is "+result[0]);
		System.out.println("Chocolate Remaining "+result[1]);
		
		input.close();
	}
}