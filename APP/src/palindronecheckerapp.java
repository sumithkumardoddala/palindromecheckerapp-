import java.util.Scanner;

public class Recursivepalindronecheckerapp {

    // Recursive function
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end)
            return true;

        // If characters do not match
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("UC9: Recursive palindronecheckerapp");
        System.out.print("Input: ");

        String input = sc.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result)
            System.out.println("It is a Palindrome.");
        else
            System.out.println("It is NOT a Palindrome.");

        sc.close();
    }
}