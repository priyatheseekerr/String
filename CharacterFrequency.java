import java.util.Scanner;
//Calculate frequency of characters in a string
public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine().toLowerCase();
        boolean[] flag = new boolean[word.length()];
        for (int i = 0; i < word.length(); i++) {
            if (flag[i]) {
                continue;
            }
            char ch = word.charAt(i);
            int count = 1;
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(j) == ch) {
                    flag[j] = true;
                    count++;
                }
            }
            System.out.println(word.charAt(i) + ":" + count);
        }
        sc.close();
    }
}
