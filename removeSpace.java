//Remove spaces from a string
import java.util.Scanner;

public class removeSpace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                System.out.print(word.charAt(i));
            }
        }
        sc.close();
    }
}
