// Creating AgeComputation class to determine the age of Harry

public class AgeComputation {
    public static void main(String[] args) {
        // creating a string variable to store name
        String name = "Harry";

        // creating a integer variable to store date of birth
        int dateOfBirth = 2000;

        // creating a integer variable to store the current year 
        int currentYear = 2024;

        // calculating age of subject and storing it in age variable
        int age = currentYear - dateOfBirth;

        // printing the result
        System.out.println(name + "'s age in " + currentYear + " is " + age);
    }
}