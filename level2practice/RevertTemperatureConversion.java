import java.util.Scanner;

class RevertTemperatureConversion {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Prompt for the temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Output
        System.out.println("The "+fahrenheit+" fahrenheit is "+celsiusResult+" Celsius");

        
        input.close();
    }
}
