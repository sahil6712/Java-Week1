import java.util.Scanner;

class SimpleInterest {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        // Prompt for the Principal, Rate, and Time
        System.out.println("Enter the Principal");
        double principal = input.nextDouble();

        System.out.println("Enter the Rate of Interest");
        double rate = input.nextDouble();

        System.out.println("Enter the Time period in years");
        double time = input.nextDouble();

        // Calculate Simple Interest 
        double simpleInterest = (principal * rate * time) / 100;

        // Output
        System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time
);

        input.close();
    }
}
