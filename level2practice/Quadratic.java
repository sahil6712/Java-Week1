import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of the quadratic equation ax^2 + bx + c = 0
    public static double[] findRoots(double a, double b, double c) {
	
        // Check if 'a' is zero to avoid division by zero in the quadratic formula
        if (a == 0) {
            System.out.println("The coefficient 'a' cannot be zero for a quadratic equation.");
            return new double[0]; // Not a valid quadratic equation
        }

        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;
       
        // If delta is negative, return an empty array (no real roots)
        if (delta < 0) {
            return new double[0]; // No real roots
        }

        // If delta is zero, there is one real root
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        // If delta is positive, there are two real roots
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
       
        return new double[]{root1, root2};
    }
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the coefficients a, b, and c
        System.out.print("Enter coefficients a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Finding the roots using the findRoots method
        double[] roots = findRoots(a, b, c);

        // Display the roots
        if (roots.length == 0) {
            System.out.println("No real roots exist.");
        } else if (roots.length == 1) {
            System.out.println("The root is: " + roots[0]);
        } else {
            System.out.println("The roots are: " + roots[0] + " and " + roots[1]);
        }

        input.close();
    }
}
