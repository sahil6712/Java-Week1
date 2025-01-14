import java.util.Scanner;

public class NumberChecker {

    // Method to check positive number
    public static boolean isPositive(int num) {
        return num >= 0;  // Returns true if number is positive or zero
    }

    // Method to check negative number
    public static boolean isEven(int num) {
        return num % 2 == 0;  // Returns true if the number is even
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;  // Returns 1 if num1 is greater than num2
        } else if (num1 == num2) {
            return 0;  // Returns 0 if num1 is equal to num2
        } else {
            return -1;  // Returns -1 if num1 is less than num2
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Taking user input for the 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                // If positive, check if even or odd
                if (isEven(numbers[i])) {
                    System.out.println("Number " + numbers[i] + " is positive and even.");
                } else {
                    System.out.println("Number " + numbers[i] + " is positive and odd.");
                }
            } else {
                System.out.println("Number " + numbers[i] + " is negative.");
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[4]);

        // Output the result of the comparison
        if (comparisonResult == 1) {
            System.out.println("The first number (" + numbers[0] + ") is greater than the last number (" + numbers[4] + ").");
        } else if (comparisonResult == 0) {
            System.out.println("The first number (" + numbers[0] + ") is equal to the last number (" + numbers[4] + ").");
        } else {
            System.out.println("The first number (" + numbers[0] + ") is less than the last number (" + numbers[4] + ").");
        }

        input.close();
    }
}
