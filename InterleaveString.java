import java.util.Scanner;
//Interleave Two Strings
public class InterleaveString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = sc.next();
        String word1 = sc.next();
        int len = Math.min(word.length(), word1.length());
        for (int i = 0; i < len; i++) {
            System.out.print(word.charAt(i) + "" + word1.charAt(i));
        }
        if (word.length() > len) {
            System.out.print(word.substring(len));
        } else if (word1.length() > len) {
            System.out.print(word1.substring(len));
        }
        sc.close();
    }
}
