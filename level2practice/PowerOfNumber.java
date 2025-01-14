import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter a number and power
		System.out.println("Enter number ");
		int number = input.nextInt();
		
		System.out.println("Enter Power");
		int power = input.nextInt();
		
		//for storing the power
		int result = 1;
		
		//looping
		for(int i=1;i<=power;i++){
			result *= number;
		}
		
		//Output
		System.out.println(number+" raise to "+power+" is "+result);
		
		input.close();
	}
}


