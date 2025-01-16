import java.util.Scanner;

public class CountVowelsConsonants {

	// Method to check a word is vowel or a consonant
	public static boolean isVowel(char ch) {
		//Coverting character to lowerCase
		if(ch >= 65 && ch <= (65+25)){
			ch = (char)(ch+32);
		}
		
		// Condition for checking ch is a vowel or not
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true; // is a vowel
		}
		else {
			return false; // not a vowel 
		}
	}
	
	// Method to check not a alphabet
	public static boolean isAlphabet(char ch) {
		if(ch >= 65 && ch <= (65+25)){
			ch = (char)(ch+32);
		}
		
		// Condition for checking the charater is alphabet
		if(ch >= 97 && ch <= (97+25)) {
			return true; // is a alphabet
		}
		else {
			return false; // Not a alphabet
		}
	}
	
	// Method to count number of vowels and consonants in a text
	public static int[] getCount(String text) {
		int countVowels = 0;   // Counting vowels
		int countConsonants = 0; // Counting Consonants
		int[] result = new int[2];     // Array to store the result
		
		// iterate through each character to check its a vowel or a consonant
		for(int i=0; i<text.length(); i++) {
			if(isVowel(text.charAt(i))) {
				countVowels++;     // Increment the count of vowels
			}
			else if(isAlphabet(text.charAt(i))) {
				countConsonants++;  // Increment count of consonants
			}
		}
		result[0] = countVowels;        //0th index stores number of vowels
		result[1] = countConsonants;   //1st index stores number of consonanats
		
		return result;
	}

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter the text
		System.out.print("Enter text: ");
		String text = input.nextLine();     //input a text
		
		//Call method to get the result
		int[] result = getCount(text);
		
		//Output
		System.out.println("Number of vowels: "+result[0]); //print number of vowels
		System.out.println("Number of consonants: "+result[1]);
	
		input.close();
	}
}