import java.util.Scanner;
public class palindronecheckerapp {
    public static void main(String[] args){
        System.out.println("palindronecheckerapp");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        String reversed = "";
        for(int i = input.length() - 1; i >= 0; i--){
            reversed += input.charAt(i);
        }
        if(input.equals(reversed)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
