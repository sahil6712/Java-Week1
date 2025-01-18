import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user  to enter string
		System.out.print("Enter the string: ");
		String str = input.next();
		
		//lenght of a string
		int len = str.length();
		
		//Check for palindrome
		for(int i=0;i <len/2; i++){
			if(str.charAt(i) != str.charAt(len-i-1)){
				System.out.print("given string is not a palindrome");
				return;
			}
		}
		System.out.print("given string is a palindrome");
		input.close();
	}
}