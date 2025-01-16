import java.util.Scanner;

public class CanVote {

    // Method to take input for student ages
    public static int[] getAgesForStudents(int totalStudents, Scanner scanner) {
        int[] studentAges = new int[totalStudents];
        
        // Getting age of each Student
        for (int i = 0; i < totalStudents; i++) {
            System.out.print("Enter age of Student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }
        
        return studentAges;
    }

    // Method to check if students can vote or not
    public static String[][] checkVotingEligibility(int[] studentAges) {
        String[][] eligibilityStatus = new String[studentAges.length][2]; // For each student, age and eligibility status
        
        // Check each student's age
        for (int i = 0; i < studentAges.length; i++) {
            if (studentAges[i] < 0) {
                eligibilityStatus[i][0] = "Invalid Age";  // Invalid age if it's negative
                eligibilityStatus[i][1] = "Cannot Vote";
            } else {
                eligibilityStatus[i][0] = String.valueOf(studentAges[i]);
                if (studentAges[i] >= 18) {
                    eligibilityStatus[i][1] = "Can Vote";
                } else {
                    eligibilityStatus[i][1] = "Cannot Vote";
                }
            }
        }
        
        return eligibilityStatus;
    }

    // Method to display results in a tabular format
    public static void displayEligibilityResults(String[][] eligibilityStatus) {
        System.out.println("----------------------------------------------------------");
        System.out.println("Student\tAge\t\tCan Vote");
        System.out.println("----------------------------------------------------------");
        
        // Display each student's age and voting eligibility
        for (int i = 0; i < eligibilityStatus.length; i++) {
            System.out.println("Student " + (i + 1) + "\t" + eligibilityStatus[i][0] + "\t\t" + eligibilityStatus[i][1]);
        }
        
        System.out.println("----------------------------------------------------------");
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalStudents = 10;  // number of students

        // Prompt the user to Enter age
        System.out.println("Enter the age of 10 students:");
        int[] studentAges = getAgesForStudents(totalStudents, scanner);
        
        // Checking voting eligibility
        String[][] eligibilityStatus = checkVotingEligibility(studentAges);
        
        // Display the results
        displayEligibilityResults(eligibilityStatus);

        scanner.close();  // Close the scanner
    }
}
