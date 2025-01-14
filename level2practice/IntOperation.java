import java.util.Scanner;

class IntOperation {

    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt for values a, b, and c
        System.out.println("Enter value for a");
        int a = input.nextInt();

        System.out.println("Enter value for b");
        int b = input.nextInt();

        System.out.println("Enter value for c");
        int c = input.nextInt();

        // Operations
        int result1 = a + b * c; 
        int result2 = a * b + c;  
        int result3 = c + a / b;  
        int result4 = a % b + c;  

        // Output
        System.out.println("Result of a + b * c " + result1);
        System.out.println("Result of a * b + c " + result2);
        System.out.println("Result of c + a / b " + result3);
        System.out.println("Result of a % b + c " + result4);

        
        input.close();
    }
}
