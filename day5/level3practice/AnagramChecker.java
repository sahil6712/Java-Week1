import java.util.Scanner;

class AnagramChecker {
    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create an array to store frequency of characters
        int[] frequency = new int[256]; // For ASCII characters

        // Find the frequency of characters in the first text
        for (int i = 0; i < text1.length(); i++) {
            frequency[text1.charAt(i)]++;
        }

        // Subtract the frequency of characters in the second text
        for (int i = 0; i < text2.length(); i++) {
            frequency[text2.charAt(i)]--;
        }

        // Check if all frequencies are zero
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true; // The texts are anagrams
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the the user for input
        System.out.print("Enter the text1: ");
        String text1 = input.nextLine();

        System.out.print("Enter the text2: ");
        String text2 = input.nextLine();

        // Check for anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
		
		input.close();
    }
}
