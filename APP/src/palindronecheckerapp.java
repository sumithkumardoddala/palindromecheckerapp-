import java.util.*;

public class PalindromePerformance {

    public static boolean iterative(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--))
                return false;
        }
        return true;
    }
    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray())
            stack.push(c);
        for (char c : str.toCharArray())
            if (c != stack.pop())
                return false;
        return true;
    }
    public static boolean dequeMethod(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray())
            deque.addLast(c);
        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast())
                return false;
        return true;
    }
    public static boolean recursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("UC13: Palindrome Performance Comparison");
        System.out.print("Input: ");
        String input = sc.nextLine();
        input = input.toLowerCase().replaceAll("\\s+", "");

        long start, end;
        start = System.nanoTime();
        iterative(input);
        end = System.nanoTime();
        long iterativeTime = end - start;
        start = System.nanoTime();
        stackMethod(input);
        end = System.nanoTime();
        long stackTime = end - start;
        start = System.nanoTime();
        dequeMethod(input);
        end = System.nanoTime();
        long dequeTime = end - start;
        start = System.nanoTime();
        recursive(input, 0, input.length() - 1);
        end = System.nanoTime();
        long recursiveTime = end - start;
        System.out.println("\nExecution Time (nanoseconds):");
        System.out.println("Iterative: " + iterativeTime);
        System.out.println("Stack:     " + stackTime);
        System.out.println("Deque:     " + dequeTime);
        System.out.println("Recursive: " + recursiveTime);

        sc.close();
    }
}