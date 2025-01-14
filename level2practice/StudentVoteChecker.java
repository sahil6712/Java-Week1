import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student can vote based on age
    public boolean canStudentVote(int age) {
        // Validate age: if negative, return false (cannot vote)
        if (age < 0) {
            return false;
        }
        // If age is 18 or more, return true (can vote)
        return age >= 18;
    }

    public static void main(String[] args) {
        // Create an object of StudentVoteChecker
        StudentVoteChecker checker = new StudentVoteChecker();
        
       
        int[] ages = new int[10]; // store ages of student
        
        
        Scanner input = new Scanner(System.in);
        
        //to get each student age
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
            
            // Call the canStudentVote method to check if the student can vote
            boolean canVote = checker.canStudentVote(ages[i]);
            
            // Display the result
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        
        // Close the scanner
        input.close();
    }
}
