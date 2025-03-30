//Remove all vowels from the string
import java.util.Scanner;

public class removeVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word.length()) {
            char ch = word.charAt(i);
            if ("AEIOUaeiou".indexOf(ch) == -1) {
                result.append(ch);
            }
            i++;
        }
        System.out.println(result);
        sc.close();
    }
}
