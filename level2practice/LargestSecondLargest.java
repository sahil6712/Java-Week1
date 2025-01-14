import java.util.Scanner;

public class LargestSecondLargest {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
	
		//Prompt the user to enter a number
		System.out.println("Enter the number greater than 9: ");
		int number = input.nextInt();
		
		int maxDigits = 10; // store number of digits
		int tempNumber = number; //temporary number for getting digits
		
		//size of array to store digits = numberOfDigits
		int digits[] = new int[maxDigits];
		int index = 0; //Array index
		
		//Storing digits in array
		tempNumber = number; //Reinitialise tempNumber
		while(tempNumber > 0){
			if(index == maxDigits)
				break;
			digits[index] = tempNumber%10;
			tempNumber /= 10;
			index++;
		}
		
		//Largest and Second largest
		int largest = 0;
		int secondLargest = 0;
		for(int i=0; i<index; i++){ 
			if(digits[i] > largest){
				secondLargest = largest;
				largest = digits[i];
			}
			if(digits[i] > secondLargest && digits[i] < largest){
				secondLargest = digits[i];
			}
		}
		
		//Output 
		System.out.println("Largest number is "+largest+"\n"+"Second Largest is "+secondLargest);
		input.close();
	}
}