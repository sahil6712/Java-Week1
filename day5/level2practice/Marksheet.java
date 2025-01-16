import java.util.Scanner;

public class Marksheet {
	// Method to get the Marks of PCM
	public static int[][] getMarks(int numberOfStudents) {
		int[][] marks = new int[numberOfStudents][3];
		for(int i=0; i<numberOfStudents; i++) {
			marks[i][0] = (int)(Math.random()*90)+10;   // Physics Score
			marks[i][1] = (int)(Math.random()*90)+10;   // Chemistry Scores
			marks[i][2] = (int)(Math.random()*90)+10;   // Maths Score
		}
		return marks;
	}
	
	 // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][4];  // Total, Average, Percentage and grade

        for (int i = 0; i < marks.length; i++) {
            int sum = marks[i][0] + marks[i][1] + marks[i][2];  // Total marks
            double avg = sum / 3.0;  // Average marks
            double percentage = (sum / 300.0) * 100;  // Percentage

            results[i][0] = sum;
            results[i][1] = Math.round(avg * 100.0) / 100.0;  // Round average to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0;  // Round percentage to 2 decimal places
        }

        return results;
    }

    // Method to calculate the grade based on the percentage
    public static String[] assignGrades(double[][] results) {
        String[] studentGrades = new String[results.length];

        for (int student = 0; student < results.length; student++) {
            double percentage = results[student][2];  // Get the percentage for the student
            if (percentage >= 80) {
                studentGrades[student] = "A+";
            } else if (percentage >= 70) {
                studentGrades[student] = "A";
            } else if (percentage >= 60) {
                studentGrades[student] = "B";
            } else if (percentage >= 50) {
                studentGrades[student] = "C";
            } else if (percentage >= 40) {
                studentGrades[student] = "D";
            } else {
                studentGrades[student] = "R";
            }
        }

        return studentGrades;
    }

    // Method to display the scorecard in a tabular format
    public static void showMarksheet(int[][] marks, double[][] results, String[] studentGrades) {
        System.out.println("---------------------------------------------------------------");
        System.out.println("Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student "+(i+1)+"\t"+marks[i][0]+"\t"+marks[i][1]+"\t"+marks[i][2]+"\t"+results[i][0]+"\t"+results[i][1]+"\t"+results[i][2]+"\t"+studentGrades[i]);
        }

        System.out.println("---------------------------------------------------------------");
    }

	public static void main(String args[]){
	
		int numberOfStudents = 10;
		
		//For getting the marks of student in pcm
		int[][] marks = getMarks(numberOfStudents);  // 0th column -> Physics, 1st -> Chemistry, 2nd -> math
		
		//Call method to get the total Average Percentage
		double[][] result = calculateResults(marks);
		
		// Method for grades
		String[] studentGrades = assignGrades(result);
		
		//Output
		showMarksheet(marks, result, studentGrades);
	
	}
}