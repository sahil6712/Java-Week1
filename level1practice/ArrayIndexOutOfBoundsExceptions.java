import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptions {

    //ArrayIndexOutOfBoundExceptions by calling Integer.parseInt()
    public static void generateException(String[] arr) {
		
		//Accessing index greater than or equal to array length cause the exception
		System.out.print("THe "+(arr.length+1)+" is"+arr[arr.length+1]);
    }

    // handle ArrayIndexOutOfBoundException
    public static void handleException(String[] arr) {
        try {
            // Attempt to generate the exception by accessing the index out of bound/
            generateException(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundException: " + e);
            System.out.println("Enetered index out of array bound");
        } catch (RuntimeException e) {
            // Catch any other runtime exception
            System.out.println("Caught RuntimeException: " + e);
            System.out.println("A runtime exception occurred.");
        }
    }

    public static void main(String[] arr) {
	
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an array
        System.out.print("Enter a array of names: ");
        String names[] = new String[5];
		for(int i=0; i<arr.length; i++){
			names[i] = input.next();
		}
		
		  //call the method to handle the exception
        System.out.println("\nHandling the exception with try-catch block:");
        handleException(names);

        //call the method to generate the exception
        System.out.println("Demonstrating ArrayIndexOutOfBoundException: \n");
        generateException(names);

      

        input.close();
    }
}
