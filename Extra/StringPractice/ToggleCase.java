import java.util.Scanner;

public class ToggleCase {

    // Method to toggle the case of String
    public static String toggle(String str) {

        StringBuilder sb = new StringBuilder(str);
        // Iterating through each character of a string to toggle it
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 65 && sb.charAt(i) <= (65 + 25)) { // Toggle uper case letters
                sb.setCharAt(i, (char) (sb.charAt(i) + 32));
            } else if (sb.charAt(i) >= 97 && sb.charAt(i) <= (97 + 25)) { // Toggle lower case letters
                sb.setCharAt(i, (char) (sb.charAt(i) - 32));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter String to toggle the case: ");
        String str = input.nextLine();

        // Call method to toggle the case of a String
        String toggledString = toggle(str);

        //Output
        System.out.println("The toggled string is: "+toggledString);

        input.close();
    }

}
