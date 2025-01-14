import java.util.*;

public class RandomNumberGenerator {

    // Method to generate a random 6-digit number
    public static int generate6DigitNumber() {
        // Math.random() generates a random double between 0.0 (inclusive) and 1.0 (exclusive)
        // We multiply it by 900000 to scale it to a number between 0.0 and 899999.0
        // Then, adding 100000 shifts the range to 100000 to 999999, making it a 6-digit number
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to check if all generated Numebrs are unique
    public static boolean checkForUniqueNumbers(int[] otpArray) {
        
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false;  // Found a duplicate OTP
                }
            }
        }
        return true;  // All Numbers are unique
    }

    public static void main(String[] args) {
        // Create an array to hold the generated Numebrs
        int[] generatedNumbers = new int[10];
        
        // Generate 10 Numebrs and store them in the array
        for (int i = 0; i < generatedNumbers.length; i++) {
            generatedNumbers[i] = generate6DigitNumber();
            System.out.println("Number #" + (i + 1) + ": " + generatedNumbers[i]);
        }

        // Validate uniqueness of the generated Number
        if (checkForUniqueNumbers(generatedNumbers)) {
            System.out.println("\nAll Numbers are unique!");
        } else {
            System.out.println("\nSome Numbers are duplicates.");
        }
    }
}
