import java.util.Scanner;

public class FizzBuzz {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		        
        // Prompt  user for a Number
        System.out.println("Enter a number ");
        int num = input.nextInt();
        
        // Check  number is positive
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        // Create a string array to store results
        String[] result = new String[num + 1];  
        
        //handling case for zero
		result[0] = Integer.toString(0);
		
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i] = "Fizz";
            } else if (i % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = Integer.toString(i);  //integer to string
            }
        }
        
        // Print the output
        for (int i = 0; i <= num; i++) {
            System.out.println(result[i]);
        }

		
		input.close();
	}
}