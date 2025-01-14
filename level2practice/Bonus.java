import java.util.Scanner;

public class Bonus {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
	
		//Define arrays to store the employee's current salary, years of employment, bonus, and updated salary
        double[] currentSalary = new double[10];
        int[] yearsOfEmployment = new int[10];
        double[] employeeBonus = new double[10];
        double[] updatedSalary = new double[10];

       //Variables to calculate the total bonus, total current salary, and total updated salary for all employees
        double totalBonusAmount = 0;
        double totalCurrentSalaryAmount = 0;
        double totalUpdatedSalaryAmount = 0;

       // Loop to gather salary and years of service information for all 10 employees
        for (int i = 0; i < 10; i++) {
            while (true) {
                // Prompt user to enter the salary and years of service
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                currentSalary[i] = input.nextDouble();

                System.out.print("Enter years of employment for employee " + (i + 1) + ": ");
                yearsOfEmployment[i] = input.nextInt();

                // Validate that salary and years of service are positive values
                if (currentSalary[i] > 0 && yearsOfEmployment[i] >= 0) {
                    break; 
                } else {
                    System.out.println("Invalid input. Please enter a positive salary and valid years of service.");
                }
            }
        }

        // Loop to calculate bonus, updated salary, and total salary values
        for (int i = 0; i < 10; i++) {
            // Calculate the bonus based on the years of employment
            if (yearsOfEmployment[i] > 5) {
                employeeBonus[i] = currentSalary[i] * 0.05; // 5% bonus for employees with more than 5 years
            } else {
                employeeBonus[i] = currentSalary[i] * 0.02; // 2% bonus for employees with 5 or fewer years
            }

            // Calculate the updated salary after adding the bonus
            updatedSalary[i] = currentSalary[i] + employeeBonus[i];

            // Accumulate the total bonus, total current salary, and total updated salary
            totalBonusAmount += employeeBonus[i];
            totalCurrentSalaryAmount += currentSalary[i];
            totalUpdatedSalaryAmount += updatedSalary[i];
        }

        // Display the results
        System.out.println("\nTotal Bonus Payout for all employees: " + totalBonusAmount);
        System.out.println("Total Current Salary for all employees: " + totalCurrentSalaryAmount);
        System.out.println("Total Updated Salary for all employees: " + totalUpdatedSalaryAmount);

	
		input.close();
	}
}