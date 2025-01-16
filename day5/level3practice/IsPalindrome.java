import java.util.Scanner;

class IsPalindrome {
    
    // Logic 1 Iteration
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2 Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3 Using char arrays
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reverseArray = new char[originalArray.length];

        // Reverse the string
        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Compare original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        // Check for palindrome using all three methods
        boolean iterativeResult = isPalindromeIterative(text);
        boolean recursiveResult = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean charArrayResult = isPalindromeUsingCharArray(text);

        // Display the results
        System.out.println("is palindrome (Iterative): " + iterativeResult);
        System.out.println("is palindrome (Recursive): " + recursiveResult);
        System.out.println("is palindrome (Using Char Array): " + charArrayResult);
		
		input.close();
    }
}
