import java.util.Scanner;

public class palinedronecheckerapp{
    public static void main(String[] args){
        System.out.println("palindronecheckerapp");
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end){
            if (chars[start] != chars[end]){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome)
            System.out.println("It is a Palindrome.");
        else
            System.out.println("It is NOT a Palindrome.");

        sc.close();
    }
}
