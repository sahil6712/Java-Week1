// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
// Hint => NA
// I/P => unitPrice, quantity
// O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___

import java.util.Scanner;

public class CalculatePrice {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter the unit price of the item ");
        double unitPrice = input.nextDouble();
        
        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();
        
        // Calculate the total price
        double totalPrice = unitPrice * quantity;
        
        // Display the result in the required format
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
        
        input.close();
    }
}
