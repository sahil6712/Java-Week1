import java.util.Scanner;

class UniqueCharacterFinder {
    // Method to find the length of the string without using String's length() method
    public static int findLength(String text) {
        int length = 0;
        while (true) {
            try {
                // Attempt to access the next character
                text.charAt(length);
                length++;
            } catch (IndexOutOfBoundsException e) {
                // Break the loop when an IndexOutOfBoundsException is thrown
                break;
            }
        }
        return length;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        // Loop to find unique characters
        for (int i = 0; i < length; i++) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find unique characters
        char[] uniqueCharacters = findUniqueCharacters(text);

        // Display the result
        System.out.print("Unique characters in the string: ");
        for (char ch : uniqueCharacters) {
            System.out.print(ch + " ");
        }
    }
}
