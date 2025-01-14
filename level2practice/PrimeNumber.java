import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter the number
		System.out.println("Enter number");
		int number = input.nextInt();
		
		//Check for prime
		for(int i=2; i<number; i++){
			if(number%i == 0){
				System.out.println(number+" is not a prime number");
				break;
			}
			else if(i == number-1){
				System.out.println(number+" is a prime number");
			}
		}
		input.close();
	}
}