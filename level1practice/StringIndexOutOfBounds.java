import java.util.Scanner;

public class StringIndexOutOfBounds {

    // StringIndexOutOfBoundsException
    public static void generateException(String str) {
	
        // Access an index beyond the length of the string
        System.out.println("Attempting to access index 10 in the string...");
		
        // This will cause StringIndexOutOfBoundsException if the string length is less than 10
        char character = str.charAt(10);
        System.out.println("Character at index 10: " + character);  // This line won't execute
    }

    // handle StringIndexOutOfBoundsException
    public static void handleException(String str) {
        try {
            generateException(str);
        }
		catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number 
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();
		
		    //handle the exception
        System.out.println("\nHandling the exception with try-catch block:");
        handleException(inputString);
        
		//generate exception
        System.out.println("Demonstrating StringIndexOutOfBoundsException:");
        generateException(inputString);

    

        input.close();
    }
}
