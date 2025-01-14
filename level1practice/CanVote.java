//CanVote is a class that takes age as input and tells person with that age is eligible to vote or not

import java.util.Scanner;

public class CanVote {

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		
		//size of array
		int size = 10;
		
		//array for storing multiple elements
		int studentAge[] = new int[size];
		
		//Promot user to get an array
		System.out.println("Enter elements of array");
		for(int i=0; i<size; i++){
			studentAge[i] = input.nextInt();
		}
	
		//iterate studentAge
		for(int i=0; i<size; i++){
			if(studentAge[i] >= 18)
				System.out.println("The student with the age "+studentAge[i]+" can vote");
			else if(studentAge[i] >= 0)
				System.out.println("The student with the age "+studentAge[i]+" cannot vote");
			else	
				System.out.println("Invalid Age");
		}
		input.close();
	}
}