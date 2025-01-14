import java.util.Scanner;

public class MarkSheet {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter marks of Subjects
		System.out.println("Enter physics marks");
		int physicsMarks = input.nextInt();
		
		System.out.println("Enter Chemistry marks");
		int chemistryMarks = input.nextInt();
		
		System.out.println("Enter maths marks");
		int mathsMarks = input.nextInt();
		
		//Calculate percentage using formula
		double percentage = ((physicsMarks+chemistryMarks+mathsMarks)/300.0)*100;
		
		//Checks 
		if(percentage >= 80){
			System.out.println("Grade"+" Remark "+"Marks");
			System.out.println("  A  "+" Level4 "+percentage);
		}
		else if(percentage >= 70){
			System.out.println("Grade"+" Remark "+"Marks");
			System.out.println("  B  "+" Level3 "+percentage);
		}
		else if(percentage >= 60){
			System.out.println("Grade"+" Remark "+"Marks");
			System.out.println("  C  "+" Level2 "+percentage);
		}
		else if(percentage >= 50){
			System.out.println("Grade"+" Remark "+"Marks");
			System.out.println("  D  "+" Level1 "+percentage);
		}
		else if(percentage >= 40){
			System.out.println("Grade"+" Remark "+"Marks");
			System.out.println("  E  "+" Level1 "+percentage);
		}
		else{
			System.out.println("Grade"+" Remark "+"Marks");
			System.out.println("  R  "+" Remedial "+percentage);
		}
		input.close();

	}
}