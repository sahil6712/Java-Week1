import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	// Prompt the user to number of person
	System.out.println("Enter the number of person");
	int persons = input.nextInt();

    // Declare array for weight and height
    double[] weight = new double[persons];
	double[] height = new double[persons];
	double[] bmi = new double[persons];
	String[] status = new String[persons];

        // Input height in cm
        System.out.println("Enter weight of each person");
	for(int i=0; i<persons; i++) {
		weight[i] = input.nextDouble();
	}

	System.out.println("Enter height  of each person: ");
        for(int i=0; i<persons; i++) {
		height[i] = input.nextDouble() / 100;
	}

        // Calculating BMI of each person
        for(int i=0; i<persons; i++) {
		bmi[i] = weight[i] / (height[i] * height[i]);
	}

        // Determine the weight status based on BMI
	for(int i=0; i<persons; i++) {
		String weightStatus;
        	if (bmi[i] < 18.5) {
            		weightStatus = "Underweight";
        	} else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
            		weightStatus = "Normal";
        	} else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
            		weightStatus = "Overweight";
        	} else {
           		weightStatus = "Obese";
        	}

		status[i] = weightStatus;
	}        

        // Display the weight status
        for(int i=0; i<persons; i++) {
		System.out.println("Person having weight of " + weight[i] + " and height of " + height[i] + " m have bmi equals: " + bmi[i] + " and his weight Status is: " + status[i]);
	}

        input.close();
    }
}