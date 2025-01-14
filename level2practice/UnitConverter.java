import java.util.Scanner;

public class UnitConverterSecond {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yardsToFeet = 3;
        return yards * yardsToFeet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feetToYards = 1.0 / 3;
        return feet * feetToYards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double metersToInches = 39.3701;
        return meters * metersToInches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchesToMeters = 0.0254;
        return inches * inchesToMeters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inchesToCentimeters = 2.54;
        return inches * inchesToCentimeters;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.println("Enter value to select unit conversion: ");
        System.out.println("Enter 1 -> (Yards to Feet), 2 -> (Feet to Yards), 3 -> (Meters to Inches), 4 -> (Inches to Meters), 5 -> (Inches to Centimeters)");

        // Input the type of unit conversion
        int typeOfUnitConversion = input.nextInt();

        // Check for valid unit conversion type
        if (typeOfUnitConversion <= 0 || typeOfUnitConversion >= 6) {
            System.out.println("Enter a valid option.");
        } else {
            // Enter the value to be converted
            System.out.print("Enter the value to be converted: ");
            double value = input.nextDouble();

            // Perform the conversion based on user input
            if (typeOfUnitConversion == 1) { // Yards to Feet
                double result = UnitConverter.convertYardsToFeet(value);
                System.out.println(value + " yards = " + result + " feet.");
            } else if (typeOfUnitConversion == 2) { // Feet to Yards
                double result = UnitConverter.convertFeetToYards(value);
                System.out.println(value + " feet = " + result + " yards.");
            } else if (typeOfUnitConversion == 3) { // Meters to Inches
                double result = UnitConverter.convertMetersToInches(value);
                System.out.println(value + " meters = " + result + " inches.");
            } else if (typeOfUnitConversion == 4) { // Inches to Meters
                double result = UnitConverter.convertInchesToMeters(value);
                System.out.println(value + " inches = " + result + " meters.");
            } else { // Inches to Centimeters
                double result = UnitConverter.convertInchesToCentimeters(value);
                System.out.println(value + " inches = " + result + " centimeters.");
            }
        }

        // Close the scanner
        input.close();
    }
}
