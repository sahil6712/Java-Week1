//This class helps in getting number of handshake between n number of people

import java.util.Scanner;

public class MinimumHandshakes {

	//Method to get minimum number of handshakes
	public int calculateMinHandshakes(int numberOfPersons){
		
		//Calculate handshake using formulas = n*(n-1)/2
		int minHandshakes = numberOfPersons * (numberOfPersons - 1)/2;
		
		return minHandshakes;  //Returns minHandshakes where it is called
	}

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Enter number of students: ");
		int students = input.nextInt();
		
		//Create Object of the class for accessing the mothod
		MinimumHandshakes obj = new MinimumHandshakes();
		
		//getting handshake using method
		int minHandshakes = obj.calculateMinHandshakes(students);
		
		//Result
		System.out.print("Minimum number of Handshakes: "+minHandshakes);
		
		//Close the Scanner object
		input.close();
	}
}