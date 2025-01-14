//This class is used to get the factors of a given numbers

import java.util.Scanner;

public class GetFactors {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter the numbers
		System.out.println("Enter the numbers: ");
		int number  = input.nextInt();
		
		//array for storing the factors
		int maxSize = 10;  //initial array size
		int factors[] = new int[maxSize];
		int index = 0;
		
		//Getting the factors
		int tempNumber = number-1;
		while(tempNumber>0){
			if(number % tempNumber == 0){
				if(index == maxSize){
					maxSize *= 2;
					int temp[] = new int[maxSize];  // temp array for storing no.of elements greater than maxSize
					//copy data to temp
					for(int i=0; i<index; i++){
						temp[i] = factors[i];
					}
					factors = temp; // Referencing the new array
				}
			
			factors[index] = tempNumber;
			index++;
			}
			tempNumber--; // Decrementing the tempNumber
		}
		
		//Output 
		System.out.print("The factors are: ");
		for(int i=0; i<index; i++){
			System.out.print(factors[i]+" ");
		}
		input.close();
	}
}