import java.util.Scanner;

public class NumberTable {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.println("Enter a number(for table): ");
		int number = input.nextInt();
		
		// creating an array of size 10 for storing the result
		int sizeArr = 10;
		int multiplicationTable[] = new int[sizeArr];
		
		// calculate the numbeer table
		for (int i = 1; i <= multiplicationTable.length; i++){
			multiplicationTable[i-1] = i * number;
		}
		// printing output stored in array
		for (int i = 0; i < multiplicationTable.length; i++) {
			System.out.println(number + " * "+ (i+1) + " : "+ multiplicationTable[i]);
		}

		
		input.close();
	}
}