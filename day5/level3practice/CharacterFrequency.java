import java.util.Scanner;

class CharacterFrequency {
    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        // Convert the string to a character array
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length]; 
        String[] result = new String[characters.length]; 

        // Outer loop to iterate through each character
        for (int i = 0; i < characters.length; i++) {
            if (frequency[i] == 0) {
                frequency[i] = 1; 

                // Inner loop to check for duplicates
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++; // Increment frequency
                        frequency[j] = 0; // Mark duplicate character
                    }
                }
            }
        }

        // Fill the result array with characters and their frequencies
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (frequency[i] > 0) { // Only consider characters with non-zero frequency
                result[index] = characters[i] + ": " + frequency[i];
                index++;
            }
        }

        // Resize the result array to remove unused slots
        String[] finalResult = new String[index];
        for(int i=0; i<result.length; i++) {
			finalResult[i] = result[i];
		}

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find the frequency of characters
        String[] frequencies = findCharacterFrequency(text);

        // Display the result
        System.out.println("Character frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }
		input.close();
    }
}
