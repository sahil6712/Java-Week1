import java.util.Scanner;

public class LineEquationCalculator {
	
	
    // Method to compute the Euclidean distance between two points
    public static double computeDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the slope and y-intercept of the line
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate the slope of the line (m)
        double slope = (y2 - y1) / (x2 - x1);
        // Calculate the y-intercept of the line (b)
        double intercept = y1 - slope * x1;

        // Return slope and y-intercept in an array
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get input for the coordinates of two points
        System.out.print("Enter the x-coordinate of the first point (x1): ");
        double x1 = input.nextDouble();
        System.out.print("Enter the y-coordinate of the first point (y1): ");
        double y1 = input.nextDouble();
        System.out.print("Enter the x-coordinate of the second point (x2): ");
        double x2 = input.nextDouble();
        System.out.print("Enter the y-coordinate of the second point (y2): ");
        double y2 = input.nextDouble();

        // Calculate the distance between the points
        double distance = computeDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance between the points: " + distance);

        // Calculate the equation of the line
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double intercept = lineEquation[1];
        System.out.println("The equation of the line is: y = " + slope + "x + " + intercept);

        // Close the scanner to avoid resource leak
        input.close();
    }

}
