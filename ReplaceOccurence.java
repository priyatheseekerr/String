import java.util.Scanner;
//Replace All Occurrences of a Substring
public class ReplaceOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String word = sc.nextLine();
        System.out.println("Enter the character which have to replace:");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the charcter to replace:");
        char element = sc.next().charAt(0);
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                newWord.append(element);
            } else {
                newWord.append(word.charAt(i));
            }
        }
        System.out.println(newWord.toString());
        sc.close();
    }
}
