import java.util.Scanner;

public class SplitText {

	//Get the array of words
	public static String[] splitText(String str) { 
		
	int countWords = str.split("\\s").length; //to get the number of words
	//Store the result
	String[] result = new String[countWords]; 
	int index = 0;
		
	for(int i=0; i<str.length(); i++) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		while(i<str.length() && str.charAt(i) != ' '){      //get the word
			sb.append(str.charAt(i));    //adding character to the sb
			i++;
			count++;     //increment length of word
		}
		if(count > 0){  // when word length>0
			result[index] = sb.toString();
			index++;
		}
	}
	return result;
	}
	//Method to compare the result
	public static boolean compare(String[] word, String[] wordSecond) {
		if(word.length != wordSecond.length)
			return false;         //if length of string of words diffrent then return false;
		for(int i=0;i<word.length; i++){
			if(word[i].equals(wordSecond[i])){
				continue;
			}
			else{
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter a text
		System.out.println("Enter the text: ");
		String text = input.nextLine();
		
		//Call the method to get the words
		String[] words = splitText(text);
		
		//Call pre-defined method to get the words
		String regex = "[,\\s\\.]";
		String[] wordSecond = text.split(regex);
		
		//Compare result from both methods
		boolean result = compare(words, wordSecond);
		if(result){
			System.out.print("Both the methods works same had same output\n");
			for(int i=0; i<words.length; i++) {
				System.out.print(words[i]+" ");
			}
		}
		else{
			System.out.print("Both methods have diffrent output");
		}
		input.close();
	}
}