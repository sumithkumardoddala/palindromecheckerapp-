import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Dequepalindronecheckerapp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("UC7: Deque-Based Optimized palindronecheckerapp");
        System.out.print("Input: ");

        String input = sc.nextLine();
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
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