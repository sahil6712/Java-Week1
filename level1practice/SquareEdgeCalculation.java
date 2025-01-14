//Write a program to find the side of the square whose parameter you read from user 
//Hint => Perimeter of Square is 4 times side
//I/P => perimeter
//O/P => The length of the side is ___ whose perimeter is ____

import java.util.*;

public class SquareEdgeCalculation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter perimeter of square");
		
		int parameterSq = input.nextInt();
		
		// Perimeter of Square is 4 times side
		double sideSq = (double)parameterSq / 4;
		
		// output
		System.out.println("The length of the side is "+ sideSq +" whose perimeter is "+ parameterSq);
		
		input.close();
		
	}
}