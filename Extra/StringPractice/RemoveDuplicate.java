import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a string
		System.out.print("Enter a String: ");
		String str = input.next();
		
		int len = str.length(); //lenght of a string
		
		StringBuilder  sb = new StringBuilder();
		
		boolean flag = true;           //togle to repeated or not 
		
		for(int i=0; i<len; i++){          // looping the str string
			flag = true;
			for(int j=0; j<sb.length(); j++){         //iterate sb 
				if(sb.charAt(j) == str.charAt(i)){
					flag = false;
					break;
				}
			}
			if(flag){               //condition for duplicate
				sb.append(str.charAt(i));
			}
		}
		
		//Result
		System.out.println("The string without duplicates is "+sb);
		input.close();
	}
}