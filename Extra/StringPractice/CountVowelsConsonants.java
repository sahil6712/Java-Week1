import java.util.Scanner;

public class CountVowelsConsonants {	

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a string 
		System.out.print("Enter String: ");
		String str = input.next();
		
		int countVowel = 0; //used to count number of vowels
		int countConsonants = 0;
		
		//loop the string
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
				countVowel++;             //increment the count if the letter is vowel
		}
		
		countConsonants = str.length()-countVowel;
		
		//Result
		System.out.print("Vowels count = "+countVowel+"\n");
		
		System.out.print("Consonants count = "+countConsonants);
		
		input.close();
	}
}