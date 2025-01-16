import java.util.Scanner;

public class CharacterOfStrings {

	//method to get the character of String
	public static char[] getCharacter(String str) {
	
		//Length of the String
		int len = str.length();
		
		//char array to store output
		char[] charOfString = new char[len];
		
		for(int i=0; i<len; i++){
			charOfString[i] = str.charAt(i);
		}
		
		return charOfString;
	} 
	
	//Method to compare the result
	public static boolean compare(char[] charOfString1, char[] charOfString2) {
		if(charOfString1.length != charOfString2.length){
			return false;
		}
		//Compare usng a loop
		for(int i=0; i<charOfString1.length; i++){
			if(charOfString1[i] != charOfString2[i]){
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		//call the method to get characters
		char[] charOfString1 = getCharacter(str);
		
		//character using predifined method
		char[] charOfString2 = str.toCharArray();
		
		//compare
		boolean isSame = compare(charOfString1, charOfString2);
		
		if(isSame)
			System.out.print("Both the Methods generate the same character");
		else
			System.out.print("Both the Methods Generate diffrent chareacter");
		
		//Result
		System.out.print("Character using loop: ");
		for(int i=0; i<charOfString1.length; i++){
		System.out.print(charOfString1[i]+" ");
		}
		
		System.out.print("\n Character using toCharArray: ");
		for(int i=0; i<charOfString2.length; i++){
		System.out.print(charOfString2[i]+" ");
		}
		
		input.close();
	}
}