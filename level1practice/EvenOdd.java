//This class gives even and odd numbers to a given limit

import java.util.Scanner;

public class EvenOdd {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter Number
		System.out.print("Enter the numer: ");
		int number = input.nextInt();
		
		// size of arrays to store even and odd numbers
		int size = number/2;
		
		
		int evenNumbers[] = new int[size];  //store even numbers
		
		if(number%2 != 0)  
			size += 1; //For fixing the size when odd number is given
		
		int oddNumbers[] = new int[size];   //store odd numbers
		
		int indexEven = 0; // Index of evenNumbers
		int indexOdd = 0; // Index of oddNumbers
			
		for(int i=1; i<= number; i++){
			if(i%2 == 0){
				evenNumbers[indexEven] = i;  //getting even numbers
				indexEven++;
			}
			else{
				oddNumbers[indexOdd] = i;  //getting odd numbers
				indexOdd++;
			}
		}
			
		//Output even and odd numbers
		System.out.print("Even Numbers: ");
		for(int i=0; i<evenNumbers.length; i++){
			System.out.print(evenNumbers[i]+" ");
		}
		
		System.out.println(""); //newline
		
		System.out.print("Odd Numbers: ");
		for(int i=0; i<oddNumbers.length; i++){
			System.out.print(oddNumbers[i]+" ");
		}
	
		input.close();
	}
}