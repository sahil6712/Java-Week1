import java.util.Scanner;

public class BMI {
	
	// Method to Calculate the bmi
	public static void calculateBMI(int persons, double[][] personRecord ) {
		
		// Calculating BMI of each person
		for(int i=0; i<persons; i++) {
			personRecord[i][2] = personRecord[i][0] / (personRecord[i][1] * personRecord[i][1]);
		}	
	}
	
	//Method to get the status
	
	public static void bmiStatus(int persons, String[] status, double[][] personRecord) {
		
		//Status based on BMI
		for(int i=0; i<persons; i++) {
			String weightStatus;
				if (personRecord[i][2] < 18.5) {
						weightStatus = "Underweight";
				} else if (personRecord[i][2] >= 18.5 && personRecord[i][2] <= 24.9) {
						weightStatus = "Normal";
				} else if (personRecord[i][2] >= 25.0 && personRecord[i][2] <= 39.9) {
            		weightStatus = "Overweight";
				} else {
					weightStatus = "Obese";
				}

			status[i] = weightStatus;
		}        

        // Display the weight status
    for(int i=0; i<persons; i++) {
		System.out.println("Person having weight of " + personRecord[i][0] + " and height of " + personRecord[i][1] + " m have bmi equals: " + personRecord[i][2] + " and his weight Status is: " + status[i]);
	}
		
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	// Prompt the user to enter number of person
	System.out.println("Enter the number of person");
	int persons = input.nextInt();

    // Declare array for weight and height of each person
    double[][] personRecord = new double[persons][3];
	String[] status = new String[persons];

    // Input height in cm
    System.out.println("Enter weight (in kg) and height (in m) of each person: ");
	for(int i=0; i<persons; i++) {		
		for(int j=0; j<2; j++) {
			personRecord[i][j] = input.nextDouble();
		}
	} 
	
	//Call the method 
	calculateBMI(persons, personRecord);
	
	//Get the status
	bmiStatus(persons, status, personRecord);

        input.close();
    }
}