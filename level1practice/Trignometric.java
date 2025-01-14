//Trignometric takes angle gives various trignometric functions

import java.util.Scanner;

public class Trignometric {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to input
		System.out.println("Enter Angle(in degree): ");
		double angle = input.nextDouble();
		
		//Convert degree to radians
		double radians = Math.toRadians(angle);
		
		//Diffrent trignometric functions
		double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
		
		//Result
		System.out.print("sine"+radians+" = "+sine+"\n");
		System.out.print("cosine"+radians+" = "+cosine+"\n");
		System.out.print("tangent"+radians+" = "+tangent+"\n");
	
		input.close();
	}
}