import java.util.Scanner;

public class NumberFormatExceptions {

    //NumberFormatExceptions by calling Integer.parseInt()
    public static void generateException(String str) {
	
        System.out.println("Call Integer.parseInt()");
		
        int n = Integer.parseInt(str); //This will generate the exception
		System.out.print("the integer from string is "+n); //This will not get executed         
    }

    // handle NumberFormatException
    public static void handleException(String str) {
        try {
            // Attempt to generate the exception by calling generateException() method
            generateException(str);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
            System.out.println("Enetered string does not have integers in it");
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
		
		//Handle the exception
        System.out.println("\nHandling the exception with try-catch block:");
        handleException(inputString);

        // method to generate the exception
        System.out.println("Demonstrating NumberFormatException: \n");
        generateException(inputString);

        

        input.close();
    }
}
