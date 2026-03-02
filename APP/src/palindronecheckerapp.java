import java.util.Stack;

public class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray())
            stack.push(c);

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }
}