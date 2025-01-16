import java.util.Scanner;

class FirstUniqueCharacter {
    // Method to find the first non-repeating character in a string
    public static char findFirstUniqueCharacter(String text) {
        // Create an array to store the frequency of characters
        int[] frequency = new int[256]; // ASCII characters range

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Loop through the text again to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; 
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find the first non-repeating character
        char result = findFirstUniqueCharacter(text);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: '" + result + "'");
        } else {
            System.out.println("There is no non-repeating character in the string.");
        }
		
		input.close();
    }
}
