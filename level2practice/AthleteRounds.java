import java.util.Scanner;

class AthleteRounds {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        // Sides of triangle
        System.out.println("Enter the length of side1");
        double side1 = input.nextDouble();

        System.out.println("Enter the length of side2");
        double side2 = input.nextDouble();

        System.out.println("Enter the length of side3");
        double side3 = input.nextDouble();

        // Calculate the perimeter
        double perimeter = side1 + side2 + side3;

        // Convert 5 kilometers to meter
        double totalDistance = 5000;

        // Calculate rounds 
        double rounds = totalDistance / perimeter;

        System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");

        // Close the scanner to avoid resource leak
        input.close();
    }
}
