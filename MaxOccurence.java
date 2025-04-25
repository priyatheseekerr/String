import java.util.Scanner;
// Return maximum occurring character in the input string
public class MaxOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String word = sc.nextLine();
        int len = word.length();
        int max = 0;
        char letter = ' ';

        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);
            int count = 1;

            for (int j = i + 1; j < len; j++) {
                if (ch == word.charAt(j)) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                letter = ch;
            }
        }

        System.out.println("Maximum occurring character: " + letter);
        sc.close();
    }
}
