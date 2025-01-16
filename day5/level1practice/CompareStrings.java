import java.util.Scanner;

public class CompareStrings {
	
	//Method to check strings are equal using the equals method
	public static boolean isEquals(String str1, String str2) {
	
		return str1.equals(str2);                 //check weather strings equal or not 
	
	}
	
	//Method to check strings are equal using charAt()
	public static boolean isEqualsSecond(String str1, String str2) {
		
		if(str1.length() != str2.length()) {   
			return false;  //Return false if length of strings are diffrent
		}
		else{                            // both strings are of same size
			
			int size = str1.length();    //length of strings
			
			//Looping through the string to compare each character
			for(int i=0; i<size; i++){
				if(str1.charAt(i) != str2.charAt(i)){
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter the strings
		System.out.print("Enter string1: ");
		String str1 = input.next();
		
		System.out.print("Enter string2: ");
		String str2 = input.next();
		
		//Get the result from both methods
		boolean firstMethodResult = isEquals(str1, str2);
		boolean secondMethodResult = isEqualsSecond(str1, str2);
		
		//check for strings
		if(firstMethodResult && secondMethodResult){ //if both the method have the same result
			System.out.print("Both the methods have same result: "+firstMethodResult);
		}
		else{
			System.out.print("Both the methods have diffrent result: ");
		}
	
		input.close();
	}
}