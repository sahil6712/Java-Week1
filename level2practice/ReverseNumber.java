import java.util.Scanner;

public class ReverseNumber {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for a number
        System.out.print("Enter a number: ");
        int originalNumber = input.nextInt();

        //Find the number of digits in the input number
        int tempNumber = originalNumber;
        int digitCount = 0;
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;  
            digitCount++;                  
        }

        // Create an array to store the digits of the number
        int[] digitsArray = new int[digitCount];

        // Extract and store the digits in the array
        tempNumber = originalNumber;  // Reinitialize the 
        for (int i = 0; i < digitCount; i++) {
            digitsArray[i] = tempNumber % 10;  
            tempNumber = tempNumber / 10;      
        }


        // Display the reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digitsArray[i]);  // Print each reversed digit
        }
		
		input.close();
	}
}