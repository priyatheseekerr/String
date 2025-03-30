//Check if a given string is palindrome or not
import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        int left = word.length() - 1;
        int right = 0;
        boolean flag = true;
        while (right < left) {
            if (word.charAt(right) != word.charAt(left)) {
                flag = false;

                break;
            }
            left--;
            right++;
        }
        if (flag) {
            System.out.println("It is  a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
        sc.close();
    }
}