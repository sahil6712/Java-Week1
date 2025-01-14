import java.util.Scanner;

class PoundsToKilograms {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Prompt  for  weight
        System.out.print("Enter weight in pounds ");
        double pounds = input.nextDouble();

        // Convert pounds to kilograms
        double kilograms = pounds * 2.2;

        // Output
        System.out.printf("The weight of the person in pound is "+pounds+" and in kg is "+kilograms);

        input.close();
    }
}
