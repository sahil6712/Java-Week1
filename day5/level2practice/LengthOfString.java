import java.util.Scanner;

public class LengthOfString {
	//Method to find the length of a string 
	public static int getLength(String str) {
		
		int index = 0; //to iterate through index
		int count = 0; //Getting the length 
		while(true){ //ITerating until there is a character 
			try{
				str.charAt(index); //This will throw exception
				count++;
				index++;
			}
			catch(RuntimeException e){
				System.out.print("StringIndexOutOfBounds exception: ");
				return count;           
			}
		}
	}

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter a string 
		System.out.println("Enter a string");
		String str = input.next();
		
		//Call user-defined the method to get the length
		int lengthUserDefined = getLength(str);
		
		//Get the length from pre defined function
		int lengthPreDefined = str.length();
		
		//Result
		System.out.print("The output of a predefined method is: "+lengthPreDefined);
		System.out.print("The output of a user-defined method is: "+lengthUserDefined);
	
		input.close();
	}
}