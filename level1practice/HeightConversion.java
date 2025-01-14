// Write a program that takes your height in centimeters and converts it into feet and inches
// Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
// I/P => height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        // creating scanner
        Scanner input = new Scanner(System.in);

        float heightInCm = input.nextFloat();

        // conversion to feet and inches
        float heightInInch = heightInCm / (float)2.54;
        
        float heightInFoot = heightInInch / (float)12;
        
        // output
        System.out.println("Your Height in cm is "+ heightInCm +" while in feet is "+ heightInFoot +" and inches is "+ heightInInch);

        input.close();
    }
}
