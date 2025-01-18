import java.util.Scanner;

public class ReplaceWord {

    // Method to replace the word

    public static String replaceAllWords(String sentence, String replaceWord, String replacingWord) {

        String regex = "[,\\.\\s]";
        // Split the words
        String[] words = sentence.split(regex); // to store the separate words

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < words.length; i++) { // checking every word that are to be replaced
            if (words[i].equals(replaceWord)) {
                words[i] = replacingWord;
            }
            sb.append(words[i] + " "); // Adding words to string builder
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();

        System.out.println("Enter the word that is needed to be replace: ");
        String replaceWord = input.nextLine();

        System.out.println("Enter the word that is repalcing the old word: ");
        String replacingWord = input.nextLine();

        // Call method to replace the words
        String replacedSentence = replaceAllWords(sentence, replaceWord, replacingWord);

        // Sentence after replacing the word is
        System.out.print("Replaced string is: " + replacedSentence);

        input.close();
    }
}
