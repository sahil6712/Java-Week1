//CopyTwoDInOneD is a class that takes 2d array and copies it into 1d array

import java.util.Scanner;

public class CopyTwoDInOneD {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
			
		// Prompt the user to enter number of rows and columns
        System.out.println("Enter number of rows");
        int rows = input.nextInt();
		
        System.out.println("Enter number of columns");
        int columns = input.nextInt();

        // Create a 2D matrix 
        int[][] matrix = new int[rows][columns];

        // Input for array
        System.out.println("Enter the elements:");
        for (int i = 0; i < rows; i++) {
			System.out.println("Enter elements of row "+i);
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // create one dimensional array
        int[] oneDimensionalArray = new int[rows * columns];

        // Initial array variable
        int idx = 0;

        // Copy elements of 2d to 1d
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                oneDimensionalArray[idx] = matrix[i][j];
                idx++;  
            }
        }

        // Print the 1D array
        
        for (int i = 0; i < oneDimensionalArray.length; i++) {
            System.out.print(oneDimensionalArray[i] + " ");
        }
	
		
		input.close();
	}
}