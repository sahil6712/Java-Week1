import java.util.Scanner;

class Income {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Prompt enter salary and Bonus
        System.out.println("Enter your salary");
        double salary = input.nextDouble();

        System.out.println("Enter your bonus");
        double bonus = input.nextDouble();

        // Calculate
        double totalIncome = salary + bonus;

        // Output
        System.out.printf("The salary is INR "+salary+" and bonus is INR"+bonus+". Hence Total Income is INR "+totalIncome);

        
        input.close();
    }
}
