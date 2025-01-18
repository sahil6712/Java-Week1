import java.util.Scanner;

public class MostFrequent {

    // Method to find the most frequent element

    public static char mostFrequent(String str) {

        int[] freqOfCharacter = new int[256];
    
        for(int i=0; i<str.length(); i++) {
            freqOfCharacter[str.charAt(i)] += 1;
        }

        //Make frequency of space 0
        freqOfCharacter[(int)' '] = 0;

        char ch = 's'; // For storing the most frequent character
        int currentMax = 0;
        for(int i=0; i<256; i++) {
            if(freqOfCharacter[i] > currentMax) {
                ch = (char)(i);
                currentMax = freqOfCharacter[i];
            }
        }
        return ch;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a text
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        //Call method to get the most frequen character
        char ch = mostFrequent(str);

        //Result
        System.out.println("The most frequent character is: "+ch);


    }
}
