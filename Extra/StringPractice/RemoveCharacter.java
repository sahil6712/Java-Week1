import java.util.Scanner;

public class RemoveCharacter {

    // Method to remove the character 
    public static String removeCharacter(String word, char ch) {

        StringBuilder sb = new StringBuilder(""); // To store the remove character word

        char[] characters = word.toCharArray();
        for(int i=0; i<characters.length; i++) {
            if(characters[i] >= 65 && characters[i] <= 90) { // Letter is an capital letter
                if(ch != (char)(characters[i]+32)) {
                    sb.append(characters[i]);
                }
            }
            else if(ch != characters[i]){
                sb.append(characters[i]);
            }
        }
        return sb.toString();      // Converting StringBuilder to string
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        System.out.print("Enter a Character need to be removed: ");
        char ch = input.next().charAt(0);

        if(ch >= 65 && ch <= 90 )
            ch = (char)(ch+32);   //lowercase
        // Call method to remove the character from the word
        String updatedString = removeCharacter(word, ch);

        //Result
        System.out.println("The Word after removing the character is: "+updatedString);


        input.close();
    }
}
