//FindQuotientRemainder helps in finding Quotient and Remainder

import java.util.Scanner;

class FindQuotientRemainder{

	public static void main(String args[]){

		//Object of scanner class
		Scanner input = new Scanner(System.in);
		
		//prompt for entering number 
		System.out.println("Enter Number1");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		//Calculate Quotient
		int quotient = number1/number2;
		
		//Calculate Remainder
		int remainder = number1%number2;	

		//Output Result
		System.out.println("The Quotient is "+quotient+" and Remainder is "+remainder+" of two number "+number1+" and "+number2);	

		input.close();
	}

}