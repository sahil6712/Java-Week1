import java.util.Scanner;

public class IsLeapYear {

	//method to check the year
	public static boolean checkLeapYear(int year) {
	
		//Checks for leap year
		if(year % 100 != 0 && year % 4 == 0){
			return true;                       // Check for not a ccentury year
		}
		else if(year % 400 == 0) {
			return true;                       // For Century Years
		}
		else
			return false;                      //not a leap year
	}

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a number 
		System.out.print("Enter the year(year >= 1582): ");
		int year = input.nextInt();
		
		//Calling the method
		boolean isLeapYear = IsLeapYear.checkLeapYear(year); //checking the year is leap or not
		
		//Result
		if(isLeapYear){
			System.out.print(year+" is a leap year");
		}
		else{
		System.out.print(year+" not a leap year");
		}
	
		input.close();
	}
}