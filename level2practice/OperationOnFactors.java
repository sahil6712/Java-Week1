import java.util.Scanner;

public class OperationOnFactors {
	
	// Method to get the factors
	public static int[] getFactors(int number){
		
		//array for storing the factors
		int maxSize = 10;  //initial array size
		int factors[] = new int[maxSize];
		int index = 0;
			
		int tempNumber = number-1; // temporary variable to store the number to iterate
		
		while(tempNumber > 0){
			if(number % tempNumber == 0){
				if(index == maxSize){
					maxSize *= 2;
					int temp[] = new int[maxSize];  // temp array for storing no.of elements greater than maxSize
					//copy data to temp
					for(int i=0; i<index; i++){
						temp[i] = factors[i];
					}
					factors = temp; // Referencing the new array
				}
			
			factors[index] = tempNumber;
			index++;
			}
			tempNumber--; // Decrementing the tempNumber
		}
		return factors;
	}

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to input
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
		//Calling method to get the factors
		int factors[] = OperationOnFactors.getFactors(number);
		
		//Sum of factors
		int sumOfFactors = 0;
		
		for(int i=0; i<factors.length; i++){
			sumOfFactors += factors[i];    //sum of factors
		}
		
		double sumOfSquareOfFactors = 0;
		
		for(int i=0; i<factors.length; i++){
				sumOfSquareOfFactors += Math.pow(factors[i], 2); // Sum of square of factors
		}
		
		//Product of factors
		int productOfFactors = 1;
		
		for(int i=0; i<factors.length; i++){
			productOfFactors *= factors[i];
		}
		
		//Result
		System.out.print("The factors are: ");
		for(int i=0; i<factors.length; i++){
			if(factors[i] == 0) 
				break;
			System.out.print(factors[i]+" "); //Print factors
		}
		
		System.out.print("Sum of the Factors is "+sumOfFactors+"\n");
		System.out.print("Sum of the Factors square is "+sumOfFactors+"\n");
		
		input.close();
	}
}