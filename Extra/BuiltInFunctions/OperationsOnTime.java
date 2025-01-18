import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OperationsOnTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // formatter for input
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = input.nextLine();
        
        // String to date format
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Operations on date
        
        LocalDate resultDate = date.plusDays(7);     
        resultDate = date.plusMonths(1);  
        resultDate = date.plusYears(2);  

        resultDate = resultDate.minusWeeks(3);      

        // Result
        System.out.println("Resulting date after arithmetic: " + resultDate);

        input.close();
    }
}
