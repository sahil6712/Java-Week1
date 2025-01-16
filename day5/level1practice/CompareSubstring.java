import java.util.Scanner;
import java.lang.String;

public class CompareSubstring {
	
	// Methods to find substring using substring() method
	public static String getSubstring(int startIdx, int endIdx, String str) {
		
		//Store the substring
		String strSubstring = str.substring(startIdx, endIdx);
		return strSubstring;
	}
	
	//Method to get the substring using loop
	public static String getSubstring2 (int startIdx, int endIdx, String str) {
		
		//Store the substring
		StringBuilder strSubstring = new StringBuilder();
		
		
		// Looping to get the substring 
		for(int i=startIdx; i<endIdx; i++){
			strSubstring.append(str.charAt(i));
		}
		return strSubstring.toString();  // converting string builder to string
	}
	
	// Method to compare substrings
	public static boolean compareStrings(String subString1, String subString2) {
	
		//check both the strings are of same size
		if(subString1.length() != subString2.length())
			return false;
		
		//compare using a loop
		for(int i=0; i<subString1.length(); i++){
			if(subString1.charAt(i) != subString2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a string 
		System.out.print("Enter string: ");
		String str = input.nextLine();
		
		//start index of a string
		System.out.print("Enter start index of an Substring: ");
		int startIdx = input.nextInt();
		
		//get the end index
		System.out.print("Enter end index of Substring: ");
		int endIdx = input.nextInt();
		
		//check for invalid input
		if(startIdx >= str.length() || startIdx <= 0 || endIdx >= str.length() || endIdx <= 0){
			System.out.print("Enter a valid number");
			return;
		}
		
		//method1 result
		String subString1 = getSubstring(startIdx, endIdx, str);
		
		//method2 Result
		String subString2 = getSubstring2(startIdx, endIdx, str);
		
		//method 3 compare substrings
		boolean result = compareStrings(subString1, subString2);
		
		if(result){
			System.out.print("Both generated substring are equal str1: "+subString1+"\n str2: "+subString2);
		}
		else{
			System.out.print("Both generated substring are diffrent str1: "+subString1+"\n str2: "+subString2);
		}
	
		input.close();
	}
}