import java.util.Scanner;

public class UnitConverterThird {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheitToCelsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsiusToFahrenheit = (celsius * 9 / 5) + 32;
        return celsiusToFahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsToKilograms = 0.453592;
        return pounds * poundsToKilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsToPounds = 2.20462;
        return kilograms * kilogramsToPounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToLiters = 3.78541;
        return gallons * gallonsToLiters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersToGallons = 0.264172;
        return liters * litersToGallons;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.println("Enter value to select unit conversion: ");
        System.out.println("Enter 1 -> (Fahrenheit to Celsius), 2 -> (Celsius to Fahrenheit), 3 -> (Pounds to Kilograms), ");
        System.out.println("Enter 4 -> (Kilograms to Pounds), 5 -> (Gallons to Liters), 6 -> (Liters to Gallons)");

        // Input the type of unit conversion
        int typeOfUnitConversion = input.nextInt();

        // Check for valid unit conversion type
        if (typeOfUnitConversion <= 0 || typeOfUnitConversion >= 7) {
            System.out.println("Enter a valid option.");
        } else {
            // Enter the value to be converted
            System.out.print("Enter the value to be converted: ");
            double value = input.nextDouble();

            // Perform the conversion based on user input
            if (typeOfUnitConversion == 1) { // Fahrenheit to Celsius
                double result = UnitConverterThird.convertFahrenheitToCelsius(value);
                System.out.println(value + " Fahrenheit = " + result + " Celsius.");
            } else if (typeOfUnitConversion == 2) { // Celsius to Fahrenheit
                double result = UnitConverterThird.convertCelsiusToFahrenheit(value);
                System.out.println(value + " Celsius = " + result + " Fahrenheit.");
            } else if (typeOfUnitConversion == 3) { // Pounds to Kilograms
                double result = UnitConverterThird.convertPoundsToKilograms(value);
                System.out.println(value + " pounds = " + result + " kilograms.");
            } else if (typeOfUnitConversion == 4) { // Kilograms to Pounds
                double result = UnitConverterThird.convertKilogramsToPounds(value);
                System.out.println(value + " kilograms = " + result + " pounds.");
            } else if (typeOfUnitConversion == 5) { // Gallons to Liters
                double result = UnitConverterThird.convertGallonsToLiters(value);
                System.out.println(value + " gallons = " + result + " liters.");
            } else { // Liters to Gallons
                double result = UnitConverterThird.convertLitersToGallons(value);
                System.out.println(value + " liters = " + result + " gallons.");
            }
        }

        // Close the scanner
        input.close();
    }
}
