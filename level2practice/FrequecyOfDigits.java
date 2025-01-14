import java.util.Scanner;

public class FrequencyOfDigits {
	
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        long userNumber = input.nextLong();

        // Create an array to store the frequency of each digit
        int[] digitCount = new int[10];

        while (userNumber > 0) {
            int currentDigit = (int) (userNumber % 10);
            digitCount[currentDigit]++; 
            userNumber = userNumber / 10; 
        }

        // Output
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > 0) {
                System.out.println("Digit " + i + ": " + digitCount[i] + " times");
            }
        }

       
        input.close();
    }
}
