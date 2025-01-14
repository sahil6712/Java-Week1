//Write a program the find the distance in yards and miles for the distance provided by user in feets
//Hint => 1 mile = 1760 yards and 1 yard is 3 feet
//I/P => distanceInFeet
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___B


import java.util.Scanner;

public class distanceInYardsMiles {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        
        // Conversion factors
        double feetInYard = 3;      
        double yardsInMile = 1760;  
        
        // Convert distance to yards and miles
        double distanceInYards = distanceInFeet / feetInYard;
        double distanceInMiles = distanceInYards / yardsInMile;
        
        // Output the results
        System.out.println("Distance in yards: " + distanceInYards + "\nDistance in miles: " + distanceInMiles);
        
        
        input.close();
    }
}
