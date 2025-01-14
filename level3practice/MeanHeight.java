import java.util.Scanner;

public class MeanHeight {
	
	// method to get the sum of height of all players 
	public int getTotal(int[] heights) {
		int total = 0;
		
		for(int i=0; i<11; i++) {
			total += heights[i];
		}
		
		return total;
	}
	
	// get the mean height of the team
	public double getMean(int total) {
		double mean = total / 11.0;
		return mean;
	}
	
	// Method to find the shortes of team
	public int getShortest(int[] heights) {
		int shorter = heights[0];
		
		for(int i=1; i<11; i++) {
			shorter = Math.min(shorter, heights[i]);
		}
		
		return shorter;
	}
	
	// to find tallest of the team
	public int getTallest(int[] heights) {
		int taller = heights[0];
		
		for(int i=1; i<11; i++) {
			taller = Math.max(taller, heights[i]);
		}
		
		return taller;
	}
	
    public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Declaring the height array of size 11
		int[] heights = new int[11];
		
		// Input heights
		System.out.println("Enter the heights of 11 people in range of 150 cm to 250 cm: ");
		for(int i=0; i<11; i++) {
			heights[i] = input.nextInt();
		}
		
		//Object creation
		MeanHeight obj = new MeanHeight();
		
		// method calling 
		int sumOfHeight = obj.getTotal(heights);
		System.out.println("Total of heights: " + sumOfHeight);
		
		double meanOfHeight = obj.getMean(sumOfHeight);
		System.out.println("Mean of heights: " + meanOfHeight);

		int shortestOfHeight = obj.getShortest(heights);
		System.out.println("Shortest of heights: " + shortestOfHeight);
		
		int tallestOfHeight = obj.getTallest(heights);
		System.out.println("Tallest of heights: " + tallestOfHeight);
		
		// Closing the scanner object
		input.close();
	}
	
}