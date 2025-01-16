import java.util.Scanner;

public class TrimString {
	// Create a method to trim the String
	public static int[] getTrimedString(String text) {
		int start = 0; //To store the index where trimed string starts
		int end = text.length();  //To store the index where trimed string ends
		
		int idx = 0;
		while(idx < text.length() && text.charAt(idx) == ' ') {   // To get the start
			start++;
			idx++;
		}
		idx = text.length()-1;    // Reinitialized idx to get the end
		while(idx >= 0 && text.charAt(idx) == ' ') {
			end--;
			idx--;
		}
		
		int[] result = new int[2];   //To Store start and end 
		result[0] = start; 
		result[1] = end;
		return result;
	}
	
	//Method to get sub string
	public static String subString(int start, int end, String text) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=start; i<end; i++) {
			sb.append(text.charAt(i));
		}
		return sb.toString();
	}
	
	//Method to comapre the string trimed from predefined function and from userdefined function
	public static boolean compare(String str1, String str2) {
		if(str1.length() != str2.length()) { // If length of string diffrent then they are not equal
			return false; 
		}
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i) != str2.charAt(i)) // If any character not equal then also strings are not equal
				return false;                     
		}
		return true;
	}
	
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter the text
		System.out.println("Enter text: ");
		String text = input.nextLine();
		
		//get the start and end of trimed array by calling the method
		int[] trimIndex = getTrimedString(text);   // 0th index - start,    1st index - end index.
		
		//Call method to get the string 
		String str1 = subString(trimIndex[0], trimIndex[1], text);
		
		//String using trim 
		String str2 = text.trim();
		
		// Call the method to compare the strings
		boolean isEqual = compare(str1, str2);  
		
		//Output
		if(isEqual) {
			System.out.print("Both the strings from predefined and userdefined methods are equal: ");
		}
		else {
			System.out.print("Strings from both methods are diffrent");
		}
	System.out.print("String from trim: "+str2+"\n String from userdefined method: "+str1);
	
		input.close();
	}
}