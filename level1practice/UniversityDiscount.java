// Question
// The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.
// Hint => 
// Create a variable named fee and assign 125000 to it.
// Create another variable discountPercent and assign 10 to it.
// Compute discount and assign it to the discount variable.
// Compute and print the fee you have to pay by subtracting the discount from the fee.


public class UniversityDiscount {
    public static void main(String[] args) {
        // given details
        int fee = 125000;

        // university discount
        int discountPercent = 10;

        // discount offer calculation
        double discount = fee / (double)discountPercent;

        // after applying discount the fee that needs to be paid
        int feePay = fee - (int)discount;

        // output
        System.out.println("Fee after discount is "+ feePay);
    }
}
