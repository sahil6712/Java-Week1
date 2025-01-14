import java.util.*;

public class NumberCheckerThird {
	
	
	// Method to find the count of digits
    public static int countDigits(int number) {
		// If the number is negative, make it positive
        number = Math.abs(number);
        
        // If the number is 0, it has 1 digit
        if (number == 0) {
            return 1;
        }
        
        int count = 0;
        while (number != 0) {
            number /= 10;  // Divide the number by 10
            count++;    // Increment the digit count
        }
        return count;
    }

    // Method to store the digits of the number
    public static int[] getDigitsArray(int number) {
        String numberStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int i = 1; i < digits.length; i++) { // Skip the leading digit
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
	
    public static void main(String[] args) {
		// Initializing the scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Count digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Get digits array
        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        // Reverse digits array
        int[] reversedDigits = reverseDigitsArray(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));

        // Check if palindrome
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is Palindrome: " + isPalindrome);

        // Check if duck number
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck Number: " + isDuck);

		// Closing the scanner object
        input.close();
    }

}
