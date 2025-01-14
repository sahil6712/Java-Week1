import java.util.Scanner;

public class Marksheet {
	public static void main(String[] args) {
		// Creating the scanner object
		Scanner input = new Scanner(System.in);

		
        // Input the number of students
        System.out.println("Enter the number of students: ");
        int numStudents = input.nextInt();
    
        // Array declaration
        int[] physicsScores = new int[numStudents];
        int[] mathScores = new int[numStudents];
        int[] chemistryScores = new int[numStudents];
        
        // Entering the physics marks
        System.out.println("Enter physics marks of each student: ");
        for(int i = 0; i < numStudents; i++) {    
            physicsScores[i] = input.nextInt();
        }

        // Entering the Math marks
        System.out.println("Enter math marks of each student: ");
        for(int i = 0; i < numStudents; i++) {    
            mathScores[i] = input.nextInt();
        }

        // Entering the Chemistry marks
        System.out.println("Enter chemistry marks of each student: ");
        for(int i = 0; i < numStudents; i++) {    
            chemistryScores[i] = input.nextInt();
        }

        float[] percentages = new float[numStudents];
        char[] grades = new char[numStudents];

        // Calculating percentage of each student
        for(int i = 0; i < numStudents; i++) {
            percentages[i] = (physicsScores[i] + mathScores[i] + chemistryScores[i]) / 3.0f;
        }

        // Assigning grades based on percentage
        for(int i = 0; i < numStudents; i++) {
            if(percentages[i] >= 80) {
                grades[i] = 'A';
            } else if(percentages[i] >= 70) {
                grades[i] = 'B';
            } else if(percentages[i] >= 60) {
                grades[i] = 'C';
            } else if(percentages[i] >= 50) {
                grades[i] = 'D';
            } else if(percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Displaying results
        for(int i = 0; i < numStudents; i++) {
            System.out.println("Marks of student in physics, math, and chemistry are: " 
                + physicsScores[i] + " , " + mathScores[i] + " , " + chemistryScores[i] 
                + " and the average is : " + percentages[i] + " and grade obtained is : " + grades[i]);
        }
		
		// Closing scanner object
		input.close();
	}
}