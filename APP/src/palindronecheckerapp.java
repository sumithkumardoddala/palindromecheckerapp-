import java.util.Scanner;
import java.util.Stack;

public class Stackpalinronecheckerapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Stack-Based palinronecheckerapp");
        System.out.print("Input: ");

        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare popped characters with original string
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("It is a Palindrome.");
        else
            System.out.println("It is NOT a Palindrome.");

        sc.close();
    }
}
