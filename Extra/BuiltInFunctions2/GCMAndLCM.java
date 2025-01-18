import java.util.Scanner;

public class GCMAndLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of two numbers
        System.out.println("Enter 1st number:");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = input.nextInt();

        System.out.println("GCM is: " + getGCM(num1, num2));
        getLCM(num1, num2);

        // Closing the scanner object
        input.close();
    }

    // Method definition of getting LCM
    private static void getLCM(int num1, int num2) {
        int gcm =  getGCM(num1, num2);
        int lcm = (num1 * num2) / gcm;

        System.out.println("LCM of the given number is: " + lcm);
    }

    // Method definition for getting the HCF
    private static int getGCM(int num1, int num2) {
        if(num2 == 0) return num1;

        return getGCM(num2 , num1 % num2);
    }
}
