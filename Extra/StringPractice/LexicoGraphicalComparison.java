import java.util.Scanner;

public class LexicoGraphicalComparison {

    // Method to compare lexico graphical comparision, Return true if str1 is lexicographically smaller
    public static boolean isBefore(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        String temp1 = str1.toLowerCase();
        String temp2 = str2.toLowerCase();
        for(int i=0; i<minLength; i++) {
            if(temp1.charAt(i) < temp2.charAt(i)) {
                return true;
            }
        }
        if(minLength == str1.length()) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        //Prompt the user to get the input
        System.out.println("Enter string1: ");
        String str1 = input.nextLine();

        System.out.println("Enter string2: ");
        String str2 = input.nextLine();

        //call a  method to get the lexicographically smaller string
        boolean isString1 = isBefore(str1, str2);

        if(isString1) {
            System.out.println("String 1 is lexico graphically smaller: "+str1);
        }
        else {
            System.out.println("String 2 is lexico graphically smaller: "+str2);
        }
    }
}
