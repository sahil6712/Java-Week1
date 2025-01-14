import java.util.Scanner;

class TemperatureConversion {

    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for the temperature in Celsius
        System.out.println("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Output
        System.out.println("The "+celsius+" celsius is "+fahrenheitResult+" fahrenheit");

        input.close();
    }
}
