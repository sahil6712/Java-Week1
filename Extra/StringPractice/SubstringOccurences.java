import java.util.Scanner;

class SubstringOccurences {

	// Method to find number of substring occurences
	public static int getSubstringOccurences(String text, String subString) {

		// To store number of occurences
		int count = 0;

		// Getting the length of subString
		int lenSubstring = subString.length();

		for (int i = 0; i <= text.length() - lenSubstring; i++) {
			if (subString.equals(text.substring(i, (i + lenSubstring)))) {   // For comparing the substrings
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a substring
		System.out.print("Enter text: ");
		String text = input.nextLine();

		System.out.print("Enter substring to find in the text: ");
		String subString = input.nextLine();

		// Call Mehtod to get the number of occurences of a substring
		int numberOfOccurences = getSubstringOccurences(text, subString);

		// Output
		System.out.println("Number of occurences of given string into text is: " + numberOfOccurences);

		input.close();
	}
}