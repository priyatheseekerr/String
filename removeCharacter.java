//Remove characters from a string except alphabets
import java.util.Scanner;

public class removeCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String word = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                result.append(ch);
            }
        }
        System.out.println(result);
        sc.close();
    }
}
