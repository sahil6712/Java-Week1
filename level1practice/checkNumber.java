import java.util.Scanner;

public class  checkNumber {

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		
		//Size of array
		int size = 5;
		
		//array of numbers
		int numbers[] = new int[size];
		
		//Prompt user to enter elements of array
		System.out.println("Enter elements ");
		for(int i=0; i<size; i++){
			numbers[i] = input.nextInt();
		}
		
		//loop for checking numbers
		for(int i=0; i<size; i++){
			if(numbers[i] > 0){
				if(numbers[i] % 2 == 0){
					System.out.println(numbers[i]+" is even");
				}
				
				else{
					System.out.println(numbers[i]+" is Odd");
				}
			}
			
			else if(numbers[i] == 0){
				System.out.println("Zero");
			}
			
			else{
				System.out.println("Negative Number");
			}
		}
		//Comparing First and last
		if(numbers[0] > numbers[size-1]){
			System.out.println("First element is greater than last");
		}
		else if(numbers[0] == numbers[size-1]){
			System.out.println("First element is equal to last");
		}
		else{
			System.out.println("First element is less than last");
		}
		
		input.close();		

	}
}