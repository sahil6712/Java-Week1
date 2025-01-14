import java.util.Scanner;

public class ThreeFriends {

    // Method to find the youngest person
    public static String findYoungest(int[] age, String[] names) {
        int minAge = age[0];
        String youngest = names[0];

        for (int i = 1; i < 3; i++) {
            if (age[i] < minAge) {
                minAge = age[i];
                youngest = names[i];
            }
        }
        return youngest;
    }

    // Method to find the tallest person
    public static String findTallest(double[] height, String[] names) {
        double maxHeight = height[0];
        String tallest = names[0];

        for (int i = 1; i < 3; i++) {
            if (height[i] > maxHeight) {
                maxHeight = height[i];
                tallest = names[i];
            }
        }
        return tallest;
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // Arrays to store age and height for 3 people
        int[] age = new int[3];
        double[] height = new double[3];

        // Names of the people
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Loop to get input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = input.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            height[i] = input.nextDouble();
        }

        // Call method to find the youngest
        String youngest = findYoungest(age, names);

        // Call method to find the tallest
        String tallest = findTallest(height, names);

        // Output the results
        System.out.println("\nYoungest person is " + youngest + ".");
        System.out.println("Tallest person is " + tallest + ".");

        input.close();
    }
}
