import java.util.Scanner;

public class splitText3 {
	
	// Method to split a string into words
	public static String[] splitText(String str) { 
		// Count the number of words by splitting the string by spaces
		int countWords = str.split("\\s").length;

		// Store the result in an array of strings
		String[] result = new String[countWords]; 
		int index = 0;
		
		// Iterate over the input string to extract each word
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			StringBuilder sb = new StringBuilder();
			
			// Continue appending characters until a space is encountered (end of word)
			while (i < str.length() && str.charAt(i) != ' ') {      
				sb.append(str.charAt(i));   // Add character to StringBuilder
				i++;                        // Move to next character
				count++;                    // Increment the word length count
			}
			
			// If the word length is greater than 0, store the word in the result array
			if (count > 0) {  
				result[index] = sb.toString(); // Add word to result
				index++;  // Move to the next index in the result array
			}
		}
		// Return the array containing all the words
		return result;
	}
	
	// Method to get the length of each word in the input string
	public static String[][] getWordLength(String[] words) {
		int n = words.length; // Get the number of words

		// Create a 2D array to store words and their corresponding lengths
		String[][] wordLength = new String[n][2];
		
		// Iterate over the words array
		for (int i = 0; i < n; i++) {
			int len = words[i].length(); // Get the length of the current word
			wordLength[i][0] = words[i];        // Store the word
			wordLength[i][1] = String.valueOf(len); // Store the length of the word as a string
		}
		
		// Return the 2D array containing words and their lengths
		return wordLength;
	}
	
	// Method to find the shortest and longest word based on length
	public static String[] shortestLongest(String[][] wordLength) {
		// Initialize variables to track shortest and longest word lengths
		int strShortLength = Integer.MAX_VALUE;  // Set initial shortest length to max integer
		int strLongLength = Integer.MIN_VALUE;   // Set initial longest length to min integer
		String[] result = new String[2];         // Array to store the shortest and longest words (index 0 -> shortest, index 1 -> longest)
		
		// Iterate over the wordLength 2D array to compare word lengths
		for (int i = 0; i < wordLength.length; i++) {
			
			// If current word is shorter than the previously found shortest word, update result
			if (Integer.parseInt(wordLength[i][1]) <= strShortLength) {
				result[0] = wordLength[i][0]; // Store the shortest word
				strShortLength = Integer.parseInt(wordLength[i][1]); // Update the shortest word length
			}
			
			// If current word is longer than the previously found longest word, update result
			if (Integer.parseInt(wordLength[i][1]) >= strLongLength) {
				result[1] = wordLength[i][0]; // Store the longest word
				strLongLength = Integer.parseInt(wordLength[i][1]); // Update the longest word length
			}
		}
		
		// Return the array containing the shortest and longest words
		return result;
	}
	
	public static void main(String args[]) {
	
		// Initialize Scanner to read user input
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a string
		System.out.println("Enter String: ");
		String text = input.nextLine();
		
		// Get the words from the input string by calling splitText method
		String[] words = splitText(text);
		
		// Get the word lengths by calling getWordLength method
		String[][] wordLength = getWordLength(words);
		
		//Output word length 
		for(int i=0; i<wordLength.length; i++){
			System.out.println(wordLength[i][0]+" "+Integer.parseInt(wordLength[i][1]));
		}
		
		// Get the shortest and longest words by calling shortestLongest method
		String[] result = shortestLongest(wordLength);
		
		// Print the shortest and longest words
		System.out.print("The Shortest string of the text is: " + result[0]);
		System.out.print("\nThe Longest String of the text is: " + result[1]);
		
		// Close the Scanner object to prevent resource leaks
		input.close();
	}
}
