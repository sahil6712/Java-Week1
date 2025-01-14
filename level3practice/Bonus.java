import java.util.Random;

public class Bonus {
	
		public static double[][] getEmployeeData(int numEmployees) {
        // 2D array declaration [salary, yearsOfService]
        double[][] data = new double[numEmployees][2];

        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = (int)(Math.random() * 100000);
			data[i][1] = (int)(Math.random() * 10);
		}

        return data;
    }

    public static double[][] calculateBonus(double[][] employeeData) {
        double[][] newData = new double[employeeData.length][3]; 
		
        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02; 
			double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            newData[i][0] = salary;
            newData[i][1] = newSalary;
            newData[i][2] = bonus;
        }

        return newData;
    }

    public static void displayResults(double[][] employeeData) {
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s\n", "Old Salary", "Bonus", "New Salary");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            System.out.printf("%-15.2f %-15.0f %-15.2f\n",employeeData[i][0], employeeData[i][2], employeeData[i][1]);
        }

        System.out.println("------------------------------------------------------------------");
    }
	
    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employeeData = getEmployeeData(numEmployees);
        double[][] bonusData = calculateBonus(employeeData);

        displayResults(bonusData);

        // Calculate and display total amounts
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        for (double[] data : bonusData) {
            totalOldSalary += data[0];
            totalNewSalary += data[1];
            totalBonus += data[2];
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus Amount: " + totalBonus);
    }
	
}