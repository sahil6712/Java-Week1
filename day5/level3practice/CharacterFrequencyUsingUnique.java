import java.util.Scanner;

class CharacterFrequencyUsingUnique {
    // Method to find unique characters in a string using charAt()
    public static char[] uniqueCharacters(String text) {
        // Create an array to store unique characters
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;

        // Loop through the text to find unique characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character is already in the uniqueChars array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array of the exact size for unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        // Create an array to store the frequency of characters
        int[] frequency = new int[256]; // ASCII characters range

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Get unique characters from the text
        char[] uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through the unique characters to fill the result array
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Character
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); // Frequency
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the frequency of characters
        String[][] frequencies = findCharacterFrequency(text);

        // Display the result
        System.out.println("Character frequencies:");
        for (String[] entry : frequencies) {
            System.out.println("Character: '" + entry[0] + "' - Frequency: " + entry[1]);
        }
    }
}
