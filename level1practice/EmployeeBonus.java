// Create a program to find the bonus of employees based on their years of service.
// Hint => 
// Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
// Take salary and year of service in the year as input.
// Print the bonus amount.

import java.util.*;

public class EmployeeBonus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salary = input.nextDouble();
		int year = input.nextInt();
		
		
		// calcuation for bonus
		if (year >= 5) {
			double bonus = (double)(salary * 5.0/100);
			System.out.println("Bonus is :"+ bonus);
		}
		else {
			System.out.println("Bonus is : 0" );
		}
		input.close();
		
	}
}