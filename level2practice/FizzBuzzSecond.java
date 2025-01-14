import java.util.Scanner;

public class FizzBuzzSecond {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter a number 
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		//Used in checking the cases
		int check1 = 3;
		int check2 = 5;
		
		//looping
		int i = 3;
		while(i<=number){
			//if number is multiple of 3 and 5
			if(i % check1 == 0 && i % check2 == 0){
				System.out.println("FizzBuzz");
			}
			//if number is divisible of only 3
			else if(i % check1 == 0){
				System.out.println("Fizz");
			}
			//if number is divisible of only 5
			else if(i % check2 == 0){
				System.out.println("Buzz");
			}
			i++; //Increment the loop 
		}
		input.close();
	}
}