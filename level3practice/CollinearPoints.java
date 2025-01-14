import java.util.Scanner;

public class CollinearPoints {

    // Method to check if points are collinear using slopes
    public static boolean checkCollinearityBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes between points
        double slopeBetweenAB = (y2 - y1) / (x2 - x1);
        double slopeBetweenBC = (y3 - y2) / (x3 - x2);
        double slopeBetweenAC = (y3 - y1) / (x3 - x1);

        // If all slopes are the same, the points are collinear
        return (slopeBetweenAB == slopeBetweenBC) && (slopeBetweenBC == slopeBetweenAC);
    }

    // Method to check if points are collinear using area
    public static boolean checkCollinearityByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle formed by the points
        double triangleArea = Math.abs(0.5 * ((x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2))));

        // If the area is zero, the points are collinear
        return triangleArea == 0;
    }

    public static void main(String[] args) {
        // Create scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for the coordinates of the points
        System.out.println("Enter coordinates for point 1 (x1 y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter coordinates for point 2 (x2 y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.println("Enter coordinates for point 3 (x3 y3): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Checking collinearity using slope method
        if (checkCollinearityBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear (checked using slope method).");
        } else {
            System.out.println("The points are not collinear (checked using slope method).");
        }

        // Checking collinearity using area method
        if (checkCollinearityByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear (checked using area method).");
        } else {
            System.out.println("The points are not collinear (checked using area method).");
        }

        // Close the scanner object to free up resources
        input.close();
    }
}
