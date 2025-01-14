//This class will tell number of rounds athlete should complete of a triangular park to achieve his target

import java.util.Scanner;

public class AthleteRun {
	
	// Method to calculate number of rounds of athlete
	public float calculateRounds(float sideOfPark, int target){
		
		//Convert target to meter
		target *= 1000;
		
		//Getting perimeter of park using formula
		float parkPerimeter = sideOfPark * 3;
		
		//Calculate rounds using formula rounds  = target/parkPerimeter
		float rounds = target/parkPerimeter;
		
		return rounds;  // return number of rounds where it is called
	}

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Enter the side of Triagular park(in meter): ");
		float sideOfPark = input.nextFloat();
		
		//target given
		int target = 5; //in Kilometer
		
		// Create object of a class
		AthleteRun obj = new AthleteRun();
		
		//Calling the method to get the number of rounds
		float rounds  = obj.calculateRounds(sideOfPark, target);
		
		//Result
		System.out.print("Number of rounds user need to complete to complete "+target+" is "+rounds);
	
		input.close();
	}
}