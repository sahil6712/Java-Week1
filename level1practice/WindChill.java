//WindChill class finds gives windchild Temperature based on temp and winds speed.

import java.util.Scanner;

public class WindChill {
	
	//Method to Calculate WindChill Factor 
	public double calculateWindChill(double temperature, double windSpeed){
		
		//Calculate wind chill using formula windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16 
		double windChill = 35.74 + 0.6215*temperature1 + (0.4275*temperature - 35.75) * Math.pow(windSpeed, 0.16);
		
		return windChill;
	}

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
	
		//Promot the user to enter input
		System.out.println("Enter temperature(in Celsius): ");
		double temperature = input.nextDouble();
		
		System.out.println("Enter wnid Speed(in km/hr): ");
		double windSpeed = input.nextDouble();
		
		//Create the object of the class
		WindChill obj = new WindChill();
		
		//Call function to get the result
		double windChill = obj.calculateWindChill(temperature, windSpeed);
		
		//Result
		System.out.println(" wind chill temperature is "+windChill);
		
		input.close();
	}
}