import java.util.Scanner;

class DistributeChocolate {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Get the number of chocolates and childrens
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Calculate chocolates/child gets and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Output
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);

       
        input.close();
    }
}
