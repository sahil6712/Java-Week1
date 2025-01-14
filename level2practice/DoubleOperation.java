import java.util.Scanner;

class DoubleOperation {

    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt for values a, b, and c
        System.out.println("Enter value for a:");
        double a = input.nextDouble();

        System.out.println("Enter value for b:");
        double b = input.nextDouble();

        System.out.println("Enter value for c:");
        double c = input.nextDouble();

        // Operations
        double result1 = a + b * c; 
        double result2 = a * b + c;  
        double result3 = c + a / b;  
        double result4 = a % b + c;  

        // Output
        System.out.println("Result of a + b * c: " + result1);
        System.out.println("Result of a * b + c: " + result2);
        System.out.println("Result of c + a / b: " + result3);
        System.out.println("Result of a % b + c: " + result4);

        // Close the scanner to avoid resource leak
        input.close();
    }
}
