import java.util.Scanner;

public class LongestWord {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter String
		System.out.print("Enter the sentence: ");
		String str = input.nextLine();
		
		//Length of a string
		int len = str.length();
		
		int countWord = 0; //For counting lenght of word in a sentence 
		int maxWord = 0; //Store word with maximum lenght
		
		//loping
		for(int i=0; i<len; i++){
			if(str.charAt(i) == ' '){
				countWord = 0;     //if encounters a space means word has ended
			}
			else{
				countWord++;     //increment the word count
			}
			
			//Store the max word
			if(countWord > maxWord){
				maxWord = countWord;
			}
		}
		
		//Result
		System.out.print("The max word length is "+maxWord);
	
		input.close();
	}
}