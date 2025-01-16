import java.util.Scanner;

public class CalendarDisplay {

    // Array to store month names
    private static final String[] MONTH_NAMES = {
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 
                                                 31, 31, 30, 31, 30, 31};

    // Method to get the number of days in a month considering leap years
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        return DAYS_IN_MONTH[month - 1]; // month is 1-indexed
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + 31 * m0 / 12) % 7; // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("      " + MONTH_NAMES[month - 1] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // Print spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day); // Right-justified in a field of width 3
            if ((firstDay + day) % 7 == 0) {
                System.out.println(); // Move to the next line after Saturday
            }
        }
        System.out.println(); // New line after the last row
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

        scanner.close();
    }
}
