import java.util.*;

public class NumberCheckerFive {

	
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

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors.stream().mapToInt(i -> i).toArray();
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }

    // Method to find the sum of the factors using factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array
    public static int productOfCubeOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        return sum == number;
    }

    // Method to find if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        return sum > number;
    }

    // Method to find if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += factorial(digit);
        }
        return sum == number;
    }

    // Helper method to find the factorial of a number
    private static int factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }


    public static void main(String[] args) {
		// Initializing the scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find factors
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));

        // Greatest factor
        int greatest = greatestFactor(factors);
        System.out.println("Greatest Factor: " + greatest);

        // Sum of factors
        int sumFactors = sumOfFactors(factors);
        System.out.println("Sum of Factors: " + sumFactors);

        // Product of factors
        int productFactors = productOfFactors(factors);
        System.out.println("Product of Factors: " + productFactors);

        // Product of cube of factors
        int productCubeFactors = productOfCubeOfFactors(factors);
        System.out.println("Product of Cube of Factors: " + productCubeFactors);

        // Check if perfect number
        boolean isPerfect = isPerfectNumber(number);
        System.out.println("Is Perfect Number: " + isPerfect);

        // Check if abundant number
        boolean isAbundant = isAbundantNumber(number);
        System.out.println("Is Abundant Number: " + isAbundant);

        // Check if deficient number
        boolean isDeficient = isDeficientNumber(number);
        System.out.println("Is Deficient Number: " + isDeficient);

        // Check if strong number
        boolean isStrong = isStrongNumber(number);
        System.out.println("Is Strong Number: " + isStrong);

		// Closing the scanner resource
        input.close();
    }
	
}
