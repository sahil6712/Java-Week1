import java.util.Scanner;

public class GreatestFactor {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter a number
		System.out.println("Enter number");
		int number = input.nextInt();
		
		//Current greatest factor value
		int greatestFactor = 1;
		
		//loop
		for(int i = number-1; i>1; i--){
			if(number % i == 0){
				greatestFactor = i;
				break;
			}
		}
		
		System.out.println("Greatest Factor is "+greatestFactor);
		
		input.close();

	}
}