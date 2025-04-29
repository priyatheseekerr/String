import java.util.Scanner;
//Change every letter with the next lexicographic alphabet in the given string
public class NextLexicography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'z') {
                System.out.print('a');
            } else if (ch == 'Z') {
                System.out.print('A');
            } else {
                System.out.print((char) (ch + 1));
            }
        }
        sc.close();
    }
}
