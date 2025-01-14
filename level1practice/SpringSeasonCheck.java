// Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
// Hint => 
// Spring Season is from March 20 to June 20

import java.util.*;

public class SpringSeasonCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter month and day : ");
		int month = input.nextInt();
		int day = input.nextInt();
		
		// checking month
		if (month > 3 && month < 6) {
			System.out.println("Its a Spring Season");
		}
		// checking day
		else
		if (month == 3 && day >= 20) {
			System.out.println("Its a Spring Season");
		}else
		if (month == 6 && day <= 20) {
			System.out.println("Its a Spring Season");
		}else {
			System.out.println("Not a Spring Season");
		}
		input.close();
		
	}
}
