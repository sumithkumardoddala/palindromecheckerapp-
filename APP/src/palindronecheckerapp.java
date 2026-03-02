import java.util.Scanner;

public class CaseInsensitivePalindrome {

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("UC10: Case-Insensitive & Space-Ignored Palindrome");
        System.out.print("Input: ");

        String input = sc.nextLine();

        // Normalize string
        String normalized = input
                .toLowerCase()                // ignore case
                .replaceAll("\\s+", "");      // remove spaces

        boolean result = isPalindrome(normalized);

        if (result)
            System.out.println("It is a Palindrome.");
        else
            System.out.println("It is NOT a Palindrome.");

        sc.close();
    }
}