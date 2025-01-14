// Question
// Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
// Hint => 
// Create a variable named fee and take user input for fee.
// Create another variable discountPercent and take user input.
// Compute the discount and assign it to the discount variable.
// Compute and print the fee you have to pay by subtracting the discount from the fee.
// I/P => fee, discountPrecent
// O/P => The discount amount is INR ___ and final discounted fee is INR ___

import java.util.Scanner;

public class UniversityDiscountByInput {
    public static void main(String[] args) {

        // creating scanner object and taking input
        Scanner input = new Scanner(System.in);

        int fee = input.nextInt();

        // university discount
        int discountPercent = input.nextInt();

        // discount offer calculation
        double discount = fee / (double)discountPercent;

        // after applying discount the fee that needs to be paid
        int feePay = fee - (int)discount;

        // output
        System.out.println("The discount amount is INR "+ discount +" and final discounted fee is INR " + feePay);

        input.close();
    }
}
