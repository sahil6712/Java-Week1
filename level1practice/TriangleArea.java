// Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
// Hint => Area of a Triangle is ½ * base * height
// I/P => base, height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // scanner object and I/P
        Scanner input = new Scanner(System.in);

        System.out.println("Enter base and height of triangle");

        int baseCms = input.nextInt();
        int heightCms = input.nextInt();

        // calculation
        double areaInCms = 1.0/2.0 * baseCms * heightCms;

        // 1 sq cms = 0.155 sq in
        double areaInInches = areaInCms / 0.155;

        // output
        System.out.println("Your Area in cm is "+ areaInCms +" and inches is "+ areaInInches);

        input.close();
    }
}
