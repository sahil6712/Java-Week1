import java.util.Scanner;

public class LeapYearSecond {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter year
		System.out.println("Enter year greater then equal to 1582");
		int year = input.nextInt();
		
		//check for century year
		int centuryYearCheck = 400;
		
		//check for normal year
		int yearCheck = 4;
		
		//Checks for leap year
		if((year % 100 == 0 && year % centuryYearCheck == 0) || (year % 100 != 0 && year % yearCheck == 0)){
			System.out.println(year+" is a leap year");	
		}
		else{
			System.out.println(year+" is not a leap year");
		}
		
		input.close();
	}

}