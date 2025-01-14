import java.util.Scanner;

class Swap {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Prompt  for the number1 and number2
        System.out.print("Enter the first number ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number ");
        int number2 = input.nextInt();

        // Swap the numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Output
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        
        input.close();
    }
}
