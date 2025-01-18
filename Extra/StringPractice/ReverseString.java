import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a string
		System.out.print("Enter a String: ");
		String str = input.next();
		
		//length of a string
		int len = str.length();
		
		StringBuilder strReversed = new StringBuilder(str);

		//Reverse string using a loop
		for(int i=0; i<(len/2); i++){
			char c = strReversed.charAt(len-i-1);
			strReversed.setCharAt(len-i-1, strReversed.charAt(i));
			strReversed.setCharAt(i, c);
		}
		
		//Result 
		System.out.print("Reversed string is "+strReversed);
	
		input.close();
	}
}