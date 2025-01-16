import java.util.Scanner;

class CharacterFrequencyFinder {
    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        // Create an array to store the frequency of characters
        int[] frequency = new int[256]; // ASCII characters range

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Create an array to store characters and their frequencies
        String[][] result = new String[256][2]; // Max 256 unique characters
        int index = 0;

        // Loop through the frequency array to fill the result
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Character
                result[index][1] = String.valueOf(frequency[i]); // Frequency
                index++;
            }
        }

        // Resize the result array to only include populated entries
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }

        return finalResult;
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
