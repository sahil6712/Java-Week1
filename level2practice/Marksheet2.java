import java.util.Scanner;

public class Marksheet2 {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
	
		    // Input the number of students
        System.out.println("Enter the number of students: ");
        int numStudents = input.nextInt();
    
        // 2D array declaration for storing marks
        int[][] studentMarks = new int[numStudents][3];
        
        // Entering the marks of physics, math, and chemistry for each student
        System.out.println("Enter the marks of physics, math, and chemistry for each student: ");
        for(int i = 0; i < numStudents; i++) {
            for(int j = 0; j < 3; j++)  {
                studentMarks[i][j] = input.nextInt();
            }
        }

        float[] studentPercentage = new float[numStudents];
        char[] studentGrade = new char[numStudents];

        // Calculating percentage of each student
        for(int i = 0; i < numStudents; i++) {
            int totalMarks =  0;
            for(int j = 0; j < 3; j++)  {
                totalMarks += studentMarks[i][j];
            }

            studentPercentage[i] = totalMarks / 3.0f;
        }

        // Assigning grades based on percentage
        for(int i = 0; i < numStudents; i++) {
            if(studentPercentage[i] >= 80) {
                studentGrade[i] = 'A';
            } else if(studentPercentage[i] >= 70) {
                studentGrade[i] = 'B';
            } else if(studentPercentage[i] >= 60) {
                studentGrade[i] = 'C';
            } else if(studentPercentage[i] >= 50) {
                studentGrade[i] = 'D';
            } else if(studentPercentage[i] >= 40) {
                studentGrade[i] = 'E';
            } else {
                studentGrade[i] = 'R';
            }
        }
    
        // Displaying the results for each student
        for(int i = 0; i < numStudents; i++) {
            System.out.print("Student marks in");
            for(int j = 0; j < 3; j++)  {
                if(j == 0) {
                    System.out.print(" physics is: " + studentMarks[i][j]);
                } else if(j == 1) {
                    System.out.print(" and math marks is: " + studentMarks[i][j]);
                } else {
                    System.out.print(" and chemistry marks is: " + studentMarks[i][j]);
                }
            }

            System.out.println(" and percentage is: " + studentPercentage[i] + " and grade obtained is: " + studentGrade[i]);
        }
	
		input.close();
	}
}