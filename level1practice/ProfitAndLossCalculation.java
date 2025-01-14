// Question
// Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
// Hint => 
// Use a single print statement to display multiline text and variables.
// Profit = selling price - cost price
// Profit Percentage = profit / cost price * 100
// I/P => NONE
// O/P => 
// The Cost Price is INR ___ and Selling Price is INR ___
// The Profit is INR ___ and the Profit Percentage is ___


public class ProfitAndLossCalculation {
    public static void main(String[] args) {

        // given cost and selling price
        int costPrice = 129;
        int sellPrice = 191;

        // calculating profit loss
        int profit = sellPrice - costPrice;

        // now in percentage
        float profitPercentage = (float)profit / (float)costPrice * 100;

        // printing the result
        System.out.println("The Cost Price is INR "+ costPrice +" and Sellng Price is INR "+ sellPrice +" \nThe Profit is INR "+ profit +" and the Profit Percentage is "+ profitPercentage);
    }
}
