//Sum of the numbers in a String
import java.util.Scanner;

public class sumOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            int ch = word.charAt(i) - '1';
            sum += ch;
        }

        System.out.println(sum);
        sc.close();

    }
}
