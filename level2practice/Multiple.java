import java.util.Scanner;

public class Multiple {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		//Prompt user to enter a number
		System.out.println("Enter a number Less than 100");
		int number = input.nextInt();
		
		//loop from 1 to nnumber
		for(int i=number-1;i>0;i--){
			if(number % i == 0){
				System.out.println(i+" is a multiple of "+number);
			}
		}
		input.close();
	}
} 

