import java.util.Scanner;
public class palindronecheckerapp {
    public static void main(String[] args){
        System.out.println("palindronecheckerapp");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        boolean isPalindrome = true;
        for(int i = 0; i < input.length() / 2; i++){
            if(input.charAt(i) != input.charAt(input.length() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
