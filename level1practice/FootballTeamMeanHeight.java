//This is class used for getting mean height of player

import java.util.Scanner;

public class FootballTeamMeanHeight {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//To get the mean height of all player
		double meanOfHeight;
		
		//Declare array and it size;
		int size = 11;
		double heightOfTeam[] = new double[size];
		
		//Prompt user to get height of players
		System.out.println("Enter height of each player");
		
		//Store sum of height of all player
		double sumOfHeight = 0;  //Assign with 0 initially
		
		for(int i=0; i<size; i++){
			heightOfTeam[i] = input.nextDouble();
			
			//Add height of player to sumOfHeight
			sumOfHeight += heightOfTeam[i]; 
		}
		
		//Getting the mean of height using formula
		meanOfHeight = sumOfHeight/size;
		
		//Output
		System.out.println("Mean Height of Team is "+meanOfHeight);
		
		input.close();
	}
}