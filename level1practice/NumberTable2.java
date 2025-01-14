//NumberTable2 prints table of entered number from 6 to 9

import java.util.Scanner;

public class NumberTable2 {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.println("Enter a number(for table): ");
		int number = input.nextInt();
		
		// creating an array of size 10 for storing the result
		int sizeArr = 4;
		int multiplicationTable[] = new int[sizeArr];
		
		// calculate the numbeer table
		for (int i = 1; i <= sizeArr; i++){
			multiplicationTable[i-1] = (i+5) * number;
		}
		// printing output stored in array
		for (int i = 0; i < sizeArr; i++) {
			System.out.println(number + " * "+ (i+6) + " : "+ multiplicationTable[i]);
		}

		
		input.close();
	}
}