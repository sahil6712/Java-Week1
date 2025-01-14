//This class helps in getting number of handshake between n number of people

import java.util.Scanner;

public class MaximumHandshakes {

	//Method to get maximum number of handshakes
	public int calculateMaxHandshakes(int numberOfPersons){
		
		//Calculate handshake using formulas = n*(n-1)/2
		int maxHandshakes = numberOfPersons * (numberOfPersons - 1)/2;
		
		return maxHandshakes;  //Returns minHandshakes where it is called
	}

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Enter number of students: ");
		int students = input.nextInt();
		
		//Create Object of the class for accessing the mothod
		MaximumHandshakes obj = new MaximumHandshakes();
		
		//getting handshake using method
		int maxHandshakes = obj.calculateMaxHandshakes(students);
		
		//Result
		System.out.print("Minimum number of Handshakes: "+maxHandshakes);
		
		//Close the Scanner object
		input.close();
	}
}