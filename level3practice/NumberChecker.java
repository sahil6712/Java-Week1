//A duck number is a number that has a non-zero digit present in it
//Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3

import java.util.*;

public class NumberChecker {
	
	// Method to find the count of digits
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
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

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE; // Assigining max of integer values

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
	
    public static void main(String[] args) {
		// Creating the scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Count digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Get digits array
        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        // Check if duck number
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck Number: " + isDuck);

        // Check if Armstrong number
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        // Find largest and second largest
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestAndSecondLargest[0] + ", Second Largest: " + largestAndSecondLargest[1]);

        // Find smallest and second smallest
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestAndSecondSmallest[0] + ", Second Smallest: " + smallestAndSecondSmallest[1]);

		// closing the scanner resource
        input.close();
    }
	
	}
