import java.util.Scanner;

public class IllegalArgumentExceptions {

    //IllegalArgumentException by calling substring() wiht invalid arguments
    public static void generateException(String str) {
	
        System.out.println("Call substring() with invalid indices...");
		
        //Call substring with start index greater than end index
        String substring = str.substring(5, 2);  // This will generate an IllegalArgumentException
        System.out.println("Substring: " + substring);  // will not get executed
    }

    // handle IllegalArgumentException
    public static void handleException(String str) {
        try {
            // Attempt to generate the exception by calling generateException() method
            generateException(str);
        } catch (IllegalArgumentException e) {
            // Catch the IllegalArgumentException and display a custom message
            System.out.println("Caught IllegalArgumentException: " + e);
            System.out.println("Start index is greater than end index, which is not allowed in substring()");
        } catch (RuntimeException e) {
            // Catch any other runtime exception
            System.out.println("Caught RuntimeException: " + e);
            System.out.println("A runtime exception occurred.");
        }
    }

    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

		// call the method to handle the exception
        System.out.println("\nHandling the exception with try-catch block:");
        handleException(inputString);
		
        //  call the method to generate the exception
        System.out.println("Demonstrating IllegalArgumentException:");
        generateException(inputString);

        

        input.close();
    }
}
