import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String args[]) {

        // Current date
        LocalDate date = LocalDate.now();

        //Different formats 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Output
        System.out.println("Format1: "+date.format(formatter));
        System.out.println("Format2: "+date.format(formatter2));
        System.out.println("Format3: "+date.format(formatter3));

    }
}