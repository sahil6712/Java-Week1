import java.util.Scanner;

public class Calendar {

    // Array holding the names of the months
    static String[] monthNames = {
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
    };

    // Array containing the number of days in each month
    static int[] daysInEachMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking the month and year as inputs from the user
        System.out.print("Please enter the month (1-12): ");
        int month = input.nextInt();
        System.out.print("Please enter the year: ");
        int year = input.nextInt();

        // Display the calendar for the given month and year
        printCalendar(month, year);

        input.close();
    }

    // Method to print the calendar of the specified month and year
    public static void printCalendar(int month, int year) {
        String monthTitle = getMonthName(month);
        int daysInMonth = getNumberOfDaysInMonth(month, year);
        int firstDayOfMonth = calculateFirstDayOfMonth(month, year);

        // Display the month and year header
        System.out.println(monthTitle + " " + year);
        System.out.println("-----------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print spaces before the first day of the month
        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("    ");
        }

        // Loop through the days of the month and print them with proper formatting
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("%3d ", i);
            if ((i + firstDayOfMonth) % 7 == 0) {
                System.out.println();  // Start a new line after Saturday
            }
        }
        System.out.println();
    }

    // Method to get the name of the month from the month number
    public static String getMonthName(int month) {
        return monthNames[month - 1];
    }

    // Method to get the number of days in a given month and year
    public static int getNumberOfDaysInMonth(int month, int year) {
        // Check for leap year in February
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInEachMonth[month - 1];
    }

    // Method to determine whether a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to calculate the first day of the month using Zeller's Congruence
    public static int calculateFirstDayOfMonth(int month, int year) {
        int adjustedYear = year - (14 - month) / 12;
        int intermediateValue = adjustedYear + adjustedYear / 4 - adjustedYear / 100 + adjustedYear / 400;
        int adjustedMonth = month + 12 * ((14 - month) / 12) - 2;
        int dayOfWeek = (1 + intermediateValue + (31 * adjustedMonth) / 12) % 7;
        return dayOfWeek;
    }
}
