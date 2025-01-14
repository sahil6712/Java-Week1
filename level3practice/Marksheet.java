import java.util.Scanner;

public class Marksheet {

	    // Method to generate random scores for each student in three subjects
    public static int[][] generateScores(int studentCount) {
        int[][] scores = new int[studentCount][3]; // 3 subjects: Physics, Chemistry, Math

        for (int student = 0; student < studentCount; student++) {
            scores[student][0] = (int)(Math.random() * 100); // Physics score
            scores[student][1] = (int)(Math.random() * 100); // Chemistry score
            scores[student][2] = (int)(Math.random() * 100); // Math score
        }

        return scores;
    }

    // Method to calculate total marks, average, and percentage for each student
    public static double[][] calculateStudentResults(int[][] scores) {
        int studentCount = scores.length;
        double[][] results = new double[studentCount][3]; // Total, Average, Percentage

        for (int student = 0; student < studentCount; student++) {
            int totalMarks = scores[student][0] + scores[student][1] + scores[student][2];
            double averageMarks = totalMarks / 3.0;
            double percentageMarks = (totalMarks / 300.0) * 100;

            // Store the results for each student
            results[student][0] = totalMarks;
            results[student][1] = Math.round(averageMarks * 100.0) / 100.0;
            results[student][2] = Math.round(percentageMarks * 100.0) / 100.0;
        }

        return results;
    }

    // Method to print the formatted grade report
    public static void printGradeReport(int[][] scores, double[][] results) {
        System.out.println("------------------------------------------------------------");
        System.out.println("Student ID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("------------------------------------------------------------");

        for (int student = 0; student < scores.length; student++) {
            System.out.printf("%d\t\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%n",
                    student + 1, scores[student][0], scores[student][1], scores[student][2], 
                    results[student][0], results[student][1], results[student][2]);
        }

        System.out.println("------------------------------------------------------------");
    }

    public static void main(String[] args) {
        // Create Scanner instance for user input
        Scanner input = new Scanner(System.in);

        // Get the number of students
        System.out.print("Please enter the number of students: ");
        int studentCount = input.nextInt();

        // Generate random scores for the students
        int[][] studentScores = generateScores(studentCount);

        // Calculate results (total, average, percentage)
        double[][] studentResults = calculateStudentResults(studentScores);

        // Output the formatted grade report
        printGradeReport(studentScores, studentResults);

        // Close the scanner resource
        input.close();
    }


}
