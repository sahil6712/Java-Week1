import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find the sum using recursion
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + recursiveSum(n - 1);
        }
    }

    // Method to find the sum using the formula
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a natural number: ");
            int n = input.nextInt();

            // Check if the input is a valid natural number
            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                // Compute sum using recursion
                int sumRecursive = recursiveSum(n);

                // Compute sum using the formula
                int sumFormula = formulaSum(n);

                // Print both results
                System.out.println("Sum of first " + n + " natural numbers (recursive): " + sumRecursive);
                System.out.println("Sum of first " + n + " natural numbers (formula): " + sumFormula);

                // Comparing the results from both the methods
                if (sumRecursive == sumFormula) {
                    System.out.println("Both results are correct and match!");
                } else {
                    System.out.println("There is a mismatch between the results.");
                }
            }
        

        input.close();
    }
}
