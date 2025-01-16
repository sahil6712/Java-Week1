import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "Jack", "Queen", "King", "Ace"
    };

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        int numOfCards = SUITS.length * RANKS.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardIndex = (int)(Math.random()*deck.length-1)+1;
            // Swap the current card with a random card
            String temp = deck[i];
            deck[i] = deck[randomCardIndex];
            deck[randomCardIndex] = temp;
        }
        return deck;
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        if (cardsPerPlayer * numPlayers > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }

        String[][] players = new String[numPlayers][cardsPerPlayer];

        int cardIndex = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersAndCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + " has: ");
            for (String card : players[i]) {
                System.out.print(card + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize and shuffle the deck
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);

        // Take user input for number of players and cards per player
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();

        // Distribute the cards
        String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);

        // Print the players and their cards
        if (players != null) {
            printPlayersAndCards(players);
        }

        scanner.close();
    }
}
