import java.util.Scanner;

public class LargestSecondLargest2 {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
	
		//Prompt the user to enter a number
		System.out.println("Enter the number greater than 9: ");
		long number = input.nextLong();
		
		int maxDigits = 10; // store number of digits
		long tempNumber = number; //temporary number for getting digits
		
		//size of array to store digits = numberOfDigits
		int digits[] = new int[maxDigits];
		int index = 0; //Array index
		
		//Storing digits in array
		tempNumber = number; //Reinitialise tempNumber
		while(tempNumber > 0){
			if(index == maxDigits){
				int temp[] = new int[maxDigits * 2];
				for(int i=0; i<maxDigits; i++){
					temp[i] = digits[i];   //copying array
				}
				digits = temp;   //pointing to new array
			}
				
			digits[index] = (int)tempNumber%10;
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