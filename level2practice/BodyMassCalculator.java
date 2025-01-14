import java.util.Scanner;

public class BodyMassCalculator {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter weight and height
		System.out.println("Enter weight in kg");
		double weight = input.nextDouble();
		
		
		System.out.println("Enter height in cm");
		double height = input.nextDouble();
		
		//Convert height in cm to meters
		double heightInMeters = height/100;
		
		//Calculate Bmi using formula
		double bmi = weight/(heightInMeters * heightInMeters);
		
		//Weight Status of Person based on bmi
		if(bmi <= 18.4)
			System.out.println("Underweight");
		else if(bmi <= 24.9) 
			System.out.println("Normal");
		else if(bmi <= 39.9)
			System.out.println("overWeight");
		else
			System.out.println("Obese");
		
		input.close();

	}
}