// Create a program to find the maximum number of handshakes among N number of students.
// Hint => 
// Get integer input for numberOfStudents variable.
// Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
// Display the number of possible handshakes.


import java.util.Scanner;

public class MaxHandshakes {

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        

        // Formula: C(n, 2) = n * (n - 1) / 2
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + 
                           " students is: " + maxHandshakes);
        

        input.close();
    }
}
