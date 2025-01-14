import java.util.Scanner;

public class NullPointerExceptions {

    // NullPointerExceptions
    public static void generateException(String str) {
	
        //Converting str to upper case
		String str2 = str.toUpperCase(); //This will cause an error
		System.out.print("Sring in upper case is "+str2);
    }

    // handle NullPointerException
    public static void handleException(String str) {
        try {
            generateException(str);
        }
		catch (NullPointerException e) {
            System.out.println("Caught exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String str = null;
		
		//handle the exception
        System.out.println("\nHandling the exception with try-catch block:");
        handleException(str);
        
		//generate exception
        System.out.println("Demonstrating StringIndexOutOfBoundsException:");
        generateException(str);

        input.close();
    }
}
