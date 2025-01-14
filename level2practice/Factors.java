import java.util.Scanner;

public class Factors {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		//Prompt user to enter a number
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		//loop from 1 to nnumber
		for(int i=1;i<number;i++){
			if(number % i == 0){
				System.out.println(i+" is a factor of "+number);
			}
		}
		input.close();
	}
} 

