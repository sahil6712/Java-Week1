import java.util.Scanner;

public class AnagramChecker {

    // Method to check weather string is anagram or not
    public static boolean isAnagram(String str1, String str2) {
        //Array for ascii values
        int[] freq = new int[256];
        if(str1.length() != str2.length()) {
            return false;
        }
        else{
            for(int i=0; i<str1.length(); i++) {
                freq[(int)str1.charAt(i)] += 1;
                freq[(int)str2.charAt(i)] -= 1;

            }
            for(int i=0; i<256; i++) {
                if(freq[i] != 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter string1: ");
        String str1 = input.nextLine();

        System.out.println("Enter String 2: ");
        String str2 = input.nextLine();

        // Call method to check the anagram
        boolean result = isAnagram(str1, str2);

        if(result) {
            System.out.println("both the strings are Anagrams of each other");
        }
        else {
            System.out.println("both the strings are not Anagrams");
        }
        input.close();
    }
}
