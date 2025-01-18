import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateCompare {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter Date(yyyy-MM-dd): ");
        String strDate1 = input.nextLine();

        System.out.print("Enter Date(yyyy-MM-dd): ");
        String strDate2 = input.nextLine();

        // Formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Convert string to date
        LocalDate date1 = LocalDate.parse(strDate1, formatter);
        LocalDate date2 = LocalDate.parse(strDate2, formatter);

        // Checks
        if(date1.isBefore(date2)) {
            System.out.print("Date "+date1+" is before date "+date2);
        }
        else if(date1.isAfter(date2)) {
            System.out.print("Date "+date1+" is After date "+date2);
        }
        else {
            System.out.print("Date "+date1+" is equal to date "+date2);
        }


        input.close();
    }
}
