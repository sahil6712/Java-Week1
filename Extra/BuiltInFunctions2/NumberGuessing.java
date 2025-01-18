import java.util.Scanner;

public class NumberGuessing {

    static Scanner input = new Scanner(System.in);

    // Method for getting the user feedback
    private static void getUserFeedback( int computerGuess) {
        System.out.println("Is number "+computerGuess+" equal?(equal, low ,high): ");
        String feedback = input.nextLine().toLowerCase(); // Getting user input in lowercase

        if (feedback.equals("equal")) {

            System.out.println("I am always right! ");

        } else
            getNextGuess(computerGuess, feedback);

    }

    // To get the next gas
    private static void getNextGuess(int prevGuess, String feedback) {

        // Generating the computer guess between 1 and 100
        int nextGuess;
        if (feedback.equals("low")) {
            nextGuess = prevGuess + 1;
            getUserFeedback(nextGuess);
        } else {
            nextGuess = prevGuess - 1;
            getUserFeedback(nextGuess);
        }
    }

    public static void main(String[] args) {

        System.out.println("Guess any number between 1 to 100");
        int firstGuess = 10; // Assuming first guess
        getUserFeedback(firstGuess);

    }

}
