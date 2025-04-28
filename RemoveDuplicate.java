import java.util.Scanner;
//Remove all duplicates from the input string.
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.next();
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (word.indexOf(ch) == -1) {
                word += ch;
            }
        }
        System.out.println(word);
        sc.close();
    }
}
